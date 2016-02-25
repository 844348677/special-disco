package com.hdd.controller;

import com.alibaba.fastjson.JSONObject;
import com.hdd.service.SetupCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by liuh on 2016/2/15.
 */
@Controller
public class SetupReadController {

    @Autowired
    @Qualifier("setupCreateService")
    protected SetupCreateService setup;


/*    @RequestMapping(value="/setup",method= RequestMethod.GET)
    @ResponseBody
    public List getRiskById(HttpServletRequest request) throws Exception {

        Map<String,List> valueMap = setup.getValueMap();

        for (Map.Entry entry : valueMap.entrySet()) {
            String key = entry.getKey().toString();
            List valueList = (List)entry.getValue();
            String value = valueList.toString();

            //System.out.println("key=" + key +"  size:" + valueList.size()+"  value=" + value);

            Set uniqueSet = new HashSet(valueList);
            System.out.println("name:"+key+"  unique.size："+uniqueSet.size());
            if(uniqueSet.size() <= 32){
                for (Object temp : uniqueSet) {
                    System.out.print(temp + ": " + Collections.frequency(valueList, temp)+",");
                }
                System.out.println();
            }else{
                setup.getContinueInfo(valueList);
            }
        }

        return  null;
    }*/

    @RequestMapping(value="/save",method= RequestMethod.GET)
    @ResponseBody
    public void saveMethod(HttpServletRequest request) throws Exception {

        setup.savePoint();


    }

/*    @RequestMapping(value="/customer_risks",method=RequestMethod.GET)
    @ResponseBody
    public List getRiskAll(HttpServletRequest request) throws Exception{

       // setup.getRiskByName("1");


        return null;
    }

    @RequestMapping(value="/customer_fields",method=RequestMethod.GET)
    @ResponseBody
    public List getCustomerAll(HttpServletRequest request) throws Exception{

        setup.getRiskByName("1");

        return null;
    }*/

    @RequestMapping(value="/customer_risks/{risk_name}",method=RequestMethod.GET)
    @ResponseBody
    public JSONObject getRiskByName(@PathVariable String risk_name) throws Exception{
        String riskName = risk_name;
        setup.getRiskByName(risk_name);


        return null;
    }

    @RequestMapping(value="/customer_fields/{field_name}",method=RequestMethod.GET)
    @ResponseBody
    public JSONObject getCustomerByName(@PathVariable String field_name) throws Exception{
        String fieldName = field_name;
        JSONObject json = setup.getCustomerByName(fieldName);


        return json;
    }


}
