package com.wesleyav.sgc.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_estabelecimento")
@Data
public class Estabelecimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long estabelecimento_id;

	@Column
	private String nome;
		
	@OneToMany(mappedBy = "estabelecimento_id")
	private List<Compra> compras = new ArrayList<>();
}
