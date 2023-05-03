package com.daniel.clusustask.controller;

import com.daniel.clusustask.dto.DealRequestDTO;
import com.daniel.clusustask.entity.Deal;
import com.daniel.clusustask.service.DealService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Daniel Tamang
 * @since 5/2/2023
 */
@RestController
@RequestMapping("/deals")
public class DealController {

    private final DealService dealService;

    public DealController(DealService dealService) {
        this.dealService = dealService;
    }

    @PostMapping("/save-bulk")
    public ResponseEntity<String> bulkInsertDeals(@RequestBody List<Deal> deals) {
        try {
            dealService.saveDeals(deals);
            return ResponseEntity.ok("Deals inserted successfully.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid request body: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inserting deals: " + e.getMessage());
        }
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveDeal(@NotNull @Valid @RequestBody DealRequestDTO deal) {
        try {
            dealService.saveSingleDeal(deal);
            return ResponseEntity.ok("Deal inserted successfully.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid request body: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error inserting deals: " + e.getMessage());
        }
    }
}

