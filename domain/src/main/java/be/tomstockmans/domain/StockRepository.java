package be.tomstockmans.domain;

import com.google.common.collect.ImmutableMap;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class StockRepository {

    private Map<String, Stock> database = new HashMap<String, Stock>();

    public StockRepository() {
        database = ImmutableMap.<String, Stock>builder()
                .put("AA", new Stock("AA", new StockPrice(new BigDecimal(7.5325), StockCurrency.EUR)))
                .put("BB", new Stock("BB", new StockPrice(new BigDecimal(8.6989), StockCurrency.USD)))
                .put("CC", new Stock("CC", new StockPrice(new BigDecimal(9.1234), StockCurrency.GBP)))
                .build();

    }

    public StockRepository(Map<String, Stock> database) {
        this.database = database;
    }

    public Stock getStockInformation(String stockId) {

        Stock stock =  database.get(stockId);
        if(stock == null){
            throw new IllegalArgumentException("no stock found");
        }
        return stock;
    }

}
