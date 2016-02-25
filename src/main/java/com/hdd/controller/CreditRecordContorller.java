package com.hdd.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hdd.service.CreditRecordService;
import com.hdd.service.SetupCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/categories")
public class CreditRecordContorller {
	
	@Autowired
	@Qualifier("creditService")
	protected CreditRecordService crs;

	@Autowired
	@Qualifier("setupCreateService")
	protected SetupCreateService setup;
	
	@RequestMapping(method=RequestMethod.GET,produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getExample()
	{
		JSONObject json1 = setup.getCustomerByName("loan_amount_none");
		JSONObject json2 = setup.getCustomerByName("loan_amount_abided");
		JSONObject json3 = setup.getCustomerByName("loan_amount_broken");

		JSONObject json4 = setup.getCustomerByName("credit_grade_none");
		JSONObject json5 = setup.getCustomerByName("credit_grade_abided");
		JSONObject json6 = setup.getCustomerByName("credit_grade_broken");

		JSONObject json00 = setup.getCustomerByName("loan_amount");
		JSONObject json000 = setup.getCustomerByName("credit_grade");

		JSONArray res=new JSONArray();

		JSONObject objAll = new JSONObject();
		objAll.put("name","");
		objAll.put("title","所有");
		List list0 = new LinkedList();
		list0.add(json00);
		list0.add(json000);
		objAll.put("fields",list0);


		JSONObject obj1=new JSONObject();
		obj1.put("name", "none");
		obj1.put("title", "未借贷客户");
		List list1 = new LinkedList();
		list1.add(json1);
		list1.add(json4);
		obj1.put("fields",list1);


		JSONObject obj2=new JSONObject();
		obj2.put("name", "abided");
		obj2.put("title", "未违约客户");
		List list2 = new LinkedList();
		list2.add(json2);
		list2.add(json5);
		obj2.put("fields",list2);
		
		JSONObject obj3=new JSONObject();
		obj3.put("name", "broken");
		obj3.put("title", "违约客户");
		List list3 = new LinkedList();
		list3.add(json3);
		list3.add(json6);
		obj3.put("fields",list3);

		res.add(objAll);
		res.add(obj1);
		res.add(obj2);
		res.add(obj3);

/*		System.out.println(json1);
		System.out.println(json2);
		System.out.println(json3);
		System.out.println(json4);
		System.out.println(json5);
		System.out.println(json6);*/

		return res.toJSONString();
	}

}
