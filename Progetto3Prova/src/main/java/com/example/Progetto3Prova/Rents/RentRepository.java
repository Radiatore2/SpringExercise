package com.example.Progetto3Prova.Rents;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends JpaRepository<Rent, Long> {
}
