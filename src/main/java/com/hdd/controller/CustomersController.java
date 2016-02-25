package com.hdd.controller;

import com.hdd.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by liuh on 2016/2/1.
 */
@Controller
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    @Qualifier("customersService")
    protected CustomersService cts;

    @RequestMapping(method= RequestMethod.GET)
    @ResponseBody
    public List getCoustomersByType(HttpServletRequest request) throws Exception {
        String category = request.getParameter("category");
        String firstPage = request.getParameter("page");
        String perPage = request.getParameter("per_page");
/*        System.out.println("category:"+category);
        System.out.println("page:"+firstPage);
        System.out.println("per_page:"+perPage);*/

        int firstPageNum = 1;
        int perPageNum = 20;
        try {
            if (firstPage != null && !"".equals(firstPage)) {
                firstPageNum = Integer.parseInt(firstPage);
            }
            if (perPage != null && !"".equals(perPage)) {
                perPageNum = Integer.parseInt(perPage);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        String sz = "6";
        List jsonList = null ;
        if(category == null || "".equals(category)){
            jsonList = cts.getCustomersInCity(sz,(firstPageNum-1)*perPageNum,perPageNum);
        }else
        {
            jsonList = cts.getCreditRecordByType(sz,category,(firstPageNum-1)*perPageNum,perPageNum);
        }

        return jsonList;

        }

/*    @RequestMapping(value = "/information",method= RequestMethod.GET)
    @ResponseBody
    public List getInformationById(HttpServletRequest request) throws Exception {
        String applid = request.getParameter("applid");
        // String sz = "6";
        List jsonList = cts.getCustomersById(applid) ;


        return jsonList;
    }*/

    @RequestMapping(value = "/{customer_id}/fields",method= RequestMethod.GET)
    @ResponseBody
    public List getInformationByIdNew(@PathVariable String customer_id) throws Exception {
        String applid = customer_id;
        // String sz = "6";
        List jsonList = cts.getCustomersByIdNew(applid) ;


        return jsonList;
    }

    @RequestMapping(value = "/{customer_id}/fieldsnew",method = RequestMethod.GET)
    @ResponseBody
    public List getInformationInNewWay(@PathVariable String customer_id) throws Exception{
        String applid = customer_id;
        List jsonList = cts.getCustomerInNewWay(applid);

        return jsonList;
    }

}
