package com.eu.front.entity;
public class Stock {
    private Integer id;
    private String stockYear;
    private String stockMonth;
    private String stockCode;//代码
    private String stockCapacity;//大小
    private String stockSteelId;//型号
    public Stock() {
        super();
    }
    public Stock(Integer id,String stockYear,String stockMonth,String stockCode,String stockCapacity,String stockSteelId) {
        super();
        this.id = id;
        this.stockYear = stockYear;
        this.stockMonth = stockMonth;
        this.stockCode = stockCode;
        this.stockCapacity = stockCapacity;
        this.stockSteelId = stockSteelId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockYear() {
        return this.stockYear;
    }

    public void setStockYear(String stockYear) {
        this.stockYear = stockYear;
    }

    public String getStockMonth() {
        return this.stockMonth;
    }

    public void setStockMonth(String stockMonth) {
        this.stockMonth = stockMonth;
    }

    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockCapacity() {
        return this.stockCapacity;
    }

    public void setStockCapacity(String stockCapacity) {
        this.stockCapacity = stockCapacity;
    }

    public String getStockSteelId() {
        return this.stockSteelId;
    }

    public void setStockSteelId(String stockSteelId) {
        this.stockSteelId = stockSteelId;
    }

}
