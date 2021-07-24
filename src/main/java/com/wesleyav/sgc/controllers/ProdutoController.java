package com.wesleyav.sgc.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleyav.sgc.entities.Produto;
import com.wesleyav.sgc.repositories.ProdutoRepository;

@RestController
public class ProdutoController {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public List<Produto> buscaProdutos() {
		return produtoRepository.findAll();
	}
}
