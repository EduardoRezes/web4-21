package br.com.cineclube.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cineclube.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
	// findAll, findById, get, save, delete

}
