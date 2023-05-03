package com.daniel.clusustask.service;

import com.daniel.clusustask.dto.DealRequestDTO;
import com.daniel.clusustask.entity.Deal;

import java.util.List;

/**
 * @author Daniel Tamang
 * @since 5/2/2023
 */
public interface DealService {

    void saveDeals(List<Deal> deals);
    void saveSingleDeal(DealRequestDTO deal);
}
