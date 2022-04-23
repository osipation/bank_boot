package com.example.boot_bank.service;

import com.example.boot_bank.entity.Card;
import com.example.boot_bank.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CardService {

    private final CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> getCards() {
        return cardRepository.findAll();
    }

    public List<Card> getCardsByAccountId(List<String> accountIds) {
        return Collections.emptyList();
    }
}
