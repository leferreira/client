package br.com.gs3.client.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gs3.client.admin.entity.Endereco;
import br.com.gs3.client.admin.repository.EnderecoRepository;
import br.com.gs3.client.admin.service.base.AbstractServiceBase;
import br.com.gs3.client.admin.vo.EnderecoVO;
import br.com.gs3.client.cep.ViaCepClient;

/**
 * 
 * @author Leandro
 *
 */
@Service
public class EnderecoService extends AbstractServiceBase<Endereco, EnderecoRepository> {

	@Autowired
	private ViaCepClient client;

	@Override
	public Endereco criar(Endereco entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public EnderecoVO buscarEnderecoPorCep(String cep) {
		try {
			if (cep.length() == 8) {

				EnderecoVO enderecoVO = client.buscaEnderecoPorCep(cep);
				if (enderecoVO != null) {
					return enderecoVO;
				}
				logger().error("CEP " +cep+ " não encontrado ");
			}
			logger().error("CEP com tamanho fora do padrão :: " + cep);

		} catch (Exception e) {
			logger().error(e.getMessage());
		}
		return null;
	}

	public Endereco criarEndereco(EnderecoVO endereco) {
		return getRepository().save(endereco.converter());
	}

}
