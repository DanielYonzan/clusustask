package com.daniel.clusustask.service.impl;

import com.daniel.clusustask.builder.DealBuilder;
import com.daniel.clusustask.dto.DealRequestDTO;
import com.daniel.clusustask.entity.Deal;
import com.daniel.clusustask.exception.DealValidationException;
import com.daniel.clusustask.repository.DealRepository;
import com.daniel.clusustask.service.DealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Daniel Tamang
 * @since 5/2/2023
 */
@Service
@Slf4j
public class DealServiceImpl implements DealService {

    private final DealRepository dealRepository;

    public DealServiceImpl(DealRepository dealRepository) {
        this.dealRepository = dealRepository;
    }

    @Override
    public void saveDeals(List<Deal> deals) {
        log.debug("Saving deal: {}", deals);
        validateDeals(deals);
        Set<Long> dealIds = new HashSet<>();
        for (Deal deal : deals) {
            if (dealIds.contains(deal.getId())) {
                throw new DealValidationException("Duplicate deal ID found: " + deal.getId());
            }
            dealIds.add(deal.getId());
        }
        dealRepository.saveAll(deals);
        log.info("Deals saved successfully: {}", deals);
    }

    @Override
    public void saveSingleDeal(DealRequestDTO request) {
        Deal deal = DealBuilder.buildNewDeal(request);

        saveDeal(deal);
    }

    private void validateDeals(List<Deal> deals) {
        for (Deal deal : deals) {
            if (deal.getOrderingCurrencyIsoCode() == null || deal.getToCurrencyIsoCode() == null
                   || deal.getOrderingCurrencyIsoCode() == null) {
                throw new DealValidationException("Invalid deal data.");
            }
        }
    }

    private void saveDeal(Deal deal) {
        dealRepository.save(deal);
        log.info("Deal saved successfully: {}", deal);
    }
}
