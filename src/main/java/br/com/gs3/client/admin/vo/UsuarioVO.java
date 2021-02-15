package br.com.gs3.client.admin.vo;

import br.com.gs3.client.admin.entity.Usuario;
import br.com.gs3.client.admin.enumeration.PerfilEnum;
import br.com.gs3.client.admin.vo.base.AbstractVOBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe UsuarioVO
 * 
 * @author Leandro
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsuarioVO extends AbstractVOBase<Usuario>{

	
	@Getter
	@Setter
	private String login;
	
	@Getter
	@Setter
	private String senha;
	
	@Getter
	@Setter
	private PerfilEnum perfil;
	
	@Override
	public Usuario converter() {
		return new Usuario(this.getLogin(), this.getSenha(), this.getPerfil());
	}

}
