package com.example.boot_bank.repository;

import com.example.boot_bank.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {

    List<Card> findByAccountId(int accountId);

}
