package br.com.gs3.client.admin.service;

import org.springframework.stereotype.Service;

import br.com.gs3.client.admin.entity.Usuario;
import br.com.gs3.client.admin.repository.UsuarioRepository;
import br.com.gs3.client.admin.service.base.AbstractServiceBase;

/**
 * 
 * @author Leandro
 *
 */
@Service
public class UsuarioService extends AbstractServiceBase<Usuario, UsuarioRepository> {

	@Override
	public Usuario criar(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}