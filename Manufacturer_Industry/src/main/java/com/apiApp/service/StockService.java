package com.apiApp.service;

import java.util.List;

import com.apiApp.entity.Stock;

public interface StockService {

    List<Stock> getAllStocks();

    Stock getStockById(Long id);

    Stock updateStock(Long id, Stock stock);

    Stock addStock(Stock stock);

    void deleteStock(Long id);
}