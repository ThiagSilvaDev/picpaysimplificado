package com.thiagsilvadev.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiagsilvadev.picpaysimplificado.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
