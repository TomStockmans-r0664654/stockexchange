package be.tomstockmans.api;

import be.tomstockmans.domain.StockDto;
import be.tomstockmans.domain.StockRepository;
import be.tomstockmans.service.StockService;

public class StockExchangeController {
    StockService stockService = new StockService(new StockRepository());

    public StockDto getStock(String stockId) {
        return StockDto.convertStocktoDto(stockService.getStock(stockId));
    }

}
