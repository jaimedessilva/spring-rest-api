package com.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.model.Pessoa;

/**
 * springrest
 * @author Desenvolvedor
 * 14 de jul de 2021
 *  https://github.com/jaimedessilva/
 */

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{ }
