package br.com.gs3.client.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.gs3.client.admin.entity.base.AbstractEntityBase;
import br.com.gs3.client.admin.enumeration.PerfilEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe Usuário
 * 
 * @author Leandro
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_usuario")
public class Usuario extends AbstractEntityBase<Usuario> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4140946496309330274L;

	@Getter
	@Setter
	@Column(name = "login", length = 50, unique = true)
	@NotBlank(message = "O Login é obrigatório")
	private String login;
	
	@Getter
	@Setter
	@Column(name = "senha", length = 150)
	@NotBlank(message = "A Senha é obrigatório")
	@Size(min = 6, message ="A senha deve conter pelo menos 6 caracteres" )
	private String senha;
	
	@Getter
	@Setter
	@Column(name = "perfil", length = 50)
	@Enumerated(EnumType.STRING)
	private PerfilEnum perfil;
	
	@Override
	public int compareTo(Usuario entity) {
		if (this.getLogin().equals(entity.getLogin()) && this.getPerfil().equals(entity.getPerfil())) {
			return 1;
		}
		return 0;
	}

}
