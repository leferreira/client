package br.com.gs3.client.admin.repository;

import org.springframework.stereotype.Repository;

import br.com.gs3.client.admin.entity.Email;
import br.com.gs3.client.admin.repository.base.AbstractRepositoryBase;

/**
 * 
 * @author Leandro
 *
 */
@Repository
public interface EmailRepository extends AbstractRepositoryBase<Email, Integer> { 

}
