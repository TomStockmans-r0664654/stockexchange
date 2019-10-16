package be.tomstockmans.service;

import be.tomstockmans.domain.Stock;
import be.tomstockmans.domain.StockRepository;
import be.tomstockmans.interfaces.ExternalStockInformationService;

import java.math.BigDecimal;

public class StockService {
    StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public Stock getStock(String stockId){
        return stockRepository.getStockInformation(stockId);
    }

    public BigDecimal getPriceInEuroForStock(String stockId){
        return ExternalStockInformationService.getPriceInEuroForStock(stockId);
    }
}
