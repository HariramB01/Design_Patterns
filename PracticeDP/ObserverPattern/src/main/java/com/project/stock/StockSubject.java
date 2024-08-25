package com.project.stock;

public interface StockSubject {
    void attach(StockObserver stockObserver);
    void detach(StockObserver stockObserver);
    void notification();
}
