package com.springrest.model.service;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.model.Pessoa;
import com.springrest.model.exception.EntidadeNaoEncontradaException;
import com.springrest.repository.PessoaRepository;

/**
 * springrest
 * @author Desenvolvedor
 * 14 de jul de 2021
 *  https://github.com/jaimedessilva/
 */

@Service
public class PessoaService {
	
	private PessoaRepository pessoaRepository;

	@Autowired
	public PessoaService(PessoaRepository pessoaRepository) {
		super();
		this.pessoaRepository = pessoaRepository;
	}
	
	//GET
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
	
	//GET
	public Pessoa getPessoa(Long id) {
		return findOrFail(id);
	}
	
	//POST
	public Pessoa salvarPessoa (Pessoa p) {
		p.getContatos().forEach(c -> c.setPessoa(p));
		return pessoaRepository.save(p);
	}
	
	//PUT
	public Pessoa atualizarPessoa(Long id, Pessoa p) {

		Pessoa pessoaSalva = findOrFail(id);
		
		pessoaSalva.getContatos().clear();
		
		pessoaSalva.getContatos().addAll(p.getContatos());
		
		pessoaSalva.getContatos().addAll(p.getContatos());
		
		BeanUtils.copyProperties(p, pessoaSalva, "id", "contatos");

		return pessoaRepository.save(pessoaSalva);
	}
	
	//DELETE
	public void deletarPessoa(Long id) {
		Pessoa p = findOrFail(id);
		pessoaRepository.delete(p);
	}
	
	
	private Pessoa findOrFail(Long id) {
		return pessoaRepository.findById(id)
				.orElseThrow(()-> new EntidadeNaoEncontradaException("Pessoa não Localizada"));
	}
	

}
