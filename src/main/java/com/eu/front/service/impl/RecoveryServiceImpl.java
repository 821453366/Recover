package com.eu.front.service.impl;

import com.eu.front.dao.RecoveryDao;
import com.eu.front.entity.Recovery;
import com.eu.front.service.RecoveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecoveryServiceImpl implements RecoveryService {
    @Autowired
    private RecoveryDao recoveryDao;
    @Override
    public long getRecoveryRowCount(){
        return recoveryDao.getRecoveryRowCount();
    }
    @Override
    public List<Recovery> selectRecovery(){
        return recoveryDao.selectRecovery();
    }
    @Override
    public Recovery selectRecoveryByObj(Recovery obj){
        return recoveryDao.selectRecoveryByObj(obj);
    }
    @Override
    public Recovery selectRecoveryById(Integer id){
        return recoveryDao.selectRecoveryById(id);
    }
    @Override
    public int insertRecovery(Recovery value){
        return recoveryDao.insertRecovery(value);
    }
    @Override
    public int insertNonEmptyRecovery(Recovery value){
        return recoveryDao.insertNonEmptyRecovery(value);
    }
    @Override
    public int deleteRecoveryById(Integer id){
        return recoveryDao.deleteRecoveryById(id);
    }
    @Override
    public int updateRecoveryById(Recovery enti){
        return recoveryDao.updateRecoveryById(enti);
    }
    @Override
    public int updateNonEmptyRecoveryById(Recovery enti){
        return recoveryDao.updateNonEmptyRecoveryById(enti);
    }

    public RecoveryDao getRecoveryDao() {
        return this.recoveryDao;
    }

    public void setRecoveryDao(RecoveryDao recoveryDao) {
        this.recoveryDao = recoveryDao;
    }

}