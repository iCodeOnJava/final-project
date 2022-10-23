package com.example.endofthegame.service;

import com.example.endofthegame.entity.Income;
import com.example.endofthegame.repository.IncomesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //or @Service, odin huy
@Slf4j
public class IncomesService {
    private final IncomesRepository repository;

    public IncomesService(IncomesRepository repository) {
        this.repository = repository;
    }

    public List<Income> readAllIncomes() {
//        List<Income> result = repository.findAll();
        var incomesFromDB = repository.findAll();
        // var is inherited from the right side of sentence
        log.info("incomes from datasource: {}", incomesFromDB);
        return incomesFromDB;
    }
}
