package com.wesleyav.sgc.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wesleyav.sgc.entities.Usuario;
import com.wesleyav.sgc.repositories.UsuarioRepository;

@RestController
public class UsuarioController {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/usuarios")
	public List<Usuario> buscaUsuarios() {
		return usuarioRepository.findAll();
	}
}
