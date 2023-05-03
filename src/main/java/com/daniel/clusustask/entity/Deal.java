package com.daniel.clusustask.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Daniel Tamang
 * @since 5/2/2023
 */

@Entity
@Table(name = "deals")
@Getter
@Setter
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "deal_unique_id", nullable = false, unique = true)
    private String dealUniqueId;

    @Column(name = "ordering_currency_iso_code", nullable = false)
    private String orderingCurrencyIsoCode;

    @Column(name = "to_currency_iso_code", nullable = false)
    private String toCurrencyIsoCode;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "deal_amount_in_ordering_currency", nullable = false)
    private BigDecimal dealAmountInOrderingCurrency;

}
