package com.payworks.comics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.payworks.comics.persistence.SuperHero;
import com.payworks.comics.service.SuperHeroService;

/**
 * 
 * @author dcarao
 *
 */
@Controller
@RequestMapping("/superhero")
public class SuperHeroController {
	
	@Autowired
	SuperHeroService service;

	@RequestMapping(path="/all", method = RequestMethod.GET)
	public @ResponseBody List<SuperHero> getList() {
		return service.getAll();
	}
	
	@RequestMapping(path="/{id}", method = RequestMethod.GET)
	public @ResponseBody SuperHero getDetail(@PathVariable Long id) {
		return service.getDetail(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes ={"application/json"} )
	public @ResponseBody SuperHero add(@RequestBody SuperHero superHero) {
		return service.add(superHero);
	}

}
