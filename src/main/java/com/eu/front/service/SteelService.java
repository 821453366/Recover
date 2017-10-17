package com.eu.front.service;

import com.eu.front.entity.Steel;

import java.util.List;

public interface SteelService{
	/**
	 * 获得Steel数据的总行数
	 * @return
	 */
    long getSteelRowCount();
	/**
	 * 获得Steel数据集合
	 * @return
	 */
    List<Steel> selectSteel();
	/**
	 * 获得一个Steel对象,以参数Steel对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Steel selectSteelByObj(Steel obj);
	/**
	 * 通过Steel的id获得Steel对象
	 * @param id
	 * @return
	 */
    Steel selectSteelById(Integer id);
	/**
	 * 插入Steel到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertSteel(Steel value);
	/**
	 * 插入Steel中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptySteel(Steel value);
	/**
	 * 通过Steel的id删除Steel
	 * @param id
	 * @return
	 */
    int deleteSteelById(Integer id);
	/**
	 * 通过Steel的id更新Steel中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateSteelById(Steel enti);
	/**
	 * 通过Steel的id更新Steel中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptySteelById(Steel enti);
}