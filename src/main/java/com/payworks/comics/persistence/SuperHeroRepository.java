package com.payworks.comics.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author dcarao
 *
 */
@Repository
public interface SuperHeroRepository extends CrudRepository<SuperHero, Long> {
 
}
