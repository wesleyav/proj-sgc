package com.wesleyav.sgc.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_compra")
@Data
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long compra_id;

	@Column
	private Instant data;

	@Column
	private Double valor_total;

	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario_id;

	@ManyToOne
	@JoinColumn(name = "estabelecimento_id")
	private Estabelecimento estabelecimento_id;

	@OneToMany(mappedBy = "compra_id")
	private List<Produto> produtos = new ArrayList<>();

}
