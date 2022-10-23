package com.example.endofthegame.entity;

import com.example.endofthegame.entity.enumeration.IncomeCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Income{
    @Id
        Long id;
        IncomeCategory category;
        String currency;
        BigDecimal amount;
        String person;
        ZonedDateTime timeStamp;
}
