package com.berkaygulen.akbankbootcamphomework1.repository;

import com.berkaygulen.akbankbootcamphomework1.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country,Long> {
}
