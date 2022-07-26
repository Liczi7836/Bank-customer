package com.customer.connector.response;

import com.customer.domain.CardsDto;
import lombok.Data;

@Data
public class GetCardsResponse {
    private CardsDto cardsDto;
}
