package com.example.boot_bank.config;

import com.example.boot_bank.entity.Card;
import com.example.boot_bank.entity.enumerations.CardStatus;
import com.example.boot_bank.repository.CardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CardConfig {

    @Bean
    CommandLineRunner commandLineRunner(CardRepository cardRepository) {
        return args -> {
            Card card1 = Card.builder()
                    .number("7777 7777 7777 7777")
                    .accountId(1)
                    .pin("7777")
                    .status(CardStatus.ACTIVE).build();
            Card card2 = Card.builder()
                    .number("1234 5678 1234 5678")
                    .accountId(1)
                    .pin("5678")
                    .status(CardStatus.ACTIVE).build();
            Card card3 = Card.builder()
                    .number("4567 1245 7891 2457")
                    .accountId(2)
                    .pin("6478")
                    .status(CardStatus.ACTIVE).build();
            Card card4 = Card.builder()
                    .number("4741 5469 2445 6578")
                    .accountId(3)
                    .pin("5644")
                    .status(CardStatus.BLOCKED).build();
                        cardRepository.saveAll(List.of(card1, card2, card3, card4));
        };
    }
}
