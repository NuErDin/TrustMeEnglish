package com.trustmeenglish.core.services.impl;

import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.model.User;
import com.trustmeenglish.core.repositories.EnWordRepository;
import com.trustmeenglish.core.repositories.UserRepository;
import com.trustmeenglish.core.services.EnWordService;
import com.trustmeenglish.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnWordServiceImpl implements EnWordService {


    private final EnWordRepository enWordRepository;

    @Override
    public EnWord getEnWord(Long id) {
        return enWordRepository.getById(id);
    }
}
