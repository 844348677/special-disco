package com.hdd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuhang on 2016/2/14.
 */
@Controller
@RequestMapping("/insert")
public class InsertInterface {

/*    @Autowired
    @Qualifier("insertService")
    protected InsertService insertService;

    @RequestMapping
    @ResponseBody
    public void saveCustomer(String type, String param) throws Exception {

        if("newdata".equals(type)){
            insertService.saveCustomer(param);
        }
        if("risk".equals(type)){
            insertService.saveRisk(param);
        }
        if("lgd".equals(type)){
            insertService.saveLgd(param);
        }

    }*/
}
