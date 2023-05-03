package com.daniel.clusustask;

import com.daniel.clusustask.controller.DealController;
import com.daniel.clusustask.entity.Deal;
import com.daniel.clusustask.repository.DealRepository;
import com.daniel.clusustask.service.impl.DealServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel Tamang
 * @since 5/3/2023
 */
//@ExtendWith()
public class DealControllerTest {

    @Mock
    private DealServiceImpl dealService;

    @InjectMocks
    private DealController dealController;

    private MockMvc mockMvc;

    @Before("")
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(dealController).build();
    }

    @Test
    public void testCreateDeal() throws Exception {
        DealRequestDTO dealRequestDto = new DealRequestDTO();
        dealRequestDto.setUniqueId("1234");
        dealRequestDto.setFromCurrency("USD");
        dealRequestDto.setToCurrency("EUR");
        dealRequestDto.setTimestamp(new Date());
        dealRequestDto.setAmount(BigDecimal.valueOf(100.00));

//        when(dealService.createDeal(any(DealDto.class))).thenReturn(new DealDto());

//        mockMvc.perform(post("/api/deals")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(new ObjectMapper().writeValueAsString(dealRequestDto)))
//                .andExpect(status().isOk());
//
//        verify(dealService, times(1)).createDeal(any(DealDto.class));
    }
}

