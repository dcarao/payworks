package com.payworks.comics.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.payworks.comics.persistence.SuperHero;
import com.payworks.comics.service.SuperHeroService;

/**
 * 
 * @author dcarao
 *
 */

@Ignore
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class SuperHeroControllerTest {
	
    @Autowired
	private MockMvc mvc;

	@MockBean
	private SuperHeroService service;
	

	@Test
	public void testGetList() throws Exception {

		given(this.service.getAll()).willReturn(new ArrayList<SuperHero>());
		
		this.mvc.perform(get("/all").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk()).andExpect(content().string("[]"));
	}
}
