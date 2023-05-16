package org.example.database.service;

import lombok.RequiredArgsConstructor;
import org.example.database.repository.BotRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BotService {

    private final BotRepository botRepository;
}

