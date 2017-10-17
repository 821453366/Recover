package com.eu.front.dao;

import com.eu.front.entity.Recovery;

import java.util.List;

public interface RecoveryDao{
	/**
	 * 获得Recovery数据的总行数
	 * @return
	 */
    long getRecoveryRowCount();
	/**
	 * 获得Recovery数据集合
	 * @return
	 */
    List<Recovery> selectRecovery();
	/**
	 * 获得一个Recovery对象,以参数Recovery对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Recovery selectRecoveryByObj(Recovery obj);
	/**
	 * 通过Recovery的id获得Recovery对象
	 * @param id
	 * @return
	 */
    Recovery selectRecoveryById(Integer id);
	/**
	 * 插入Recovery到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertRecovery(Recovery value);
	/**
	 * 插入Recovery中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyRecovery(Recovery value);
	/**
	 * 通过Recovery的id删除Recovery
	 * @param id
	 * @return
	 */
    int deleteRecoveryById(Integer id);
	/**
	 * 通过Recovery的id更新Recovery中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateRecoveryById(Recovery enti);
	/**
	 * 通过Recovery的id更新Recovery中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyRecoveryById(Recovery enti);
}