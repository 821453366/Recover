package com.eu.front.service.impl;

import com.eu.front.dao.StorageDao;
import com.eu.front.entity.Storage;
import com.eu.front.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageDao storageDao;
    @Override
    public long getStorageRowCount(){
        return storageDao.getStorageRowCount();
    }
    @Override
    public List<Storage> selectStorage(){
        return storageDao.selectStorage();
    }
    @Override
    public Storage selectStorageByObj(Storage obj){
        return storageDao.selectStorageByObj(obj);
    }
    @Override
    public Storage selectStorageById(Integer id){
        return storageDao.selectStorageById(id);
    }
    @Override
    public int insertStorage(Storage value){
        return storageDao.insertStorage(value);
    }
    @Override
    public int insertNonEmptyStorage(Storage value){
        return storageDao.insertNonEmptyStorage(value);
    }
    @Override
    public int deleteStorageById(Integer id){
        return storageDao.deleteStorageById(id);
    }
    @Override
    public int updateStorageById(Storage enti){
        return storageDao.updateStorageById(enti);
    }
    @Override
    public int updateNonEmptyStorageById(Storage enti){
        return storageDao.updateNonEmptyStorageById(enti);
    }

    public StorageDao getStorageDao() {
        return this.storageDao;
    }

    public void setStorageDao(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

}