package com.eu.front.service.impl;

import com.eu.front.dao.CustomerDao;
import com.eu.front.entity.Customer;
import com.eu.front.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public long getCustomerRowCount(){
        return customerDao.getCustomerRowCount();
    }
    @Override
    public List<Customer> selectCustomer(){
        return customerDao.selectCustomer();
    }
    @Override
    public Customer selectCustomerByObj(Customer obj){
        return customerDao.selectCustomerByObj(obj);
    }
    @Override
    public Customer selectCustomerById(Integer id){
        return customerDao.selectCustomerById(id);
    }
    @Override
    public int insertCustomer(Customer value){
        return customerDao.insertCustomer(value);
    }
    @Override
    public int insertNonEmptyCustomer(Customer value){
        return customerDao.insertNonEmptyCustomer(value);
    }
    @Override
    public int deleteCustomerById(Integer id){
        return customerDao.deleteCustomerById(id);
    }
    @Override
    public int updateCustomerById(Customer enti){
        return customerDao.updateCustomerById(enti);
    }
    @Override
    public int updateNonEmptyCustomerById(Customer enti){
        return customerDao.updateNonEmptyCustomerById(enti);
    }

    public CustomerDao getCustomerDao() {
        return this.customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

}