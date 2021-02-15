package br.com.gs3.client.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gs3.client.admin.controller.base.AbstractControllerBase;
import br.com.gs3.client.admin.entity.Endereco;
import br.com.gs3.client.admin.service.EnderecoService;
import br.com.gs3.client.admin.vo.EnderecoVO;

/**
 * Classe EnderecoController
 * @author Leandro
 *
 */
@RestController
@CrossOrigin
public class EnderecoController extends AbstractControllerBase<EnderecoService>{
	

	@GetMapping("/cep")
	public  @ResponseBody EnderecoVO buscarEnderecoPorCep(String cep) { 
		return getService().buscarEnderecoPorCep(cep);
	}
	
	
	@PostMapping("/criar-endereco")
	public  @ResponseBody Endereco criarEndereco(@RequestBody EnderecoVO endereco) { 
		return getService().criarEndereco(endereco);
	}
}
