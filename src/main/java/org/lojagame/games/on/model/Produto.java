package org.lojagame.games.on.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull (message= "O atributo é Obrigatório")
	private String nome;
	
	@NotNull (message="O atributo preço é Obrigatório")
	private String preco;
	
	@NotNull (message= "O atributo Quantidade é Obrigatório")
	private String quantidade;
	
	@NotNull (message= " O atributo Modelo é Obrigatório")
	private String modelo;
	
	@NotNull (message= "O atributo Acessório é Obrigatório")
	private String acessorio;
	
	@NotNull (message= "O atributo Brinde é Obrigatório")
	private String brinde;
	
	@ManyToOne
	@JsonIgnoreProperties("protudos")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	public String getBrinde() {
		return brinde;
	}

	public void setBrinde(String brinde) {
		this.brinde = brinde;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
