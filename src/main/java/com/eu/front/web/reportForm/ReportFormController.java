package com.eu.front.web.reportForm;

import com.eu.front.dao.RecoveryDao;
import com.eu.front.service.RecoveryService;
import com.eu.front.service.SaleService;
import com.eu.front.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ReportForm")
public class ReportFormController {
    @Autowired
    private SaleService saleService;
    @Autowired
    private RecoveryService recoveryService;

    @RequestMapping("/findRecover")
    @ResponseBody
    public Map<String, Object> findRecover(){
        Map<String, Object> data = new HashMap<String, Object>();
        List<Map<String,String>> Recover;
        try {
            Recover = recoveryService.findRecover();
            data.put("Recover", Recover);
            data.put("result", true);
            data.put("msg", Constant.SEARCH_SUCCESS);
        } catch (Exception e) {
            data.put("msg", Constant.SEARCH_FAILURE);
            e.printStackTrace();
        }

        return data;
    }
}
