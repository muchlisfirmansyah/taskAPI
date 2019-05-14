package com.apiApp.service;

import java.util.ArrayList;
import java.util.List;

import com.apiApp.entity.Stock;
import com.apiApp.repo.StockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> getAllStocks() {
        List<Stock> stockList = new ArrayList<>();
        stockRepository.findAll().forEach(e -> stockList.add(e));
        return stockList;
    }

    @Override
    public Stock getStockById(Long stockId) {
        Stock objecStock = stockRepository.findById(stockId).get();
        return objecStock;
    }

    @Override
    public Stock updateStock(Long stockId, Stock stock) {
        stock.getStockId();
        return stockRepository.save(stock);
    }

    @Override
    public Stock addStock(Stock stock) {
        return null;
    }

    @Override
    public void deleteStock(Long stockId) {
        stockRepository.delete(getStockById(stockId));
    }

}