package io.example.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.example.fleetapp.models.Country;


public interface CountryRepository extends JpaRepository<Country, Integer> {

}
