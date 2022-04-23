package com.example.boot_bank.controller;

import com.example.boot_bank.entity.Card;
import com.example.boot_bank.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/api/v1/cards")
    public List<Card> getCards() {
        return cardService.getCards();
    }

    @GetMapping("/accounts/{accountId}/cards")
    public List<Card> getCardsByAccountId(@PathVariable String accountId) {
        return cardService.getCardsByAccountId(List.of(accountId));
    }
}
