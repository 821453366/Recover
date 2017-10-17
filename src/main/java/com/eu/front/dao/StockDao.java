package com.eu.front.dao;

import com.eu.front.entity.Stock;

import java.util.List;

public interface StockDao{
	/**
	 * 获得Stock数据的总行数
	 * @return
	 */
    long getStockRowCount();
	/**
	 * 获得Stock数据集合
	 * @return
	 */
    List<Stock> selectStock();
	/**
	 * 获得一个Stock对象,以参数Stock对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Stock selectStockByObj(Stock obj);
	/**
	 * 通过Stock的id获得Stock对象
	 * @param id
	 * @return
	 */
    Stock selectStockById(Integer id);
	/**
	 * 插入Stock到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertStock(Stock value);
	/**
	 * 插入Stock中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyStock(Stock value);
	/**
	 * 通过Stock的id删除Stock
	 * @param id
	 * @return
	 */
    int deleteStockById(Integer id);
	/**
	 * 通过Stock的id更新Stock中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateStockById(Stock enti);
	/**
	 * 通过Stock的id更新Stock中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyStockById(Stock enti);
}