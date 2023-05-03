package com.daniel.clusustask;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Daniel Tamang
 * @since 5/3/2023
 */
@Getter
@Setter
public class DealRequestDTO {
    private String uniqueId;
    private String fromCurrency;
    private String toCurrency;
    private BigDecimal amount;
    private Date timestamp;

}
