package br.com.gs3.client.admin.service;

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
public class ClienteService extends AbstractServiceBase<Cliente, ClienteRepository>{

	@Override
	public Cliente criar(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
