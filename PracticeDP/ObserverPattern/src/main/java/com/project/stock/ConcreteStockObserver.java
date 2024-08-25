package com.project.stock;

public class ConcreteStockObserver implements StockObserver{

    private String stockName;
    private int stockPrice;

    @Override
    public void update(String stockName, int stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        display();
    }

    public void display(){
        System.out.println("Stock Name: "+stockName+" Stock Price: "+stockPrice);
    }

}
