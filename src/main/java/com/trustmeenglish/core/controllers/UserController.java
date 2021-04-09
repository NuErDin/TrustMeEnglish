package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.UserDTO;
import com.trustmeenglish.core.mappers.UserMapper;
import com.trustmeenglish.core.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.trustmeenglish.core.model.User;



@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;


    @GetMapping("/users/{id}")
    public UserDTO sayHello(@PathVariable Long id) {
        User user = userService.getUser(id);

        return userMapper.toDTO(user);
    }

   /* private UserDTO toDTO(User user) {
        Set<RoleDTO> roleDTOS = toDTOs(user.getRoles());
        return UserDTO.builder().id(user.getId()).email(user.getEmail()).roles(roleDTOS).build();
    }

    private Set<RoleDTO> toDTOs(Set<Role> roles) {

        return roles.stream().map(this::toDTO).collect(Collectors.toSet());
    }

    private RoleDTO toDTO(Role role) {

        return RoleDTO.builder()
                .id(role.getId())
                .name(role.getName())
                .build();
    }*/
}
