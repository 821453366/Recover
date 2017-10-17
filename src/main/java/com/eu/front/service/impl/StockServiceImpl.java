package com.eu.front.service.impl;

import com.eu.front.dao.StockDao;
import com.eu.front.entity.Stock;
import com.eu.front.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao stockDao;
    @Override
    public long getStockRowCount(){
        return stockDao.getStockRowCount();
    }
    @Override
    public List<Stock> selectStock(){
        return stockDao.selectStock();
    }
    @Override
    public Stock selectStockByObj(Stock obj){
        return stockDao.selectStockByObj(obj);
    }
    @Override
    public Stock selectStockById(Integer id){
        return stockDao.selectStockById(id);
    }
    @Override
    public int insertStock(Stock value){
        return stockDao.insertStock(value);
    }
    @Override
    public int insertNonEmptyStock(Stock value){
        return stockDao.insertNonEmptyStock(value);
    }
    @Override
    public int deleteStockById(Integer id){
        return stockDao.deleteStockById(id);
    }
    @Override
    public int updateStockById(Stock enti){
        return stockDao.updateStockById(enti);
    }
    @Override
    public int updateNonEmptyStockById(Stock enti){
        return stockDao.updateNonEmptyStockById(enti);
    }

    public StockDao getStockDao() {
        return this.stockDao;
    }

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

}