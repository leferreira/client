package br.com.gs3.client.admin.service;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.gs3.client.admin.entity.Cliente;
import br.com.gs3.client.admin.repository.ClienteRepository;
import br.com.gs3.client.admin.service.base.AbstractServiceBase;

/**
 * 
 * @author Leandro
 *
 */
@Service
public class ClienteService extends AbstractServiceBase<Cliente, ClienteRepository> {

	@Override
	public Cliente criar(Cliente entity) {
		try {
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			return getRepository().save(entity);

		} catch (Exception e) {
			logger().error(e.getMessage());
			return null;
		}
	}

	public ResponseEntity<?> update(Integer id, Cliente cliente) {
		return getRepository().findById(id).map(record -> {
			Cliente updated = atualizarCliente(cliente, record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	private Cliente atualizarCliente(Cliente cliente, Cliente record) {
		record.setNome(cliente.getNome());
		record.setCpf(cliente.getCpf());
		record.setEndereco(cliente.getEndereco());
		record.setEmails(cliente.getEmails());
		record.setTelefones(cliente.getTelefones());
		record.setUpdatedAt(new Date());

		return getRepository().save(record);
	}

	public ResponseEntity<?> delete(Integer id) {
		return getRepository().findById(id).map(record -> {
			getRepository().deleteById(id);
			logger().info("Cliente " + record.getNome() + " Foi removido do sistema");
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
