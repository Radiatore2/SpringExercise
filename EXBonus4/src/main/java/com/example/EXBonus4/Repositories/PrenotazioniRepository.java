package com.example.EXBonus4.Repositories;

import com.example.EXBonus4.Entity.Prenotazioni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazioni, Long> {
}
