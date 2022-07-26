package com.customer.provider;

import com.customer.connector.CardsConnector;
import com.customer.domain.CardsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardsProvider {

    private final CardsConnector connector;

    public CardsDto getCustomerCard(Long customerId){
        return new CardsDto(connector.getCards(customerId).getCardsDto().getCardId(),
                connector.getCards(customerId).getCardsDto().getCardType(),
                connector.getCards(customerId).getCardsDto().getAmount(),
                connector.getCards(customerId).getCardsDto().getCustomerId());
    }
}
