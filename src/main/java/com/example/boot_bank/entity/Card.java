package com.example.boot_bank.entity;


import com.example.boot_bank.entity.enumerations.CardStatus;
import com.example.boot_bank.util.PostgreSQLEnumType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
@TypeDef(name = "enum_postgresql", typeClass = PostgreSQLEnumType.class)
public class Card implements Serializable {
    @Id
    private String number;

    private int accountId;

    @Enumerated(EnumType.STRING)
    @Type(type = "enum_postgresql")
    private CardStatus status;

    private String pin;
}