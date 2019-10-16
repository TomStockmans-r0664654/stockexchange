package be.tomstockmans.domain;

import java.util.Objects;
import java.util.UUID;

public class Stock {
    private final String id;
    private final String name;
    private StockPrice stockPrice;

    public Stock(String name, StockPrice stockPrice) {
        id = UUID.randomUUID().toString();
        this.name = name;
        this.stockPrice = stockPrice;
    }

    public String getName() {
        return name;
    }

    public StockPrice getStockPrice() {
        return stockPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Objects.equals(name, stock.name) &&
                Objects.equals(stockPrice, stock.stockPrice);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", stockPrice=" + stockPrice +
                '}';
    }
}
