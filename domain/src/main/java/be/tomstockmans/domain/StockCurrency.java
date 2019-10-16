package be.tomstockmans.domain;

public enum StockCurrency {


    EUR("\u20ac"),
    USD("$"),
    GBP("\u00a3");

    private String label;

    StockCurrency(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }


}
