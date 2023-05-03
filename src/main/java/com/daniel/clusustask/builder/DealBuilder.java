package com.daniel.clusustask.builder;

import com.daniel.clusustask.dto.DealRequestDTO;
import com.daniel.clusustask.entity.Deal;

/**
 * @author Daniel Tamang
 * @since 5/3/2023
 */
public class DealBuilder {

    public static Deal buildNewDeal(DealRequestDTO requestDTO) {
        Deal deal = new Deal();
        deal.setDealUniqueId(requestDTO.getDealUniqueId());
        deal.setOrderingCurrencyIsoCode(requestDTO.getOrderingCurrencyIsoCode());
        deal.setToCurrencyIsoCode(requestDTO.getToCurrencyIsoCode());
        deal.setDealAmountInOrderingCurrency(requestDTO.getDealAmountInOrderingCurrency());

        return deal;
    }
}
