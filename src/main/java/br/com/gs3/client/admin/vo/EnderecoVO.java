package br.com.gs3.client.admin.vo;

import br.com.gs3.client.admin.entity.Endereco;
import br.com.gs3.client.admin.vo.base.AbstractVOBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Classe EnderecoVO
 * @author Leandro
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EnderecoVO extends AbstractVOBase<Endereco>{

	@Getter
	@Setter
	private String cep;
	
	@Getter
	@Setter
    private String logradouro;
	
	@Getter
	@Setter
    private String complemento;
	
	@Getter
	@Setter
    private String bairro;
    
	@Getter
	@Setter
	private String localidade;
    
	@Getter
	@Setter
    private String uf;
    
	@Override
	public Endereco converter() {
		Endereco endereco = new Endereco();
		endereco.setCep(this.getCep());
		endereco.setLogradouro(this.getLogradouro());
		endereco.setComplemento(this.getComplemento());
		endereco.setBairro(this.getBairro());
		endereco.setCidade(this.getLocalidade());
		endereco.setUf(this.getUf());
		return endereco;
	}

}
