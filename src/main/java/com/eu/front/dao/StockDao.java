package com.eu.front.dao;

import java.util.List;
import java.util.Map;

public interface StockDao{
	/**
	 * 分页查询数据
	 */
	List<Map<String, String>> queryStock(Map<String, Object> data) throws Exception;

	Long queryStockCount() throws Exception;

}