package com.example.endofthegame.service;

import com.example.endofthegame.repository.IncomesRepository;
import org.springframework.stereotype.Component;

@Component //or @Service, odin huy
public class IncomesService {
    private final IncomesRepository repository;

    public IncomesService(IncomesRepository repository) {
        this.repository = repository;
    }
}
