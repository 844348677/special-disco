package com.hdd.controller;

import com.hdd.service.LgdService;
import com.hdd.service.RiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by liuh on 2016/2/2.
 */
@Controller

public class RiskController {

    @Autowired
    @Qualifier("riskService")
    protected RiskService riskService;

    @Autowired
    @Qualifier("lgdService")
    protected LgdService lgdService;

/*    @RequestMapping(value="/customers/{customer_id}/risk_variables",method= RequestMethod.GET)
    @ResponseBody
    public List getRiskById(@PathVariable String customer_id) throws Exception {
        String applid = customer_id;
        List resList = riskService.getRiskVariableByApplid(applid);

        return  resList;
    }

    @RequestMapping(value = "/customers/{customer_id}/risk_results",method= RequestMethod.GET)
    @ResponseBody
    public List getLgdById(@PathVariable String customer_id) throws Exception {
        String applid = customer_id;
        List resList = riskService.getRiskResultByApplid(applid);

        return  resList;
    }*/

    @RequestMapping(value="/customers/{customer_id}/risks",method = RequestMethod.GET)
    @ResponseBody
    public List getAllListById(@PathVariable String customer_id) throws Exception{
        String applid = customer_id;
        List resList1 = riskService.getRiskVariableByApplid(applid);
        List resList2 = riskService.getRiskResultByApplid(applid);
        resList1.addAll(resList2);

        return resList1;
    }

}
