package com.trustmeenglish.core.mappers;

import com.trustmeenglish.core.dto.UserDTO;
import com.trustmeenglish.core.model.User;
import com.trustmeenglish.core.services.UserService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = UserService.class)
public interface UserMapper {

    UserDTO toDTO(User user);
}
