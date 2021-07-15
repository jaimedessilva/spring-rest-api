package com.springrest.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * springrest
 * @author Desenvolvedor
 * 13 de jul de 2021
 * https://github.com/jaimedessilva/
 */

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (length = 100)
	private String nome;
	
	@Column(length = 20)
	private String cpf;
	
	@JsonIgnore
	@OneToMany( mappedBy = "pessoa", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Contato> contatos = new ArrayList<>();
	
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
	public String getCpf() {
		return cpf;
	}

	/** Setter */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/** Getter */
	public List<Contato> getContatos() {
		return contatos;
	}

	/** Setter */
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
}
