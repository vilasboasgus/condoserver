package com.condoserver.moradorservice.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.condoserver.moradorservice.domain.Condominio;
import com.condoserver.moradorservice.domain.Morador;
import com.condoserver.moradorservice.repository.CondominioRepository;
import com.condoserver.moradorservice.repository.MoradorRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "condominio")
public class CondominioController {

	@Autowired
	CondominioRepository condominioRepository;

	@ApiOperation(value = "Lista um condominio especifico")
	@GetMapping(value = "/condominios/{idCondominio}")
	public Condominio findByidCondominio(@PathVariable Integer idCondominio) {
		return condominioRepository.findAllByidCondominio(idCondominio);
	}

	@ApiOperation(value = "Cadastra um novo condominio")
	@PostMapping(value = "/condominios")
	public Condominio createCondominio(@RequestBody Condominio condominio) {
		
		return condominioRepository.save(condominio);
	}	
	
}
