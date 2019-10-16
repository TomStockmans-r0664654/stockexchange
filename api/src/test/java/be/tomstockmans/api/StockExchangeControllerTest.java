package be.tomstockmans.api;

import be.tomstockmans.domain.StockDto;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StockExchangeControllerTest {
    StockExchangeController stockExchangeController = new StockExchangeController();


    @Test
    void getStock() {
        assertEquals(new StockDto("AA", "7.5325 EUR"), stockExchangeController.getStock("AA"));
        assertEquals(new StockDto("BB", "8.6989 USD"), stockExchangeController.getStock("BB"));
    }
}