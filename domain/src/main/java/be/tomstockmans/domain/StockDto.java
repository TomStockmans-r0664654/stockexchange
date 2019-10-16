package be.tomstockmans.domain;

import java.util.Objects;

public class StockDto {

    private String name;
    private String stockPrice;

    public StockDto(String name, String stockPrice) {
        this.name = name;
        this.stockPrice = stockPrice;
    }

    public static StockDto convertStocktoDto(Stock stock){
        return new StockDto(stock.getName(), stock.getStockPrice().toString());
    }

    public String getName() {
        return name;
    }

    public String getStockPrice() {
        return stockPrice;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockDto stockDto = (StockDto) o;
        return Objects.equals(name, stockDto.name) &&
                Objects.equals(stockPrice, stockDto.stockPrice);
    }

    @Override
    public String toString() {
        return "StockDto{" +
                "name='" + name + '\'' +
                ", stockPrice='" + stockPrice + '\'' +
                '}';
    }
}
