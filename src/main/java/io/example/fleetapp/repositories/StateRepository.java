package io.example.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.example.fleetapp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
