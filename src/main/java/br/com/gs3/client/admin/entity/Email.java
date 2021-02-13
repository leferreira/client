package br.com.gs3.client.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.gs3.client.admin.entity.base.AbstractEntityBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * Classe Email
 * 
 * @author Leandro
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tb_telefone")
public class Email extends AbstractEntityBase<Email> {
	private static final long serialVersionUID = -791194371855804140L;
	
	@Getter
	@Setter
	@Column(name = "email", length = 100)
	private String email;
	
	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id", columnDefinition = "integer")
    private Cliente cliente;

	@Override
	public int compareTo(Email entity) {
		if (this.getEmail().equals(entity.getEmail())) {
			return 1;
		}
		return 0;
	}

}
