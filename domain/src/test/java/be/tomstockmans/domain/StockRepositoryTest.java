package be.tomstockmans.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StockRepositoryTest {

    private StockRepository stockRepository = new StockRepository();
    @Test
    void getStockInformationGivesBackCOrrectStock() {
        Assertions.assertEquals(new Stock("AA", new StockPrice(new BigDecimal(7.5325), StockCurrency.EUR)), stockRepository.getStockInformation("AA"));

    }
}