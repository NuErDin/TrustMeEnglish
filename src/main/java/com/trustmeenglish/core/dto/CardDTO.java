package com.trustmeenglish.core.dto;

import com.trustmeenglish.core.model.EnWord;
import com.trustmeenglish.core.model.RuWord;
import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDTO {
    private Long id;
    private Long rating;
    private EnWordDTO enWordDTO;
    private RuWordDTO ruWordDTO;
}
