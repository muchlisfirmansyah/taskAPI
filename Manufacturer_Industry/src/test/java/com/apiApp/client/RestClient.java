package com.apiApp.client;

import com.apiApp.entity.Stock;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {
    public void getStockById() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8089/task/stocks/{id}";
        HttpEntity<String> reqEntity = new HttpEntity<String>(headers);
        ResponseEntity<Stock> responseEntity = restTemplate.exchange(url, HttpMethod.GET, reqEntity, Stock.class, 1);
        Stock stock = responseEntity.getBody();
        System.out.println(
                "Id: " + stock.getStockId() + ", Name: " + stock.getName() + ", Qty stock: " + stock.getQtyStock()
                        + ", Measure unit: " + stock.getMeasurementUnit() + ", Status: " + stock.getStatus()
                        + ", Unit price: " + stock.getUnitPrice() + ", Storage: " + stock.getStorageLocation());
    }
}