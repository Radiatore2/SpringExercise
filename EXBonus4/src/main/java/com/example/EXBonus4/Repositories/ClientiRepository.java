package com.example.EXBonus4.Repositories;

import com.example.EXBonus4.Entity.Clienti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientiRepository extends JpaRepository<Clienti, Long> {
}
