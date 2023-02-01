package org.lojagame.games.on.model;
	

	import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	import javax.validation.constraints.NotBlank;
	import javax.validation.constraints.Size;

	import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity
	@Table(name ="tb_categoria")
	public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message ="O nome é Obrigatório")
		@Size(min=10, max=100, message= "O nome da categoria deve ter no minimo 10 caracteres e no maximo 100 caracteres")
		private String categoriaProduto;
		
		@NotBlank(message=" preco obrigatório")
		@Size(min=10, max=100, message="O preco deve ter no minino 10 caracteres e no maximo 100 caracteres")
		private String preco;
		
		@OneToMany(mappedBy= "categoria", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCategoriaProduto() {
			return categoriaProduto;
		}

		public void setCategoriaProduto(String categoriaProduto) {
			this.categoriaProduto = categoriaProduto;
		}

		public String getPreco() {
			return preco;
		}

		public void setPreco(String preco) {
			this.preco = preco;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		
	}

