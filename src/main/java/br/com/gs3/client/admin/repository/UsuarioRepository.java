package br.com.gs3.client.admin.repository;

import org.springframework.stereotype.Repository;

import br.com.gs3.client.admin.entity.Usuario;
import br.com.gs3.client.admin.repository.base.AbstractRepositoryBase;

/**
 * 
 * @author Leandro
 *
 */
@Repository
public interface UsuarioRepository extends AbstractRepositoryBase<Usuario, Integer> {

	Usuario findByLogin(String username);

}
