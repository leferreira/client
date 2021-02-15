package br.com.gs3.client.cep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.gs3.client.admin.service.base.AbstractServiceBase;
import br.com.gs3.client.admin.vo.EnderecoVO;

/**
 * Classe ViaCepClient
 * 
 * @author Leandro
 *
 */
@Component
public class ViaCepClient {
	
	private static final Logger logger = LoggerFactory.getLogger(AbstractServiceBase.class);
	
	
	public EnderecoVO buscaEnderecoPorCep(String cep){
        RestTemplate template = new RestTemplate();
        logger.info("CEP consultado :::"+ cep);
        return template.getForObject(getUrlViaCep(cep),EnderecoVO.class, cep);
    }
	
	
	public String getUrlViaCep(String cep) {
		return "https://viacep.com.br/ws/" + cep +"/json";
	}
}
