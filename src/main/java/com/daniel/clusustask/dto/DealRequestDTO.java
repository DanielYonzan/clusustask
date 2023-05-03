package com.daniel.clusustask.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Daniel Tamang
 * @since 5/3/2023
 */
@Getter
@Setter
public class DealRequestDTO {

    @NotBlank
    private String dealUniqueId;

    @NotBlank
    @Size(max = 30)
    private String orderingCurrencyIsoCode;

    @NotBlank
    @Size(max = 30)
    private String toCurrencyIsoCode;

    @NotNull
    private BigDecimal dealAmountInOrderingCurrency;
}
