package be.tomstockmans.service;

import be.tomstockmans.domain.Stock;
import be.tomstockmans.domain.StockCurrency;
import be.tomstockmans.domain.StockPrice;
import be.tomstockmans.domain.StockRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {

    StockService service = new StockService(new StockRepository());

    @Test
    void getStock() {
        //put("AA", new Stock("AA", new StockPrice(new BigDecimal(7.5325), StockCurrency.EUR)))
        //                .put("BB", new Stock("BB", new StockPrice(new BigDecimal(8.6989), StockCurrency.USD)))
        Assertions.assertEquals(new Stock("AA", new StockPrice(new BigDecimal(7.5325), StockCurrency.EUR)), service.getStock("AA"));
        Assertions.assertEquals(new Stock("BB", new StockPrice(new BigDecimal(8.6989), StockCurrency.USD)), service.getStock("BB"));

    }

    @Test
    void getPriceInEuroForStock() {
        for (int i = 0; i < 25; i++) {
            assertTrue(service.getPriceInEuroForStock("AA").compareTo(new BigDecimal(101)) < 0
                    &&  service.getPriceInEuroForStock("AA").compareTo(new BigDecimal(9)) > 0);
        }

    }
}