package com.wesleyav.sgc.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleyav.sgc.entities.Estabelecimento;
import com.wesleyav.sgc.repositories.EstabelecimentoRepository;

@RestController
public class EstabelecimentoController {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private EstabelecimentoRepository estabelecimentoRepository;

	@GetMapping("/estabelecimentos")
	public List<Estabelecimento> buscaEstabelecimentos() {
		return estabelecimentoRepository.findAll();

	}

}
