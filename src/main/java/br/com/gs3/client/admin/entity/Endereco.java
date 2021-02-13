package br.com.gs3.client.admin.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import br.com.gs3.client.admin.entity.base.AbstractEntityBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe Endereco
 * 
 * @author Leandro
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_endereco")
public class Endereco extends AbstractEntityBase<Endereco> {

	private static final long serialVersionUID = -2471311677201788000L;
	
	@Getter
	@Setter
	@Column(name = "cep", length = 8)
	@NotBlank(message = "O CEP é obrigatório")
	private String cep;
	
	@Getter
	@Setter
	@Column(name = "logradouro", length = 100)
	@NotBlank(message = "O logradouro é obrigatório")
	private String logradouro;
	
	@Getter
	@Setter
	@Column(name = "complemento", length = 1000, nullable = true)
	private String complemento;
	
	@Getter
	@Setter
	@Column(name = "bairro", length = 100)
	@NotBlank(message = "O bairro é obrigatório")
	private String bairro;
	
	@Getter
	@Setter
	@Column(name = "cidade", length = 100)
	@NotBlank(message = "A cidade é obrigatório")
	private String cidade;
	
	@Getter
	@Setter
	@Column(name = "uf", length = 2)
	@NotBlank(message = "A UF é obrigatório")
	private String uf;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cliente_id", columnDefinition = "integer")
	private Cliente cliente;
	

	@Override
	public int compareTo(Endereco arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
