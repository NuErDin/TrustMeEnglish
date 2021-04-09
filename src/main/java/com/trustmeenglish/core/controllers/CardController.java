package com.trustmeenglish.core.controllers;

import com.trustmeenglish.core.dto.CardDTO;
import com.trustmeenglish.core.dto.EnWordDTO;
import com.trustmeenglish.core.mappers.CardMapper;
import com.trustmeenglish.core.mappers.EnWordMapper;
import com.trustmeenglish.core.model.Card;
import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.services.CardService;
import com.trustmeenglish.core.services.EnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;
    private final CardMapper cardMapper;


    @GetMapping("/cards/{id}")
    public CardDTO getCardById(@PathVariable Long id) {
        Card card = cardService.getCard(id);

        return cardMapper.toDTO(card);
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
