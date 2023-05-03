//package com.daniel.clusustask.service;
//
//import com.daniel.clusustask.DealDTO;
//import com.daniel.clusustask.DealMapper;
//import com.daniel.clusustask.entity.Deal;
//import com.daniel.clusustask.repository.DealRepository;
//import com.daniel.clusustask.service.impl.DealServiceImpl;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.math.BigDecimal;
//import java.util.Date;
//
//import static org.hamcrest.Matchers.any;
//import static org.mockito.Mockito.when;
//
///**
// * @author Daniel Tamang
// * @since 5/3/2023
// */
//
//public class DealServiceImplTest {
//    public class DealServiceImplTest {
//
//        @Mock
//        private DealRepository dealRepository;
//
//        @Autowired
//        private DealMapper dealMapper;
//
//        @InjectMocks
//        private DealServiceImpl dealService;
//
//        @Test
//        public void testCreateDeal() {
//            DealDTO dealDto = new DealDTO();
//            dealDto.setUniqueId("1234");
//            dealDto.setFromCurrency("USD");
//            dealDto.setToCurrency("EUR");
//            dealDto.setTimestamp(Date.now());
//            dealDto.setAmount(BigDecimal.valueOf(100.00));
//
//            Deal deal = dealMapper.toDealDTO(dealDto);
//
//            when(dealRepository.save(any(Deal.class))).thenReturn(deal);
//
//            DealDto savedDeal = dealService.createDeal(dealDto);
//
//            assertNotNull(savedDeal);
//            assertEquals(dealDto.getUniqueId(), savedDeal.getUniqueId());
//            assertEquals(dealDto.getOrderingCurrency(), savedDeal.getOrderingCurrency());
//            assertEquals(dealDto.getToCurrency(), savedDeal.getToCurrency());
//            assertEquals(dealDto.getDealTimestamp(), savedDeal.getDealTimestamp());
//            assertEquals(dealDto.getAmount(), savedDeal.getAmount());
//        }
//}
