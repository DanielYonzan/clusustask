package com.daniel.clusustask;

import com.daniel.clusustask.entity.Deal;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Tamang
 * @since 5/3/2023
 */
@Component
public class DealMapper {
    public DealDTO toDealDTO(Deal deal) {
        DealDTO dto = new DealDTO();
        dto.setId(deal.getId());
        dto.setUniqueId(deal.getDealUniqueId());
        dto.setFromCurrency(deal.getOrderingCurrencyIsoCode());
        dto.setToCurrency(deal.getToCurrencyIsoCode());
        dto.setAmount(deal.getDealAmountInOrderingCurrency());
        dto.setTimestamp(deal.getDealTimestamp());
        return dto;
    }

    public Deal toDeal(DealRequestDTO requestDTO) {
        Deal deal = new Deal();
        deal.setDealUniqueId(requestDTO.getUniqueId());
        deal.setOrderingCurrencyIsoCode(requestDTO.getFromCurrency());
        deal.setToCurrencyIsoCode(requestDTO.getToCurrency());
        deal.setDealAmountInOrderingCurrency(requestDTO.getAmount());
        deal.setDealTimestamp(requestDTO.getTimestamp());
        return deal;
    }
}
