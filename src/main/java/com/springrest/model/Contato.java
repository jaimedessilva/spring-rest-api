package com.springrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column(length = 100, nullable = false)
	private String nome;
	
	@NotBlank
	@Column(length = 20)
	private String telefone;
	
	@NotBlank
	@Column(length = 60)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private Pessoa pessoa;

	/** Getter */
	public Long getId() {
		return id;
	}

	/** Setter */
	public void setId(Long id) {
		this.id = id;
	}

	/** Getter */
	public String getNome() {
		return nome;
	}

	/** Setter */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/** Getter */
	public String getTelefone() {
		return telefone;
	}

	/** Setter */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/** Getter */
	public String getEmail() {
		return email;
	}

	/** Setter */
	public void setEmail(String email) {
		this.email = email;
	}

	/** Getter */
	public Pessoa getPessoa() {
		return pessoa;
	}

	/** Setter */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
