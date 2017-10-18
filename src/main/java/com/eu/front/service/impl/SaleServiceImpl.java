package com.eu.front.service.impl;

import com.eu.front.dao.SaleDao;
import com.eu.front.entity.Sale;
import com.eu.front.service.SaleService;
import com.eu.front.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDao saleDao;

    @Override
    public List<Map<String, String>> querySale(PageUtil page, String userName) throws Exception {
        String saleCode="%"+userName+"%";
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("start", (page.getCurrentIndex() - 1) * page.getPageSize());
        data.put("end", page.getPageSize());
        data.put("saleCode",saleCode);
        page.setTotalSize(saleDao.querySaleCount());

        return saleDao.querySale(data);
    }

    @Override
    public void addSale(Sale sale) throws Exception {
        saleDao.addSale(sale);
    }

    @Override
    public void deleteSale(String id) throws Exception {
        saleDao.deleteSale(id);
    }
}