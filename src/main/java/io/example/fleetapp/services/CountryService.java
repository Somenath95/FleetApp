package io.example.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.example.fleetapp.models.Country;
import io.example.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	//Return list of countries
	public List<Country> getCountries() {
		return countryRepository.findAll();
	}
	
	//Save new country from UI
	public void saveCountry(Country country) {
		countryRepository.save(country);
	}
}
