package com.apiApp.controller;

import java.util.List;

import com.apiApp.entity.Stock;
import com.apiApp.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("user")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping("stocks")
    public ResponseEntity<List<Stock>> getAllStock() {
        List<Stock> list = stockService.getAllStocks();
        return new ResponseEntity<List<Stock>>(list, HttpStatus.OK);
    }

    @GetMapping("stock/{id}")
    public ResponseEntity<Stock> getStockById(@PathVariable("id") Long Id) {
        Stock stock = stockService.getStockById(Id);
        return new ResponseEntity<Stock>(stock, HttpStatus.OK);

    }

    @DeleteMapping("stock/{id}")
    public ResponseEntity<Stock> deleteStock(@PathVariable("id") Long Id) {
        stockService.deleteStock(Id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @PostMapping("stock")
    public ResponseEntity<Void> addArticle(@RequestBody Stock stock, UriComponentsBuilder builder) {
        Stock flag = stockService.addStock(stock);
        if (flag != null) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(stock.getStockId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

}
