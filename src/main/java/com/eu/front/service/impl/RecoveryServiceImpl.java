package com.eu.front.service.impl;

import com.eu.front.dao.RecoveryDao;
import com.eu.front.entity.Recovery;
import com.eu.front.entity.Recovery;
import com.eu.front.service.RecoveryService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RecoveryServiceImpl implements RecoveryService {
    @Autowired
    private RecoveryDao recoveryDao;
    @Override
    public List<Map<String, String>> queryRecovery(PageUtil page, String userName) throws Exception {
        String adminReal="%"+userName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("recoveryName",adminReal);
        page.setTotalSize(recoveryDao.queryRecoveryCount());

        return recoveryDao.queryRecovery(data);
    }

    @Override
    public void addRecovery(Recovery recovery) throws Exception {
        recoveryDao.addRecovery(recovery);
    }

    @Override
    public void deleteRecovery(String id) throws Exception {
        recoveryDao.deleteRecovery(id);
    }
}