package be.tomstockmans.cli;

import be.tomstockmans.api.StockExchangeController;

public class MyCLI {
    public static void main(String[] args) {
        StockExchangeController stockExchangeController = new StockExchangeController();
        try{
        System.out.println(stockExchangeController.getStock(args[0]));

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("something went wrong..");
        }
    }
}
