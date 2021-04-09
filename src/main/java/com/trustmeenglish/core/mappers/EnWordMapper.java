package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.dto.UserDTO;
import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.model.User;
import com.trustmeenglish.core.services.EnWordService;
import com.trustmeenglish.core.services.UserService;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = EnWordService.class)
public interface EnWordMapper {

    EnWordDTO toDTO(EnWord enWord);
}
