package com.eu.front.service;

import com.eu.front.entity.Storage;

import java.util.List;

public interface StorageService{
	/**
	 * 获得Storage数据的总行数
	 * @return
	 */
    long getStorageRowCount();
	/**
	 * 获得Storage数据集合
	 * @return
	 */
    List<Storage> selectStorage();
	/**
	 * 获得一个Storage对象,以参数Storage对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Storage selectStorageByObj(Storage obj);
	/**
	 * 通过Storage的id获得Storage对象
	 * @param id
	 * @return
	 */
    Storage selectStorageById(Integer id);
	/**
	 * 插入Storage到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertStorage(Storage value);
	/**
	 * 插入Storage中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyStorage(Storage value);
	/**
	 * 通过Storage的id删除Storage
	 * @param id
	 * @return
	 */
    int deleteStorageById(Integer id);
	/**
	 * 通过Storage的id更新Storage中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateStorageById(Storage enti);
	/**
	 * 通过Storage的id更新Storage中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyStorageById(Storage enti);
}