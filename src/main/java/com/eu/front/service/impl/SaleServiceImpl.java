package com.eu.front.service.impl;

import com.eu.front.dao.SaleDao;
import com.eu.front.entity.Sale;
import com.eu.front.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDao saleDao;
    @Override
    public long getSaleRowCount(){
        return saleDao.getSaleRowCount();
    }
    @Override
    public List<Sale> selectSale(){
        return saleDao.selectSale();
    }
    @Override
    public Sale selectSaleByObj(Sale obj){
        return saleDao.selectSaleByObj(obj);
    }
    @Override
    public Sale selectSaleById(Integer id){
        return saleDao.selectSaleById(id);
    }
    @Override
    public int insertSale(Sale value){
        return saleDao.insertSale(value);
    }
    @Override
    public int insertNonEmptySale(Sale value){
        return saleDao.insertNonEmptySale(value);
    }
    @Override
    public int deleteSaleById(Integer id){
        return saleDao.deleteSaleById(id);
    }
    @Override
    public int updateSaleById(Sale enti){
        return saleDao.updateSaleById(enti);
    }
    @Override
    public int updateNonEmptySaleById(Sale enti){
        return saleDao.updateNonEmptySaleById(enti);
    }

    public SaleDao getSaleDao() {
        return this.saleDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

}