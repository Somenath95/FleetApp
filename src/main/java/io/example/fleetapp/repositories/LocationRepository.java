package io.example.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.example.fleetapp.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
