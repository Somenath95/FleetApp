package io.example.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.example.fleetapp.models.State;
import io.example.fleetapp.repositories.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	//Return list of countries
	public List<State> getStates() {
		return stateRepository.findAll();
	}
	
	//Save new state from UI
	public void saveState(State state) {
		stateRepository.save(state);
	}
	
	//State get by ID
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}
	
	public void delete(int id) {
		stateRepository.deleteById(id);
	}
}
