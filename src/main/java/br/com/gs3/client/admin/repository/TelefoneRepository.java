package br.com.gs3.client.admin.repository;

import org.springframework.stereotype.Repository;

import br.com.gs3.client.admin.entity.Telefone;
import br.com.gs3.client.admin.repository.base.AbstractRepositoryBase;

/**
 * 
 * @author Leandro
 *
 */
@Repository
public interface TelefoneRepository extends AbstractRepositoryBase<Telefone, Integer> {

}
