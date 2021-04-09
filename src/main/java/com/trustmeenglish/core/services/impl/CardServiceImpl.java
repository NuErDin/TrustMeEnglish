package com.trustmeenglish.core.services.impl;

import com.trustmeenglish.core.model.Card;
import com.trustmeenglish.core.repositories.CardRepository;
import com.trustmeenglish.core.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {


    private final CardRepository cardRepository;

    @Override
    public Card getCard(Long id) {
        return cardRepository.getById(id);
    }
}
