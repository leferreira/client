package br.com.gs3.client.admin.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.com.gs3.client.admin.entity.base.AbstractEntityBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe Cliente
 * 
 * @author Leandro
 *
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_cliente")
public class Cliente extends AbstractEntityBase<Cliente> {
	private static final long serialVersionUID = -6871046071230103252L;
	
	
	@Getter
	@Setter
	@Column(name = "nome", length = 100)
	@NotBlank(message = "O nome é obrigatório")
	@Size(min = 3, max = 100, message = "O nome deve conter pelo menos 3 caracteres e no máximo 100 caracteres")
	private String nome;
	
	@Getter
	@Setter
	@Column(name = "cpf", length = 11, unique = true)
	@NotBlank(message = "O CPF é obrigatório")
	private String cpf;
	
	@Getter
	@Setter
	@OneToOne(mappedBy = "cliente")
	private Endereco endereco;
	
	@Getter
	@Setter
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	private List<Telefone> telefones;
	
	@Getter
	@Setter
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Email> emails;
	
	

	@Override
	public int compareTo(Cliente entity) {
		if (this.getCpf().equals(entity.getCpf())) {
			return 1;
		}
		return 0;
	}

}
