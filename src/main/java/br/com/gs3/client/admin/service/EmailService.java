package br.com.gs3.client.admin.service;

import org.springframework.stereotype.Service;

import br.com.gs3.client.admin.entity.Email;
import br.com.gs3.client.admin.repository.EmailRepository;
import br.com.gs3.client.admin.service.base.AbstractServiceBase;

/**
 * 
 * @author Leandro
 *
 */
@Service
public class EmailService extends AbstractServiceBase<Email, EmailRepository> {  

	@Override
	public Email criar(Email entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
