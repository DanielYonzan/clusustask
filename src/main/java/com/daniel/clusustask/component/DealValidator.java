package com.daniel.clusustask.component;

import com.daniel.clusustask.entity.Deal;
import com.daniel.clusustask.exception.DealValidationException;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Tamang
 * @since 5/3/2023
 */
@Component
public class DealValidator {

    public void validateDeal(Deal deal) throws DealValidationException {
        // Validate the fields of the deal object
        if (deal.getDealUniqueId() == null || deal.getDealUniqueId().isEmpty()) {
            throw new DealValidationException("Deal unique ID is missing");
        }
        if (deal.getOrderingCurrencyIsoCode() == null || deal.getOrderingCurrencyIsoCode().isEmpty()) {
            throw new DealValidationException("Ordering currency ISO code is missing");
        }
        if (deal.getToCurrencyIsoCode() == null || deal.getToCurrencyIsoCode().isEmpty()) {
            throw new DealValidationException("To currency ISO code is missing");
        }
        if (deal.getDealAmountInOrderingCurrency() == null) {
            throw new DealValidationException("Deal amount in ordering currency is missing");
        }
    }
}

