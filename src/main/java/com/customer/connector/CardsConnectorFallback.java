package com.customer.connector;

import com.customer.connector.response.GetCardsResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
class CardsConnectorFallback implements CardsConnector{

    @Override
    public GetCardsResponse getCards(Long customerId) {
        log.warn("Can not get cards for customerId: " + customerId);
        return new GetCardsResponse();
    }
}
