package com.eu.front.entity;
public class Sale {
    private Integer id;
    private java.util.Date saleYear;//时间
    private String saleMonth;
    private String saleCode;
    private String saleSteelId;
    private String saleCapacity;
    private String salePirce;
    private String saleCustomerId;//客户id
    private String saleStorageId;
    public Sale() {
        super();
    }
    public Sale(Integer id,java.util.Date saleYear,String saleMonth,String saleCode,String saleSteelId,String saleCapacity,String salePirce,String saleCustomerId,String saleStorageId) {
        super();
        this.id = id;
        this.saleYear = saleYear;
        this.saleMonth = saleMonth;
        this.saleCode = saleCode;
        this.saleSteelId = saleSteelId;
        this.saleCapacity = saleCapacity;
        this.salePirce = salePirce;
        this.saleCustomerId = saleCustomerId;
        this.saleStorageId = saleStorageId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.util.Date getSaleYear() {
        return this.saleYear;
    }

    public void setSaleYear(java.util.Date saleYear) {
        this.saleYear = saleYear;
    }

    public String getSaleMonth() {
        return this.saleMonth;
    }

    public void setSaleMonth(String saleMonth) {
        this.saleMonth = saleMonth;
    }

    public String getSaleCode() {
        return this.saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public String getSaleSteelId() {
        return this.saleSteelId;
    }

    public void setSaleSteelId(String saleSteelId) {
        this.saleSteelId = saleSteelId;
    }

    public String getSaleCapacity() {
        return this.saleCapacity;
    }

    public void setSaleCapacity(String saleCapacity) {
        this.saleCapacity = saleCapacity;
    }

    public String getSalePirce() {
        return this.salePirce;
    }

    public void setSalePirce(String salePirce) {
        this.salePirce = salePirce;
    }

    public String getSaleCustomerId() {
        return this.saleCustomerId;
    }

    public void setSaleCustomerId(String saleCustomerId) {
        this.saleCustomerId = saleCustomerId;
    }

    public String getSaleStorageId() {
        return this.saleStorageId;
    }

    public void setSaleStorageId(String saleStorageId) {
        this.saleStorageId = saleStorageId;
    }

}
