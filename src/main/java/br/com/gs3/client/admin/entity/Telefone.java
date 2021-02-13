package br.com.gs3.client.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gs3.client.admin.entity.base.AbstractEntityBase;
import br.com.gs3.client.admin.enumeration.TipoTelefoneEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * Classe Telefone
 * 
 * @author Leandro
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_telefone")
public class Telefone extends AbstractEntityBase<Telefone> {

	private static final long serialVersionUID = 3103486282728719396L;
	
	@Getter
	@Setter
	@Column(name = "numero", length = 10)
	private String numero;
	
	@Getter
	@Setter
	@Column(name = "ddd", length = 2)
	private String ddd;
	
	@Getter
	@Setter
	@Column(name = "tipo_telefone", length = 12)
	@Enumerated(EnumType.STRING)
	private TipoTelefoneEnum tipoTelefone;
	
	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", columnDefinition = "integer")
	private Cliente cliente;
	

	@Override
	public int compareTo(Telefone entity) {
		if (this.getNumero().equals(entity.getNumero()) && this.getDdd().equals(entity.getDdd())) {
			return 1;
		}
		return 0;
	}

}
