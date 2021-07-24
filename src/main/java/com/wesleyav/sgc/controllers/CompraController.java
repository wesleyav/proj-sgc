package com.wesleyav.sgc.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleyav.sgc.entities.Compra;
import com.wesleyav.sgc.repositories.CompraRepository;

@RestController
public class CompraController {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private CompraRepository compraRepository;

	@GetMapping("/compras")
	public List<Compra> buscaCompras() {
		return compraRepository.findAll();
	}
}
