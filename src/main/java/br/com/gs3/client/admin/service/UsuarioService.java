package br.com.gs3.client.admin.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.gs3.client.admin.entity.Usuario;
import br.com.gs3.client.admin.enumeration.PerfilEnum;
import br.com.gs3.client.admin.repository.UsuarioRepository;
import br.com.gs3.client.admin.service.base.AbstractServiceBase;
import br.com.gs3.client.admin.vo.UsuarioVO;
import br.com.gs3.client.exception.ClientException;

/**
 * 
 * @author Leandro
 *
 */
@Service
public class UsuarioService extends AbstractServiceBase<Usuario, UsuarioRepository> {
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public Usuario criar(Usuario entity) throws Exception {
		try {
			entity.setSenha(passwordEncoder.encode(entity.getSenha()));
			entity.setCreatedAt(new Date());
			entity.setUpdatedAt(new Date());
			return getRepository().save(entity);
		} catch (Exception e) {
			logger().error(e.getMessage());
			throw new ClientException(e.getMessage());
		}
	}

	public Usuario criarUsuarioTeste() {
		try {
			Usuario usuario = new Usuario();
			usuario.setLogin("teste");
			usuario.setSenha("123456");
			usuario.setPerfil(PerfilEnum.ADMIN);
			usuario = criar(usuario);
			return usuario;
		} catch (Exception e) {
			logger().error(e.getMessage());
			e.printStackTrace();
			return null;
		}

	}

	public Usuario login(UsuarioVO usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario findByLogin(String username) {
		return getRepository().findByLogin(username);
	}

	public boolean validarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
