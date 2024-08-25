package com.project.stock;

public interface StockObserver {
    void update(String stockName, int stockPrice);
}
