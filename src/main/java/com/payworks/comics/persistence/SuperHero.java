package com.payworks.comics.persistence;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author dcarao
 *
 */
@Entity
public class SuperHero {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	private String pseudonym;
	private String publisher;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Power> powers;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Ally> allies;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date firstAppearance;
	
	
	
	public List<Power> getPowers() {
		return powers;
	}
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPseudonym() {
		return pseudonym;
	}
	public void setPseudonym(String pseudonym) {
		this.pseudonym = pseudonym;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public List<Ally> getAllies() {
		return allies;
	}
	public void setAllies(List<Ally> allies) {
		this.allies = allies;
	}
	public Date getFirstAppearance() {
		return firstAppearance;
	}
	public void setFirstAppearance(Date firstAppearance) {
		this.firstAppearance = firstAppearance;
	}
	
	
}
