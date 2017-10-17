package com.eu.front.service.impl;

import com.eu.front.dao.SteelDao;
import com.eu.front.entity.Steel;
import com.eu.front.service.SteelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SteelServiceImpl implements SteelService {
    @Autowired
    private SteelDao steelDao;
    @Override
    public long getSteelRowCount(){
        return steelDao.getSteelRowCount();
    }
    @Override
    public List<Steel> selectSteel(){
        return steelDao.selectSteel();
    }
    @Override
    public Steel selectSteelByObj(Steel obj){
        return steelDao.selectSteelByObj(obj);
    }
    @Override
    public Steel selectSteelById(Integer id){
        return steelDao.selectSteelById(id);
    }
    @Override
    public int insertSteel(Steel value){
        return steelDao.insertSteel(value);
    }
    @Override
    public int insertNonEmptySteel(Steel value){
        return steelDao.insertNonEmptySteel(value);
    }
    @Override
    public int deleteSteelById(Integer id){
        return steelDao.deleteSteelById(id);
    }
    @Override
    public int updateSteelById(Steel enti){
        return steelDao.updateSteelById(enti);
    }
    @Override
    public int updateNonEmptySteelById(Steel enti){
        return steelDao.updateNonEmptySteelById(enti);
    }

    public SteelDao getSteelDao() {
        return this.steelDao;
    }

    public void setSteelDao(SteelDao steelDao) {
        this.steelDao = steelDao;
    }

}