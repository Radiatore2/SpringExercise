package com.example.Progetto3Prova.Purchase;

import com.example.Progetto3Prova.Orders.Orders;
import com.example.Progetto3Prova.Purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
	@Query(value = "SELECT * FROM purchase  WHERE u.status = 1", nativeQuery = true)
	List<Orders> findByDatePurchase(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);
}
