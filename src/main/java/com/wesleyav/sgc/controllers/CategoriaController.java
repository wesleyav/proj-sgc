package com.wesleyav.sgc.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleyav.sgc.entities.Categoria;
import com.wesleyav.sgc.repositories.CategoriaRepository;

@RestController
public class CategoriaController {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping("/categorias")
	public List<Categoria> buscaCategorias() {
		return categoriaRepository.findAll();
	}
}
