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
                        cardRepository.saveAll(List.of(card1, card2));
        };
    }
}
