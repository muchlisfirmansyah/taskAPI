package com.apiApp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MANUFACTURER")
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "STOCK_ID")
    private long stockId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "QTY_STOCK")
    private Integer qtyStock;

    @Column(name = "MEASURE_UNIT")
    private String measurementUnit;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "UNIT_PRICE")
    private Double unitPrice;

    @Column(name = "STORAGE_LOC")
    private String storageLocation;

    public long getStockId() {
        return this.stockId;
    }

    public void setStockId(long stockId) {
        this.stockId = stockId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQtyStock() {
        return this.qtyStock;
    }

    public void setQtyStock(Integer qtyStock) {
        this.qtyStock = qtyStock;
    }

    public String getMeasurementUnit() {
        return this.measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getStorageLocation() {
        return this.storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
    }

    public Stock stockId(long stockId) {
        this.stockId = stockId;
        return this;
    }

    public Stock name(String name) {
        this.name = name;
        return this;
    }

    public Stock qtyStock(Integer qtyStock) {
        this.qtyStock = qtyStock;
        return this;
    }

    public Stock measurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
        return this;
    }

    public Stock status(String status) {
        this.status = status;
        return this;
    }

    public Stock unitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Stock storageLocation(String storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

}