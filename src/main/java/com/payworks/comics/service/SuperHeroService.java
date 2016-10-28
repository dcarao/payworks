package com.payworks.comics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.payworks.comics.persistence.SuperHero;
import com.payworks.comics.persistence.SuperHeroRepository;

/**
 * 
 * @author dcarao
 *
 */
@Service
public class SuperHeroService {

	@Autowired
	SuperHeroRepository repository;

	public List<SuperHero> getAll() {
		return Lists.newArrayList(repository.findAll());
	}

	public SuperHero getDetail(Long id) {
		return repository.findOne(id);
	}

	public SuperHero add(SuperHero superHero) {
		return repository.save(superHero);
	}

	
}
