package io.example.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.example.fleetapp.models.Invoice;

@Repository
public interface InvoiceRespository extends JpaRepository<Invoice, Integer> {

}
