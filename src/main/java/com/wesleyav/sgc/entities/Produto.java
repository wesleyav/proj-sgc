package com.wesleyav.sgc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_produto")
@Data
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long produto_id;

	@Column
	private String nome;

	@Column
	private String descricao;

	@Column
	private Integer quantidade;

	@Column
	private String marca;

	@Column
	private Double preco;

	@ManyToOne
	@JoinColumn(name = "compra_id")
	private Compra compra_id;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria_id;

}
