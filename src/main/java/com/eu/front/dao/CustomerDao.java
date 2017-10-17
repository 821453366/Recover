package com.eu.front.dao;

import com.eu.front.entity.Customer;

import java.util.List;

public interface CustomerDao{
	/**
	 * 获得Customer数据的总行数
	 * @return
	 */
    long getCustomerRowCount();
	/**
	 * 获得Customer数据集合
	 * @return
	 */
    List<Customer> selectCustomer();
	/**
	 * 获得一个Customer对象,以参数Customer对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    Customer selectCustomerByObj(Customer obj);
	/**
	 * 通过Customer的id获得Customer对象
	 * @param id
	 * @return
	 */
    Customer selectCustomerById(Integer id);
	/**
	 * 插入Customer到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertCustomer(Customer value);
	/**
	 * 插入Customer中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyCustomer(Customer value);
	/**
	 * 通过Customer的id删除Customer
	 * @param id
	 * @return
	 */
    int deleteCustomerById(Integer id);
	/**
	 * 通过Customer的id更新Customer中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateCustomerById(Customer enti);
	/**
	 * 通过Customer的id更新Customer中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyCustomerById(Customer enti);
}