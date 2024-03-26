package com.example.EXBonus4.Repositories;

import com.example.EXBonus4.Entity.Spettacolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpettacoloRepository extends JpaRepository<Spettacolo, Long> {
}
