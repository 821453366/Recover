package com.eu.front.service;

import com.eu.front.entity.Sale;

import java.util.List;

public interface SaleService{
	/**
	 * 获得Sale数据的总行数
	 * @return
	 */
    long getSaleRowCount();
	/**
	 * 获得Sale数据集合
	 * @return
	 */
    List<Sale> selectSale();
	/**
	 * 获得一个Sale对象,以参数Sale对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Sale selectSaleByObj(Sale obj);
	/**
	 * 通过Sale的id获得Sale对象
	 * @param id
	 * @return
	 */
    Sale selectSaleById(Integer id);
	/**
	 * 插入Sale到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSale(Sale value);
	/**
	 * 插入Sale中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySale(Sale value);
	/**
	 * 通过Sale的id删除Sale
	 * @param id
	 * @return
	 */
    int deleteSaleById(Integer id);
	/**
	 * 通过Sale的id更新Sale中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSaleById(Sale enti);
	/**
	 * 通过Sale的id更新Sale中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySaleById(Sale enti);
}