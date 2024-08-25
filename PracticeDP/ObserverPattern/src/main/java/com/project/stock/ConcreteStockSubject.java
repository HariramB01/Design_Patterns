package com.project.stock;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStockSubject implements StockSubject{

    private List<StockObserver> observers;
    private String stockName;
    private int stockPrice;

    public ConcreteStockSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(StockObserver stockObserver) {
        observers.add(stockObserver);
    }

    @Override
    public void detach(StockObserver stockObserver) {
        observers.remove(stockObserver);
    }

    @Override
    public void notification() {
        for(StockObserver observer : observers){
            observer.update(stockName, stockPrice);
        }
    }

    public void setData(String stockName, int stockPrice){
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        notification();
    }

}
