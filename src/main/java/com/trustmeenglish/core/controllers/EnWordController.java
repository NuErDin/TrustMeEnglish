package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.mappers.EnWordMapper;
import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class EnWordController {

    private final EnWordService enWordService;
    private final EnWordMapper enWordMapper;


    @GetMapping("/en/{id}")
    public EnWordDTO getEnWord(@PathVariable Long id) {
        EnWord enWord = enWordService.getEnWord(id);

        return enWordMapper.toDTO(enWord);
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
