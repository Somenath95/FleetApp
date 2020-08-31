package io.example.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.example.fleetapp.models.Client;

@Repository
public interface ClientRespository extends JpaRepository<Client, Integer> {

}
