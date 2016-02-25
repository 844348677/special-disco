package com.hdd.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hdd.Entity.Customers;
import com.hdd.Entity.SingletonSave;
import com.hdd.dao.CustomersDao;
import com.hdd.dao.RiskDao;
import com.hdd.service.CustomersService;
import com.hdd.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service("customersServiceBase")
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	protected CustomersDao crd;

	@Autowired
	protected RiskDao riskDao;

	@Override
	public List<Customers> getAllCustomers() throws Exception {
		return crd.queryAll();
	}

	@Override
	public List getCustomersById(String applid) throws Exception {
		List<Customers> list =  crd.queryByApplid(applid);
		List jsonList = new LinkedList();
		for(int i=0;i<list.size();i++){
			Customers newData = list.get(i);
			JSONObject ctjson = new JSONObject();
			ctjson.put("id",newData.getZaa());
			ctjson.put("zaa",newData.getZaa());
			ctjson.put("zab",newData.getZab());
			ctjson.put("zac",newData.getZac());
			ctjson.put("zad",newData.getZad());
			ctjson.put("zae",newData.getZae());
			ctjson.put("zaf",newData.getZaf());
			ctjson.put("zag",newData.getZag());
			ctjson.put("zah",newData.getZah());
			ctjson.put("zai",newData.getZai());
			ctjson.put("zaj",newData.getZaj());
			ctjson.put("zak",newData.getZak());
			ctjson.put("zal",newData.getZal());
			ctjson.put("zam",newData.getZam());
			ctjson.put("zan",newData.getZan());
			ctjson.put("zao",newData.getZao());
			ctjson.put("zap",newData.getZap());
			ctjson.put("zaq",newData.getZaq());
			ctjson.put("zar",newData.getZar());
			ctjson.put("zas",newData.getZas());
			ctjson.put("zat",newData.getZat());
			ctjson.put("zau",newData.getZau());
			ctjson.put("zav",newData.getZav());
			ctjson.put("zaw",newData.getZaw());
			ctjson.put("zax",newData.getZax());
			ctjson.put("zay",newData.getZay());
			ctjson.put("zaz",newData.getZaz());
			ctjson.put("zba",newData.getZba());
			ctjson.put("zbb",newData.getZbb());
			ctjson.put("zbc",newData.getZbc());
			ctjson.put("zbd",newData.getZbd());
			ctjson.put("zbe",newData.getZbe());
			ctjson.put("zbf",newData.getZbf());
			ctjson.put("zbg",newData.getZbg());
			ctjson.put("zbh",newData.getZbh());
			ctjson.put("zbi",newData.getZbi());
			ctjson.put("zbj",newData.getZbj());
			ctjson.put("zbk",newData.getZbk());
			ctjson.put("zbl",newData.getZbl());
			ctjson.put("zbm",newData.getZbm());
			ctjson.put("zbn",newData.getZbn());
			ctjson.put("zbo",newData.getZbo());
			ctjson.put("zbp",newData.getZbp());
			ctjson.put("zbq",newData.getZbq());
			ctjson.put("zbr",newData.getZbr());
			ctjson.put("zbs",newData.getZbs());
			ctjson.put("zbt",newData.getZbt());
			ctjson.put("zbu",newData.getZbu());
			ctjson.put("zbv",newData.getZbv());
			ctjson.put("zbw",newData.getZbw());
			ctjson.put("zbx",newData.getZbx());
			ctjson.put("zby",newData.getZby());
			ctjson.put("zbz",newData.getZbz());
			ctjson.put("zca",newData.getZca());
			ctjson.put("zcb",newData.getZcb());
			ctjson.put("zcc",newData.getZcc());
			ctjson.put("zcd",newData.getZcd());
			ctjson.put("zce",newData.getZce());
			ctjson.put("zcf",newData.getZcf());
			ctjson.put("zcg",newData.getZcg());
			ctjson.put("zch",newData.getZch());
			ctjson.put("zci",newData.getZci());
			ctjson.put("zcj",newData.getZcj());
			ctjson.put("zck",newData.getZck());
			ctjson.put("zcl",newData.getZcl());
			ctjson.put("zcm",newData.getZcm());
			ctjson.put("zcn",newData.getZcn());
			ctjson.put("zco",newData.getZco());
			ctjson.put("zcp",newData.getZcp());
			ctjson.put("zcq",newData.getZcq());
			ctjson.put("zcr",newData.getZcr());
			ctjson.put("zcs",newData.getZcs());
			ctjson.put("zct",newData.getZct());
			ctjson.put("zcu",newData.getZcu());
			ctjson.put("zcv",newData.getZcv());
			ctjson.put("zcw",newData.getZcw());
			ctjson.put("zcx",newData.getZcx());
			ctjson.put("zcy",newData.getZcy());
			ctjson.put("zcz",newData.getZcz());
			ctjson.put("zda",newData.getZda());
			ctjson.put("zdb",newData.getZdb());
			ctjson.put("zdc",newData.getZdc());
			ctjson.put("zdd",newData.getZdd());
			ctjson.put("zde",newData.getZde());
			ctjson.put("zdf",newData.getZdf());
			ctjson.put("zdg",newData.getZdg());
			ctjson.put("zdh",newData.getZdh());
			ctjson.put("zdi",newData.getZdi());
			ctjson.put("zdj",newData.getZdj());
			ctjson.put("zdk",newData.getZdk());
			ctjson.put("zdl",newData.getZdl());
			ctjson.put("zdm",newData.getZdm());
			ctjson.put("zdn",newData.getZdn());
			ctjson.put("zdo",newData.getZdo());
			ctjson.put("zdp",newData.getZdp());
			ctjson.put("zdq",newData.getZdq());
			ctjson.put("zdr",newData.getZdr());
			ctjson.put("zds",newData.getZds());
			ctjson.put("zdt",newData.getZdt());
			ctjson.put("zdu",newData.getZdu());
			ctjson.put("zdv",newData.getZdv());
			ctjson.put("zdw",newData.getZdw());
			ctjson.put("zdx",newData.getZdx());
			ctjson.put("zdy",newData.getZdy());
			ctjson.put("zdz",newData.getZdz());
			ctjson.put("zea",newData.getZea());
			ctjson.put("zeb",newData.getZeb());
			ctjson.put("zec",newData.getZec());
			ctjson.put("zed",newData.getZed());
			ctjson.put("zee",newData.getZee());
			ctjson.put("zef",newData.getZef());
			ctjson.put("zeg",newData.getZeg());
			ctjson.put("zeh",newData.getZeh());
			ctjson.put("zei",newData.getZei());
			ctjson.put("zej",newData.getZej());
			ctjson.put("zek",newData.getZek());
			ctjson.put("zel",newData.getZel());
			ctjson.put("zem",newData.getZem());
			ctjson.put("zen",newData.getZen());
			ctjson.put("zeo",newData.getZeo());
			ctjson.put("adviseloan",newData.getAdviseloan());
			ctjson.put("creditgrade",newData.getBadratio());
			ctjson.put("adviseratio",newData.getAdviseratio());
			ctjson.put("badratio",newData.getCreditgrade());

			jsonList.add(ctjson);
		}
		return  jsonList;
	}

	//@Override
	public List getCustomersByIdNew(String zaa) throws Exception {
		if(SingletonSave.getInstance().getAllPoint().size() == 0) {
			SaveUtil.saveRisk(riskDao);
			SaveUtil.saveCustomer(crd);
			SaveUtil.saveAmountAndGrade(crd);
		}

		System.out.println(zaa);
		List<Customers> list =  crd.queryByApplid(zaa);
		List jsonList = new LinkedList();
		for(int i=0;i<list.size();i++) {
			Customers newData = list.get(i);
			JSONObject ctjson = new JSONObject();

			/**
			 *
			 {
			 "name": "information",
			 "title": "个人信息",
			 "fields": [
			 {
			 "name": "zaf",
			 "title": "申请额度",
			 "label": "20万",
			 "value": 20,
			 "avg": 15,
			 "max": 90
			 },
			 {
			 "name": "zat",
			 "title": "月收入",
			 "label": "12K",
			 "value": 12000,
			 "avg": 15000,
			 "max": 60000
			 }
			 ]
			 }
			 */

			JSONObject ctjson1 = new JSONObject();
			ctjson1.put("name","information");
			ctjson1.put("title","个人信息");
			List list1 = new LinkedList();

/*			JSONObject ctjson11 = new JSONObject();
			ctjson11.put("name","zaa");
			ctjson11.put("title","APPL_ID");
			ctjson11.put("label",newData.getZaa());
			if(newData.getZaa() != null && !"".equals(newData.getZaa()) && !"null".equals(newData.getZaa()))
				ctjson11.put("value",Double.parseDouble(newData.getZaa()));
			ctjson11.put("avg",null);
			ctjson11.put("max",null);
			String typeName11 = TypeDataUtil.getType("zaa");
			List jsonDataList11 = TypeDataUtil.getData("zaa");
			ctjson11.put("type",typeName11);
			ctjson11.put("data",jsonDataList11);
			list1.add(ctjson11);*/


			JSONObject ctjson12 = new JSONObject();
			ctjson12.put("name","zab");
			ctjson12.put("title","申请日期");
			ctjson12.put("label",DateTransUtil.transfer(newData.getZab()));
			//DateTransUtil.transfer(newData.getZab())

			if(newData.getZab() != null && !"".equals(newData.getZab()) && !"null".equals(newData.getZab()))
				ctjson12.put("value",Double.parseDouble(newData.getZab()));
			ctjson12.put("avg",null);
			ctjson12.put("max",null);
			String typeName12 = TypeDataUtil.getType("zab");
			List jsonDataList12 = TypeDataUtil.getData("zab");
			ctjson12.put("type",typeName12);
			if (jsonDataList12 != null) {
				for (int j = 0; j < jsonDataList12.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList12.get(j);
					jo.put("x", DateTransUtil.transfer(jo.get("x") + ""));
				}
			}
			ctjson12.put("data",jsonDataList12);
			list1.add(ctjson12);

			JSONObject ctjson13 = new JSONObject();
			ctjson13.put("name","zac");
			ctjson13.put("title","贷款发放日期");
			ctjson13.put("label",DateTransUtil.transfer(newData.getZac()));
			if(newData.getZac() != null && !"".equals(newData.getZac()) && !"null".equals(newData.getZac()))
				ctjson13.put("value",Double.parseDouble(newData.getZac()));
			ctjson13.put("avg",null);
			ctjson13.put("max",null);
			String typeName13 = TypeDataUtil.getType("zac");
			List jsonDataList13 = TypeDataUtil.getData("zac");
			ctjson13.put("type",typeName13);
			if(jsonDataList13 != null) {
				for (int j = 0; j < jsonDataList13.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList13.get(j);
					jo.put("x", DateTransUtil.transfer(jo.get("x") + ""));
				}
			}
			ctjson13.put("data",jsonDataList13);
			list1.add(ctjson13);

			JSONObject ctjson14 = new JSONObject();
			ctjson14.put("name","zad");
			ctjson14.put("title","贷款到期日期");
			ctjson14.put("label",DateTransUtil.transfer(newData.getZad()));
			if(newData.getZad() != null && !"".equals(newData.getZad()) && !"null".equals(newData.getZad()))
			ctjson14.put("value",Double.parseDouble(newData.getZad()));
			ctjson14.put("avg",null);
			ctjson14.put("max",null);
			String typeName14 = TypeDataUtil.getType("zad");
			List jsonDataList14 = TypeDataUtil.getData("zad");
			ctjson14.put("type",typeName14);
			if(jsonDataList14 != null) {
				for (int j = 0; j < jsonDataList14.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList14.get(j);
					jo.put("x", DateTransUtil.transfer(jo.get("x") + ""));
				}
			}
			ctjson14.put("data",jsonDataList14);
			list1.add(ctjson14);

			JSONObject ctjson15 = new JSONObject();
			ctjson15.put("name","zae");
			ctjson15.put("title","是否逾期");

			ctjson15.put("label",newData.getZae().equals("0")?"否":"是");
			if(newData.getZae() != null && !"".equals(newData.getZae()) && !"null".equals(newData.getZae()))
			ctjson15.put("value",Double.parseDouble(newData.getZae()));
			ctjson15.put("avg",null);
			ctjson15.put("max",null);
			String typeName15 = TypeDataUtil.getType("zae");
			List jsonDataList15 = TypeDataUtil.getData("zae");
			ctjson15.put("type",typeName15);
			if(jsonDataList15 != null) {
				for (int j = 0; j < jsonDataList15.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList15.get(j);
					jo.put("x", Double.parseDouble(jo.get("x") + "") == 0.0 ? "否" : "是");
				}
			}
			ctjson15.put("data",jsonDataList15);
			list1.add(ctjson15);

			JSONObject ctjson16 = new JSONObject();
			ctjson16.put("name","zaf");
			ctjson16.put("title","申请额度");
			ctjson16.put("label",newData.getZaf());
			if(newData.getZaf() != null && !"".equals(newData.getZaf()) && !"null".equals(newData.getZaf()))
			ctjson16.put("value",Double.parseDouble(newData.getZaf()));
			ctjson16.put("avg",null);
			ctjson16.put("max",null);
			String typeName16 = TypeDataUtil.getType("zaf");
			List jsonDataList16 = TypeDataUtil.getData("zaf");
			ctjson16.put("type",typeName16);
			ctjson16.put("data",jsonDataList16);
			list1.add(ctjson16);

			JSONObject ctjson17 = new JSONObject();
			ctjson17.put("name","zag");
			ctjson17.put("title","申请期限");
			ctjson17.put("label",newData.getZag());
			if(newData.getZag() != null && !"".equals(newData.getZag()) && !"null".equals(newData.getZag()))
			ctjson17.put("value",Double.parseDouble(newData.getZag()));
			ctjson17.put("avg",null);
			ctjson17.put("max",null);
			String typeName17 = TypeDataUtil.getType("zag");
			List jsonDataList17 = TypeDataUtil.getData("zag");
			ctjson17.put("type",typeName17);
			ctjson17.put("data",jsonDataList17);
			list1.add(ctjson17);

			JSONObject ctjson18 = new JSONObject();
			ctjson18.put("name","zah");
			ctjson18.put("title","年龄");
			ctjson18.put("label",newData.getZah());
			if(newData.getZah() != null && !"".equals(newData.getZah()) && !"null".equals(newData.getZah()))
			ctjson18.put("value",Double.parseDouble(newData.getZah()));
			ctjson18.put("avg",null);
			ctjson18.put("max",null);
			String typeName18 = TypeDataUtil.getType("zah");
			List jsonDataList18 = TypeDataUtil.getData("zah");
			ctjson18.put("type",typeName18);
			ctjson18.put("data",jsonDataList18);
			list1.add(ctjson18);

			JSONObject ctjson19 = new JSONObject();
			ctjson19.put("name","zai");
			ctjson19.put("title","性别");
			ctjson19.put("label",newData.getZai().equals("0")?"男":"女");
			if(newData.getZai() != null && !"".equals(newData.getZai()) && !"null".equals(newData.getZai()))
			ctjson19.put("value",Double.parseDouble(newData.getZai()));
			ctjson19.put("avg",null);
			ctjson19.put("max",null);
			String typeName19 = TypeDataUtil.getType("zai");
			List jsonDataList19 = TypeDataUtil.getData("zai");
			ctjson19.put("type",typeName19);
			if(jsonDataList19 != null) {
				for (int j = 0; j < jsonDataList19.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList19.get(j);
					jo.put("x", Double.parseDouble(jo.get("x") + "") == 0.0 ? "男" : "女");
				}
			}
			ctjson19.put("data",jsonDataList19);
			list1.add(ctjson19);

			JSONObject ctjson110 = new JSONObject();
			ctjson110.put("name","zaj");
			ctjson110.put("title","贷款用途");
			String zajValue = DataDictionariesUtil.loanPurpose(newData.getZaj());

			ctjson110.put("label",zajValue);
			if(newData.getZaj() != null && !"".equals(newData.getZaj()) && !"null".equals(newData.getZaj()))
			ctjson110.put("value",Double.parseDouble(newData.getZaj()));
			ctjson110.put("avg",null);
			ctjson110.put("max",null);
			String typeName110 = TypeDataUtil.getType("zaj");
			List jsonDataList110 = TypeDataUtil.getData("zaj");
			ctjson110.put("type",typeName110);
			if(jsonDataList110 != null) {
				for (int j = 0; j < jsonDataList110.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList110.get(j);
					if (!"教育支出".equals(jo.get("x") + ""))
						jo.put("x", DataDictionariesUtil.loanPurpose(jo.get("x") + ""));
				}
			}
			ctjson110.put("data",jsonDataList110);
			list1.add(ctjson110);

			JSONObject ctjson111 = new JSONObject();
			ctjson111.put("name","zak");
			ctjson111.put("title","婚姻状况");
			String zakValue = DataDictionariesUtil.maritalStatus(newData.getZak());
			ctjson111.put("label",zakValue);
			if(newData.getZak() != null && !"".equals(newData.getZak()) && !"null".equals(newData.getZak()))
			ctjson111.put("value",Double.parseDouble(newData.getZak()));
			ctjson111.put("avg",null);
			ctjson111.put("max",null);
			String typeName111 = TypeDataUtil.getType("zak");
			List jsonDataList111 = TypeDataUtil.getData("zak");
			ctjson111.put("type",typeName111);
			if(jsonDataList111 != null){
				for(int j=0;j<jsonDataList111.size();j++){
					JSONObject jo = (JSONObject) jsonDataList111.get(j);
					jo.put("x", DataDictionariesUtil.maritalStatus(jo.get("x")+""));
				}
			}
			ctjson111.put("data",jsonDataList111);
			list1.add(ctjson111);

			JSONObject ctjson112 = new JSONObject();
			ctjson112.put("name","zal");
			ctjson112.put("title","教育程度");
			String zalValue = DataDictionariesUtil.education(newData.getZal());
			ctjson112.put("label",zalValue);
			if(newData.getZal() != null && !"".equals(newData.getZal()) && !"null".equals(newData.getZal()))
			ctjson112.put("value",Double.parseDouble(newData.getZal()));
			ctjson112.put("avg",null);
			ctjson112.put("max",null);
			String typeName112 = TypeDataUtil.getType("zal");
			List jsonDataList112 = TypeDataUtil.getData("zal");
			ctjson112.put("type",typeName112);
			if(jsonDataList112 != null) {
				for (int j = 0; j < jsonDataList112.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList112.get(j);
					jo.put("x", DataDictionariesUtil.education(jo.get("x") + ""));
				}
			}
			ctjson112.put("data",jsonDataList112);
			list1.add(ctjson112);

			JSONObject ctjson113 = new JSONObject();
			ctjson113.put("name","zam");
			ctjson113.put("title","同住人数");
			ctjson113.put("label",newData.getZam());
			if(newData.getZam() != null && !"".equals(newData.getZam()) && !"null".equals(newData.getZam()))
			ctjson113.put("value",Double.parseDouble(newData.getZam()));
			ctjson113.put("avg",null);
			ctjson113.put("max",null);
			String typeName113 = TypeDataUtil.getType("zam");
			List jsonDataList113 = TypeDataUtil.getData("zam");
			ctjson113.put("type",typeName113);
			ctjson113.put("data",jsonDataList113);
			list1.add(ctjson113);

			JSONObject ctjson114 = new JSONObject();
			ctjson114.put("name","zan");
			ctjson114.put("title","小孩是否在深圳");
			String zanValue = DataDictionariesUtil.chInSZ(newData.getZan());
			ctjson114.put("label",zanValue);
			if(newData.getZan() != null && !"".equals(newData.getZan()) && !"null".equals(newData.getZan()))
			ctjson114.put("value",Double.parseDouble(newData.getZan()));
			ctjson114.put("avg",null);
			ctjson114.put("max",null);
			String typeName114 = TypeDataUtil.getType("zan");
			List jsonDataList114 = TypeDataUtil.getData("zan");
			ctjson114.put("type",typeName114);
			if(jsonDataList114 != null) {
				for (int j = 0; j < jsonDataList114.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList114.get(j);
					jo.put("x", DataDictionariesUtil.chInSZ(jo.get("x") + ""));
				}
			}
			ctjson114.put("data",jsonDataList114);
			list1.add(ctjson114);

			JSONObject ctjson115 = new JSONObject();
			ctjson115.put("name","zao");
			ctjson115.put("title","每月房租");
			ctjson115.put("label",newData.getZao());
			if(newData.getZao() != null && !"".equals(newData.getZao()) && !"null".equals(newData.getZao()))
			ctjson115.put("value",Double.parseDouble(newData.getZao()));
			ctjson115.put("avg",null);
			ctjson115.put("max",null);
			String typeName115 = TypeDataUtil.getType("zao");
			List jsonDataList115 = TypeDataUtil.getData("zao");
			ctjson115.put("type",typeName115);
			ctjson115.put("data",jsonDataList115);
			list1.add(ctjson115);

			JSONObject ctjson116 = new JSONObject();
			ctjson116.put("name","zap");
			ctjson116.put("title","每月按揭");
			ctjson116.put("label",newData.getZap());
			if(newData.getZap() != null && !"".equals(newData.getZap()) && !"null".equals(newData.getZap()))
			ctjson116.put("value",Double.parseDouble(newData.getZap()));
			ctjson116.put("avg",null);
			ctjson116.put("max",null);
			String typeName116 = TypeDataUtil.getType("zap");
			List jsonDataList116 = TypeDataUtil.getData("zap");
			ctjson116.put("type",typeName116);
			ctjson116.put("data",jsonDataList116);
			list1.add(ctjson116);

			JSONObject ctjson117 = new JSONObject();
			ctjson117.put("name","zaq");
			ctjson117.put("title","现住址起始居住年数");
			ctjson117.put("label",newData.getZaq());
			if(newData.getZaq() != null && !"".equals(newData.getZaq()) && !"null".equals(newData.getZaq()))
			ctjson117.put("value",Double.parseDouble(newData.getZaq()));
			ctjson117.put("avg",null);
			ctjson117.put("max",null);
			String typeName117 = TypeDataUtil.getType("zaq");
			List jsonDataList117 = TypeDataUtil.getData("zaq");
			ctjson117.put("type",typeName117);
			ctjson117.put("data",jsonDataList117);
			list1.add(ctjson117);

/*			JSONObject ctjson118 = new JSONObject();
			ctjson118.put("name","zar");
			ctjson118.put("title","行业");
			ctjson118.put("label",newData.getZar());
			if(newData.getZar() != null && !"".equals(newData.getZar()) && !"null".equals(newData.getZar()))
			ctjson118.put("value",Double.parseDouble(newData.getZar()));
			ctjson118.put("avg",null);
			ctjson118.put("max",null);
			String typeName118 = TypeDataUtil.getType("zar");
List jsonDataList118 = TypeDataUtil.getData("zar");
ctjson118.put("type",typeName118);
ctjson118.put("data",jsonDataList118);
			list1.add(ctjson118);*/
			JSONObject ctjson119 = new JSONObject();
			ctjson119.put("name","zas");
			ctjson119.put("title","现单位起始工作年数");
			ctjson119.put("label",newData.getZas());
			if(newData.getZas() != null && !"".equals(newData.getZas()) && !"null".equals(newData.getZas()))
			ctjson119.put("value",Double.parseDouble(newData.getZas()));
			ctjson119.put("avg",null);
			ctjson119.put("max",null);
			String typeName119 = TypeDataUtil.getType("zas");
			List jsonDataList119 = TypeDataUtil.getData("zas");
			ctjson119.put("type",typeName119);
			ctjson119.put("data",jsonDataList119);
			list1.add(ctjson119);

			JSONObject ctjson120 = new JSONObject();
			ctjson120.put("name","zat");
			ctjson120.put("title","月收入");
			ctjson120.put("label",newData.getZat());
			if(newData.getZat() != null && !"".equals(newData.getZat()) && !"null".equals(newData.getZat()))
			ctjson120.put("value",Double.parseDouble(newData.getZat()));
			ctjson120.put("avg",null);
			ctjson120.put("max",null);
			String typeName120 = TypeDataUtil.getType("zat");
			List jsonDataList120 = TypeDataUtil.getData("zat");
			ctjson120.put("type",typeName120);
			ctjson120.put("data",jsonDataList120);
			list1.add(ctjson120);

			JSONObject ctjson121 = new JSONObject();
			ctjson121.put("name","zau");
			ctjson121.put("title","每月支薪日");
			ctjson121.put("label",newData.getZau());
			if(newData.getZau() != null && !"".equals(newData.getZau()) && !"null".equals(newData.getZau()))
			ctjson121.put("value",Double.parseDouble(newData.getZau()));
			ctjson121.put("avg",null);
			ctjson121.put("max",null);
			String typeName121 = TypeDataUtil.getType("zau");
			List jsonDataList121 = TypeDataUtil.getData("zau");
			ctjson121.put("type",typeName121);
			ctjson121.put("data",jsonDataList121);
			list1.add(ctjson121);

			JSONObject ctjson122 = new JSONObject();
			ctjson122.put("name","zav");
			ctjson122.put("title","单位人数");
			ctjson122.put("label",newData.getZav());
			if(newData.getZav() != null && !"".equals(newData.getZav()) && !"null".equals(newData.getZav()))
			ctjson122.put("value",Double.parseDouble(newData.getZav()));
			ctjson122.put("avg",null);
			ctjson122.put("max",null);
			String typeName122 = TypeDataUtil.getType("zav");
			List jsonDataList122 = TypeDataUtil.getData("zav");
			ctjson122.put("type",typeName122);
			ctjson122.put("data",jsonDataList122);
			list1.add(ctjson122);

			JSONObject ctjson123 = new JSONObject();
			ctjson123.put("name","zaw");
			ctjson123.put("title","工资发放方式");
			String zawString = DataDictionariesUtil.incomeType(newData.getZaw());
			ctjson123.put("label",zawString);
			if(newData.getZaw() != null && !"".equals(newData.getZaw()) && !"null".equals(newData.getZaw()))
			ctjson123.put("value",Double.parseDouble(newData.getZaw()));
			ctjson123.put("avg",null);
			ctjson123.put("max",null);
			String typeName123 = TypeDataUtil.getType("zaw");
			List jsonDataList123 = TypeDataUtil.getData("zaw");
			ctjson123.put("type",typeName123);
			if(jsonDataList123 != null) {
				for (int j = 0; j < jsonDataList123.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList123.get(j);
					jo.put("x", DataDictionariesUtil.incomeType(jo.get("x") + ""));
				}
			}
			ctjson123.put("data",jsonDataList123);
			list1.add(ctjson123);

			JSONObject ctjson124 = new JSONObject();
			ctjson124.put("name","zax");
			ctjson124.put("title","是否高风险行业");
			String zaxString =  DataDictionariesUtil.indhighrflag(newData.getZax());
			ctjson124.put("label",zaxString);
			if(newData.getZax() != null && !"".equals(newData.getZax()) && !"null".equals(newData.getZax()))
			ctjson124.put("value",Double.parseDouble(newData.getZax()));
			ctjson124.put("avg",null);
			ctjson124.put("max",null);
			String typeName124 = TypeDataUtil.getType("zax");
			List jsonDataList124 = TypeDataUtil.getData("zax");
			ctjson124.put("type",typeName124);
			if(jsonDataList124 != null) {
				for (int j = 0; j < jsonDataList124.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList124.get(j);
					jo.put("x", DataDictionariesUtil.indhighrflag(jo.get("x") + ""));
				}
			}
			ctjson124.put("data",jsonDataList124);
			list1.add(ctjson124);

			JSONObject ctjson125 = new JSONObject();
			ctjson125.put("name","zay");
			ctjson125.put("title","保密与否");
			ctjson125.put("label",newData.getZay());
			if(newData.getZay() != null && !"".equals(newData.getZay()) && !"null".equals(newData.getZay()))
			ctjson125.put("value",Double.parseDouble(newData.getZay()));
			ctjson125.put("avg",null);
			ctjson125.put("max",null);
			String typeName125 = TypeDataUtil.getType("zay");
			List jsonDataList125 = TypeDataUtil.getData("zay");
			ctjson125.put("type",typeName125);
			ctjson125.put("data",jsonDataList125);
			list1.add(ctjson125);

			JSONObject ctjson126 = new JSONObject();
			ctjson126.put("name","zaz");
			ctjson126.put("title","房产类型");
			String zazValue = DataDictionariesUtil.houseType(newData.getZaz());
			ctjson126.put("label",zazValue);
			if(newData.getZaz() != null && !"".equals(newData.getZaz()) && !"null".equals(newData.getZaz()))
			ctjson126.put("value",Double.parseDouble(newData.getZaz()));
			ctjson126.put("avg",null);
			ctjson126.put("max",null);
			String typeName126 = TypeDataUtil.getType("zaz");
			List jsonDataList126 = TypeDataUtil.getData("zaz");
			ctjson126.put("type",typeName126);
			if(jsonDataList126 != null) {
				for (int j = 0; j < jsonDataList126.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList126.get(j);
					jo.put("x", DataDictionariesUtil.houseType(jo.get("x") + ""));
				}
			}
			ctjson126.put("data",jsonDataList126);
			list1.add(ctjson126);

			JSONObject ctjson127 = new JSONObject();
			ctjson127.put("name","zba");
			ctjson127.put("title","房产购买总额");
			ctjson127.put("label",newData.getZba());
			if(newData.getZba() != null && !"".equals(newData.getZba()) && !"null".equals(newData.getZba()))
			ctjson127.put("value",Double.parseDouble(newData.getZba()));
			ctjson127.put("avg",null);
			ctjson127.put("max",null);
			String typeName127 = TypeDataUtil.getType("zba");
			List jsonDataList127 = TypeDataUtil.getData("zba");
			ctjson127.put("type",typeName127);
			ctjson127.put("data",jsonDataList127);
			list1.add(ctjson127);

			JSONObject ctjson128 = new JSONObject();
			ctjson128.put("name","zbb");
			ctjson128.put("title","房产月付贷款");
			ctjson128.put("label",newData.getZbb());
			if(newData.getZbb() != null && !"".equals(newData.getZbb()) && !"null".equals(newData.getZbb()))
			ctjson128.put("value",Double.parseDouble(newData.getZbb()));
			ctjson128.put("avg",null);
			ctjson128.put("max",null);
			String typeName128 = TypeDataUtil.getType("zbb");
			List jsonDataList128 = TypeDataUtil.getData("zbb");
			ctjson128.put("type",typeName128);
			ctjson128.put("data",jsonDataList128);
			list1.add(ctjson128);

			JSONObject ctjson129 = new JSONObject();
			ctjson129.put("name","zbc");
			ctjson129.put("title","车辆购买方式");
			ctjson129.put("label",newData.getZbc());
			if(newData.getZbc() != null && !"".equals(newData.getZbc()) && !"null".equals(newData.getZbc()))
			ctjson129.put("value",Double.parseDouble(newData.getZbc()));
			ctjson129.put("avg",null);
			ctjson129.put("max",null);
			String typeName129 = TypeDataUtil.getType("zbc");
			List jsonDataList129 = TypeDataUtil.getData("zbc");
			ctjson129.put("type",typeName129);
			ctjson129.put("data",jsonDataList129);
			list1.add(ctjson129);

			JSONObject ctjson130 = new JSONObject();
			ctjson130.put("name","zbd");
			ctjson130.put("title","车辆购买贷款总额");
			ctjson130.put("label",newData.getZbd());
			if(newData.getZbd() != null && !"".equals(newData.getZbd()) && !"null".equals(newData.getZbd()))
			ctjson130.put("value",Double.parseDouble(newData.getZbd()));
			ctjson130.put("avg",null);
			ctjson130.put("max",null);
			String typeName130 = TypeDataUtil.getType("zbd");
			List jsonDataList130 = TypeDataUtil.getData("zbd");
			ctjson130.put("type",typeName130);
			ctjson130.put("data",jsonDataList130);
			list1.add(ctjson130);

			JSONObject ctjson131 = new JSONObject();
			ctjson131.put("name","zbe");
			ctjson131.put("title","车辆月付贷款");
			ctjson131.put("label",newData.getZbe());
			if(newData.getZbe() != null && !"".equals(newData.getZbe()) && !"null".equals(newData.getZbe()))
			ctjson131.put("value",Double.parseDouble(newData.getZbe()));
			ctjson131.put("avg",null);
			ctjson131.put("max",null);
			String typeName131 = TypeDataUtil.getType("zbe");
			List jsonDataList131 = TypeDataUtil.getData("zbe");
			ctjson131.put("type",typeName131);
			ctjson131.put("data",jsonDataList131);
			list1.add(ctjson131);

			JSONObject ctjson132 = new JSONObject();
			ctjson132.put("name","zbf");
			ctjson132.put("title","个体经营类型");
			ctjson132.put("label",newData.getZbf());
			if(newData.getZbf() != null && !"".equals(newData.getZbf()) && !"null".equals(newData.getZbf()))
			ctjson132.put("value",Double.parseDouble(newData.getZbf()));
			ctjson132.put("avg",null);
			ctjson132.put("max",null);
			String typeName132 = TypeDataUtil.getType("zbf");
			List jsonDataList132 = TypeDataUtil.getData("zbf");
			ctjson132.put("type",typeName132);
			ctjson132.put("data",jsonDataList132);
			list1.add(ctjson132);

			JSONObject ctjson133 = new JSONObject();
			ctjson133.put("name","zbg");
			ctjson133.put("title","经营场所所有");
			ctjson133.put("label",newData.getZbg());
			if(newData.getZbg() != null && !"".equals(newData.getZbg()) && !"null".equals(newData.getZbg()))
			ctjson133.put("value",Double.parseDouble(newData.getZbg()));
			ctjson133.put("avg",null);
			ctjson133.put("max",null);
			String typeName133 = TypeDataUtil.getType("zbg");
			List jsonDataList133 = TypeDataUtil.getData("zbg");
			ctjson133.put("type",typeName133);
			ctjson133.put("data",jsonDataList133);
			list1.add(ctjson133);

			JSONObject ctjson134 = new JSONObject();
			ctjson134.put("name","zbh");
			ctjson134.put("title","经营场所月租金额");
			ctjson134.put("label",newData.getZbh());
			if(newData.getZbh() != null && !"".equals(newData.getZbh()) && !"null".equals(newData.getZbh()))
			ctjson134.put("value",Double.parseDouble(newData.getZbh()));
			ctjson134.put("avg",null);
			ctjson134.put("max",null);

			String typeName134 = TypeDataUtil.getType("zbh");
			List jsonDataList134 = TypeDataUtil.getData("zbh");
			ctjson134.put("type",typeName134);
			ctjson134.put("data",jsonDataList134);
			list1.add(ctjson134);

			JSONObject ctjson135 = new JSONObject();
			ctjson135.put("name","zbi");
			ctjson135.put("title","经营场所月供金额");
			ctjson135.put("label",newData.getZbi());
			if(newData.getZbi() != null && !"".equals(newData.getZbi()) && !"null".equals(newData.getZbi()))
			ctjson135.put("value",Double.parseDouble(newData.getZbi()));
			ctjson135.put("avg",null);
			ctjson135.put("max",null);
			String typeName135 = TypeDataUtil.getType("zbi");
			List jsonDataList135 = TypeDataUtil.getData("zbi");
			ctjson135.put("type",typeName135);
			ctjson135.put("data",jsonDataList135);
			list1.add(ctjson135);

			JSONObject ctjson136 = new JSONObject();
			ctjson136.put("name","zbj");
			ctjson136.put("title","雇员人数");
			ctjson136.put("label",newData.getZbj());
			if(newData.getZbj() != null && !"".equals(newData.getZbj()) && !"null".equals(newData.getZbj()))
			ctjson136.put("value",Double.parseDouble(newData.getZbj()));
			ctjson136.put("avg",null);
			ctjson136.put("max",null);
			String typeName136 = TypeDataUtil.getType("zbj");
			List jsonDataList136 = TypeDataUtil.getData("zbj");
			ctjson136.put("type",typeName136);
			ctjson136.put("data",jsonDataList136);
			list1.add(ctjson136);

			JSONObject ctjson137 = new JSONObject();
			ctjson137.put("name","zbk");
			ctjson137.put("title","月均营业额");
			ctjson137.put("label",newData.getZbk());
			if(newData.getZbk() != null && !"".equals(newData.getZbk()) && !"null".equals(newData.getZbk()))
			ctjson137.put("value",Double.parseDouble(newData.getZbk()));
			ctjson137.put("avg",null);
			ctjson137.put("max",null);
			String typeName137 = TypeDataUtil.getType("zbk");
			List jsonDataList137 = TypeDataUtil.getData("zbk");
			ctjson137.put("type",typeName137);
			ctjson137.put("data",jsonDataList137);
			list1.add(ctjson137);

/*			JSONObject ctjson138 = new JSONObject();
			ctjson138.put("name","zbl");
			ctjson138.put("title","居住地址省份城市");
			ctjson138.put("label",newData.getZbl());
			if(newData.getZbl() != null && !"".equals(newData.getZbl()) && !"null".equals(newData.getZbl()))
			ctjson138.put("value",Double.parseDouble(newData.getZbl()));
			ctjson138.put("avg",null);
			ctjson138.put("max",null);
			String typeName138 = TypeDataUtil.getType("zbl");
List jsonDataList138 = TypeDataUtil.getData("zbl");
ctjson138.put("type",typeName138);
ctjson138.put("data",jsonDataList138);
			list1.add(ctjson138);*/

			JSONObject ctjson139 = new JSONObject();
			ctjson139.put("name","zbm");
			ctjson139.put("title","放款金额");

			if(newData.getZbm() != null && !"".equals(newData.getZbm()) && !"null".equals(newData.getZbm())) {
				BigDecimal bd   =   new   BigDecimal(newData.getZbm());
				ctjson139.put("value", bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());

				ctjson139.put("label",bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
			}
			ctjson139.put("avg",null);
			ctjson139.put("max",null);
			String typeName139 = TypeDataUtil.getType("zbm");
			List jsonDataList139 = TypeDataUtil.getData("zbm");
			ctjson139.put("type",typeName139);
			ctjson139.put("data",jsonDataList139);
			list1.add(ctjson139);

			JSONObject ctjson140 = new JSONObject();
			ctjson140.put("name","zbn");
			ctjson140.put("title","放款期限");
			ctjson140.put("label",newData.getZbn());
			if(newData.getZbn() != null && !"".equals(newData.getZbn()) && !"null".equals(newData.getZbn()))
			ctjson140.put("value",Double.parseDouble(newData.getZbn()));
			ctjson140.put("avg",null);
			ctjson140.put("max",null);
			String typeName140 = TypeDataUtil.getType("zbn");
			List jsonDataList140 = TypeDataUtil.getData("zbn");
			ctjson140.put("type",typeName140);
			ctjson140.put("data",jsonDataList140);
			list1.add(ctjson140);

/*			JSONObject ctjson141 = new JSONObject();
			ctjson141.put("name","zbo");
			ctjson141.put("title","贷款产品");
			ctjson141.put("label",newData.getZbo());
			if(newData.getZbo() != null && !"".equals(newData.getZbo()) && !"null".equals(newData.getZbo()))
			ctjson141.put("value",Double.parseDouble(newData.getZbo()));
			ctjson141.put("avg",null);
			ctjson141.put("max",null);
			String typeName141 = TypeDataUtil.getType("zbo");
List jsonDataList141 = TypeDataUtil.getData("zbo");
ctjson141.put("type",typeName141);
ctjson141.put("data",jsonDataList141);
			list1.add(ctjson141);*/
/*			JSONObject ctjson142 = new JSONObject();
			ctjson142.put("name","zbp");
			ctjson142.put("title","贷款类型");
			ctjson142.put("label",newData.getZbp());
			if(newData.getZbp() != null && !"".equals(newData.getZbp()) && !"null".equals(newData.getZbp()))
			ctjson142.put("value",Double.parseDouble(newData.getZbp()));
			ctjson142.put("avg",null);
			ctjson142.put("max",null);
			String typeName142 = TypeDataUtil.getType("zbp");
List jsonDataList142 = TypeDataUtil.getData("zbp");
ctjson142.put("type",typeName142);
ctjson142.put("data",jsonDataList142);
			list1.add(ctjson142);*/

			JSONObject ctjson143 = new JSONObject();
			ctjson143.put("name","zbq");
			ctjson143.put("title","自有物业类型");
			ctjson143.put("label",newData.getZbq());
			if(newData.getZbq() != null && !"".equals(newData.getZbq()) && !"null".equals(newData.getZbq()))
			ctjson143.put("value",newData.getZbq());
			ctjson143.put("avg",null);
			ctjson143.put("max",null);
			String typeName143 = TypeDataUtil.getType("zbq");
			List jsonDataList143 = TypeDataUtil.getData("zbq");
			ctjson143.put("type",typeName143);
			ctjson143.put("data",jsonDataList143);
			list1.add(ctjson143);

			JSONObject ctjson144 = new JSONObject();
			ctjson144.put("name","zbr");
			ctjson144.put("title","商品房及商铺数目");
			ctjson144.put("label",newData.getZbr());
			if(newData.getZbr() != null && !"".equals(newData.getZbr()) && !"null".equals(newData.getZbr()))
			ctjson144.put("value",Double.parseDouble(newData.getZbr()));
			ctjson144.put("avg",null);
			ctjson144.put("max",null);
			String typeName144 = TypeDataUtil.getType("zbr");
			List jsonDataList144 = TypeDataUtil.getData("zbr");
			ctjson144.put("type",typeName144);
			ctjson144.put("data",jsonDataList144);
			list1.add(ctjson144);

			JSONObject ctjson145 = new JSONObject();
			ctjson145.put("name","zbs");
			ctjson145.put("title","现住址居住月数");
			ctjson145.put("label",newData.getZbs());
			if(newData.getZbs() != null && !"".equals(newData.getZbs()) && !"null".equals(newData.getZbs()))
			ctjson145.put("value",Double.parseDouble(newData.getZbs()));
			ctjson145.put("avg",null);
			ctjson145.put("max",null);
			String typeName145 = TypeDataUtil.getType("zbs");
			List jsonDataList145 = TypeDataUtil.getData("zbs");
			ctjson145.put("type",typeName145);
			ctjson145.put("data",jsonDataList145);
			list1.add(ctjson145);

/*			JSONObject ctjson146 = new JSONObject();
			ctjson146.put("name","zbt");
			ctjson146.put("title","客户类别");
			ctjson146.put("label",newData.getZbt());
			if(newData.getZbt() != null && !"".equals(newData.getZbt()) && !"null".equals(newData.getZbt()))
			ctjson146.put("value",Double.parseDouble(newData.getZbt()));
			ctjson146.put("avg",null);
			ctjson146.put("max",null);
			String typeName146 = TypeDataUtil.getType("zbt");
List jsonDataList146 = TypeDataUtil.getData("zbt");
ctjson146.put("type",typeName146);
ctjson146.put("data",jsonDataList146);
			list1.add(ctjson146);*/

			JSONObject ctjson147 = new JSONObject();
			ctjson147.put("name","zbu");
			ctjson147.put("title","婚姻状态");
			String zbuValue = DataDictionariesUtil.maritalStatus2(newData.getZbu());
			ctjson147.put("label",zbuValue);
			if(newData.getZbu() != null && !"".equals(newData.getZbu()) && !"null".equals(newData.getZbu()))
			ctjson147.put("value",Double.parseDouble(newData.getZbu()));
			ctjson147.put("avg",null);
			ctjson147.put("max",null);
			String typeName147 = TypeDataUtil.getType("zbu");
			List jsonDataList147 = TypeDataUtil.getData("zbu");
			ctjson147.put("type",typeName147);
			if(jsonDataList147 != null) {
				for (int j = 0; j < jsonDataList147.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList147.get(j);
					jo.put("x", DataDictionariesUtil.maritalStatus2(jo.get("x") + ""));
				}
			}
			ctjson147.put("data",jsonDataList147);
			list1.add(ctjson147);

			JSONObject ctjson148 = new JSONObject();
			ctjson148.put("name","zbv");
			ctjson148.put("title","学历");
			String zbvValue = DataDictionariesUtil.education2(newData.getZbv());
			ctjson148.put("label",zbvValue);
			if(newData.getZbv() != null && !"".equals(newData.getZbv()) && !"null".equals(newData.getZbv()))
			ctjson148.put("value",Double.parseDouble(newData.getZbv()));
			ctjson148.put("avg",null);
			ctjson148.put("max",null);
			String typeName148 = TypeDataUtil.getType("zbv");
			List jsonDataList148 = TypeDataUtil.getData("zbv");
			ctjson148.put("type",typeName148);
			if(jsonDataList148 != null) {
				for (int j = 0; j < jsonDataList148.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList148.get(j);
					jo.put("x", DataDictionariesUtil.education2(jo.get("x") + ""));
				}
			}
			ctjson148.put("data",jsonDataList148);
			list1.add(ctjson148);

			JSONObject ctjson149 = new JSONObject();
			ctjson149.put("name","zbw");
			ctjson149.put("title","房贷笔数");
			ctjson149.put("label",newData.getZbw());
			if(newData.getZbw() != null && !"".equals(newData.getZbw()) && !"null".equals(newData.getZbw()))
			ctjson149.put("value",Double.parseDouble(newData.getZbw()));
			ctjson149.put("avg",null);
			ctjson149.put("max",null);
			String typeName149 = TypeDataUtil.getType("zbw");
			List jsonDataList149 = TypeDataUtil.getData("zbw");
			ctjson149.put("type",typeName149);
			ctjson149.put("data",jsonDataList149);
			list1.add(ctjson149);

			JSONObject ctjson150 = new JSONObject();
			ctjson150.put("name","zbx");
			ctjson150.put("title","其他贷款笔数");
			ctjson150.put("label",newData.getZbx());
			if(newData.getZbx() != null && !"".equals(newData.getZbx()) && !"null".equals(newData.getZbx()))
			ctjson150.put("value",Double.parseDouble(newData.getZbx()));
			ctjson150.put("avg",null);
			ctjson150.put("max",null);
			String typeName150 = TypeDataUtil.getType("zbx");
			List jsonDataList150 = TypeDataUtil.getData("zbx");
			ctjson150.put("type",typeName150);
			ctjson150.put("data",jsonDataList150);
			list1.add(ctjson150);

			JSONObject ctjson151 = new JSONObject();
			ctjson151.put("name","zby");
			ctjson151.put("title","首笔贷款发放月份");
			ctjson151.put("label","999999".equals(newData.getZby())?null:DateTransUtil.excuseMonth(newData.getZby()));
			if(newData.getZby() != null && !"".equals(newData.getZby()) && !"null".equals(newData.getZby()))
			ctjson151.put("value",Double.parseDouble(newData.getZby())==999999?null:Double.parseDouble(newData.getZby()));
			ctjson151.put("avg",null);
			ctjson151.put("max",null);
			String typeName151 = TypeDataUtil.getType("zby");

			List jsonDataList151 = TypeDataUtil.getData("zby");
			ctjson151.put("type",typeName151);
			if(jsonDataList151 != null){
				for(int j=0;j<jsonDataList151.size();j++) {
					JSONObject jo = (JSONObject) jsonDataList151.get(j);
					jo.put("x", DateTransUtil.excuseMonth(jo.get("x") + ""));
				}
			}
			ctjson151.put("data",jsonDataList151);
			list1.add(ctjson151);

			JSONObject ctjson152 = new JSONObject();
			ctjson152.put("name","zbz");
			ctjson152.put("title","贷记卡账户数");
			ctjson152.put("label",newData.getZbz());
			if(newData.getZbz() != null && !"".equals(newData.getZbz()) && !"null".equals(newData.getZbz()))
			ctjson152.put("value",Double.parseDouble(newData.getZbz()));
			ctjson152.put("avg",null);
			ctjson152.put("max",null);
			String typeName152 = TypeDataUtil.getType("zbz");
			List jsonDataList152 = TypeDataUtil.getData("zbz");
			ctjson152.put("type",typeName152);
			ctjson152.put("data",jsonDataList152);
			list1.add(ctjson152);

			JSONObject ctjson153 = new JSONObject();
			ctjson153.put("name","zca");
			ctjson153.put("title","首张贷记卡发卡月份");
			ctjson153.put("label","999999".equals(newData.getZca())?null:DateTransUtil.excuseMonth(newData.getZca()));
			if(newData.getZca() != null && !"".equals(newData.getZca()) && !"null".equals(newData.getZca()))
			ctjson153.put("value",Double.parseDouble(newData.getZca())==999999?null:Double.parseDouble(newData.getZca()));
			ctjson153.put("avg",null);
			ctjson153.put("max",null);

			String typeName153 = TypeDataUtil.getType("zca");
			List jsonDataList153 = TypeDataUtil.getData("zca");
			ctjson153.put("type",typeName153);
			if(jsonDataList153 != null){
				for(int j=0;j<jsonDataList153.size();j++) {
					JSONObject jo = (JSONObject) jsonDataList153.get(j);
					jo.put("x", DateTransUtil.excuseMonth(jo.get("x") + ""));
				}
			}
			ctjson153.put("data",jsonDataList153);

			list1.add(ctjson153);

			JSONObject ctjson154 = new JSONObject();
			ctjson154.put("name","zcb");
			ctjson154.put("title","准贷记卡账户数");
			ctjson154.put("label",newData.getZcb());
			if(newData.getZcb() != null && !"".equals(newData.getZcb()) && !"null".equals(newData.getZcb()))
			ctjson154.put("value",Double.parseDouble(newData.getZcb()));
			ctjson154.put("avg",null);
			ctjson154.put("max",null);
			String typeName154 = TypeDataUtil.getType("zcb");
			List jsonDataList154 = TypeDataUtil.getData("zcb");
			ctjson154.put("type",typeName154);
			ctjson154.put("data",jsonDataList154);
			list1.add(ctjson154);

			JSONObject ctjson155 = new JSONObject();
			ctjson155.put("name","zcc");
			ctjson155.put("title","首张准贷记卡发卡月份");
			ctjson155.put("label","999999".equals(newData.getZcc())?null:DateTransUtil.excuseMonth(newData.getZcc()));
			if(newData.getZcc() != null && !"".equals(newData.getZcc()) && !"null".equals(newData.getZcc()))
			ctjson155.put("value",Double.parseDouble(newData.getZcc())==999999?null:newData.getZcc());
			ctjson155.put("avg",null);
			ctjson155.put("max",null);
			String typeName155 = TypeDataUtil.getType("zcc");
			List jsonDataList155 = TypeDataUtil.getData("zcc");
			ctjson155.put("type",typeName155);
			if(jsonDataList155 != null){
				for(int j=0;j<jsonDataList155.size();j++) {
					JSONObject jo = (JSONObject) jsonDataList155.get(j);
					jo.put("x", DateTransUtil.excuseMonth(jo.get("x") + ""));
				}
			}
			ctjson155.put("data",jsonDataList155);
			list1.add(ctjson155);

			ctjson1.put("fields",list1);


			JSONObject ctjson2 = new JSONObject();
			ctjson2.put("name","overdue");
			ctjson2.put("title","贷款逾期");
			List list2 = new LinkedList();

			JSONObject ctjson256 = new JSONObject();
			ctjson256.put("name","zcd");
			ctjson256.put("title","贷款逾期笔数");
			ctjson256.put("label",newData.getZcd());
			if(newData.getZcd() != null && !"".equals(newData.getZcd()) && !"null".equals(newData.getZcd()))
			ctjson256.put("value",Double.parseDouble(newData.getZcd()));
			ctjson256.put("avg",null);
			ctjson256.put("max",null);
			String typeName256 = TypeDataUtil.getType("zcd");
			List jsonDataList256 = TypeDataUtil.getData("zcd");
			ctjson256.put("type",typeName256);
			ctjson256.put("data",jsonDataList256);
			list2.add(ctjson256);

			JSONObject ctjson257 = new JSONObject();
			ctjson257.put("name","zce");
			ctjson257.put("title","贷款逾期月份数");
			ctjson257.put("label",newData.getZce());
			if(newData.getZce() != null && !"".equals(newData.getZce()) && !"null".equals(newData.getZce()))
			ctjson257.put("value",Double.parseDouble(newData.getZce()));
			ctjson257.put("avg",null);
			ctjson257.put("max",null);
			String typeName257 = TypeDataUtil.getType("zce");
			List jsonDataList257 = TypeDataUtil.getData("zce");
			ctjson257.put("type",typeName257);
			ctjson257.put("data",jsonDataList257);
			list2.add(ctjson257);

			JSONObject ctjson258 = new JSONObject();
			ctjson258.put("name","zcf");
			ctjson258.put("title","贷款逾期单月最高逾期总额");
			ctjson258.put("label",newData.getZcf());
			if(newData.getZcf() != null && !"".equals(newData.getZcf()) && !"null".equals(newData.getZcf()))
			ctjson258.put("value",Double.parseDouble(newData.getZcf()));
			ctjson258.put("avg",null);
			ctjson258.put("max",null);
			String typeName258 = TypeDataUtil.getType("zcf");
			List jsonDataList258 = TypeDataUtil.getData("zcf");
			ctjson258.put("type",typeName258);
			ctjson258.put("data",jsonDataList258);
			list2.add(ctjson258);

			JSONObject ctjson259 = new JSONObject();
			ctjson259.put("name","zcg");
			ctjson259.put("title","贷款逾期最长逾期月数");
			ctjson259.put("label",newData.getZcg());
			if(newData.getZcg() != null && !"".equals(newData.getZcg()) && !"null".equals(newData.getZcg()))
			ctjson259.put("value",Double.parseDouble(newData.getZcg()));
			ctjson259.put("avg",null);
			ctjson259.put("max",null);
			String typeName259 = TypeDataUtil.getType("zcg");
			List jsonDataList259 = TypeDataUtil.getData("zcg");
			ctjson259.put("type",typeName259);
			ctjson259.put("data",jsonDataList259);
			list2.add(ctjson259);

			JSONObject ctjson260 = new JSONObject();
			ctjson260.put("name","zch");
			ctjson260.put("title","贷记卡逾期账户数");
			ctjson260.put("label",newData.getZch());
			if(newData.getZch() != null && !"".equals(newData.getZch()) && !"null".equals(newData.getZch()))
			ctjson260.put("value",Double.parseDouble(newData.getZch()));
			ctjson260.put("avg",null);
			ctjson260.put("max",null);
			String typeName260 = TypeDataUtil.getType("zch");
			List jsonDataList260 = TypeDataUtil.getData("zch");
			ctjson260.put("type",typeName260);
			ctjson260.put("data",jsonDataList260);
			list2.add(ctjson260);

			JSONObject ctjson261 = new JSONObject();
			ctjson261.put("name","zci");
			ctjson261.put("title","贷记卡逾期月份数");
			ctjson261.put("label",newData.getZci());
			if(newData.getZci() != null && !"".equals(newData.getZci()) && !"null".equals(newData.getZci()))
			ctjson261.put("value",Double.parseDouble(newData.getZci()));
			ctjson261.put("avg",null);
			ctjson261.put("max",null);
			String typeName261 = TypeDataUtil.getType("zci");
			List jsonDataList261 = TypeDataUtil.getData("zci");
			ctjson261.put("type",typeName261);
			ctjson261.put("data",jsonDataList261);
			list2.add(ctjson261);

			JSONObject ctjson262 = new JSONObject();
			ctjson262.put("name","zcj");
			ctjson262.put("title","贷记卡单月最高逾期总额");
			ctjson262.put("label",newData.getZcj());
			if(newData.getZcj() != null && !"".equals(newData.getZcj()) && !"null".equals(newData.getZcj()))
			ctjson262.put("value",Double.parseDouble(newData.getZcj()));
			ctjson262.put("avg",null);
			ctjson262.put("max",null);
			String typeName262 = TypeDataUtil.getType("zcj");
			List jsonDataList262 = TypeDataUtil.getData("zcj");
			ctjson262.put("type",typeName262);
			ctjson262.put("data",jsonDataList262);
			list2.add(ctjson262);

			JSONObject ctjson263 = new JSONObject();
			ctjson263.put("name","zck");
			ctjson263.put("title","贷记卡逾期最长逾期月数");
			ctjson263.put("label",newData.getZck());
			if(newData.getZck() != null && !"".equals(newData.getZck()) && !"null".equals(newData.getZck()))
			ctjson263.put("value",Double.parseDouble(newData.getZck()));
			ctjson263.put("avg",null);
			ctjson263.put("max",null);
			String typeName263 = TypeDataUtil.getType("zck");
			List jsonDataList263 = TypeDataUtil.getData("zck");
			ctjson263.put("type",typeName263);
			ctjson263.put("data",jsonDataList263);

			list2.add(ctjson263);

			JSONObject ctjson264 = new JSONObject();
			ctjson264.put("name","zcl");
			ctjson264.put("title","准贷记卡60天以上透支账户数");
			ctjson264.put("label",newData.getZcl());
			if(newData.getZcl() != null && !"".equals(newData.getZcl()) && !"null".equals(newData.getZcl()))
			ctjson264.put("value",Double.parseDouble(newData.getZcl()));
			ctjson264.put("avg",null);
			ctjson264.put("max",null);
			String typeName264 = TypeDataUtil.getType("zcl");
			List jsonDataList264 = TypeDataUtil.getData("zcl");
			ctjson264.put("type",typeName264);
			ctjson264.put("data",jsonDataList264);
			list2.add(ctjson264);

			JSONObject ctjson265 = new JSONObject();
			ctjson265.put("name","zcm");
			ctjson265.put("title","准贷记卡60天以上透支月份数");
			ctjson265.put("label",newData.getZcm());
			if(newData.getZcm() != null && !"".equals(newData.getZcm()) && !"null".equals(newData.getZcm()))
			ctjson265.put("value",Double.parseDouble(newData.getZcm()));
			ctjson265.put("avg",null);
			ctjson265.put("max",null);
			String typeName265 = TypeDataUtil.getType("zcm");
			List jsonDataList265 = TypeDataUtil.getData("zcm");
			ctjson265.put("type",typeName265);
			ctjson265.put("data",jsonDataList265);
			list2.add(ctjson265);

			JSONObject ctjson266 = new JSONObject();
			ctjson266.put("name","zcn");
			ctjson266.put("title","准贷记卡60天以上透支单月最高透支余额");
			ctjson266.put("label",newData.getZcn());
			if(newData.getZcn() != null && !"".equals(newData.getZcn()) && !"null".equals(newData.getZcn()))
			ctjson266.put("value",Double.parseDouble(newData.getZcn()));
			ctjson266.put("avg",null);
			ctjson266.put("max",null);
			String typeName266 = TypeDataUtil.getType("zcn");
			List jsonDataList266 = TypeDataUtil.getData("zcn");
			ctjson266.put("type",typeName266);
			ctjson266.put("data",jsonDataList266);
			list2.add(ctjson266);

			JSONObject ctjson267 = new JSONObject();
			ctjson267.put("name","zco");
			ctjson267.put("title","准贷记卡60天以上透支最长透支月数");
			ctjson267.put("label",newData.getZco());
			if(newData.getZco() != null && !"".equals(newData.getZco()) && !"null".equals(newData.getZco()))
			ctjson267.put("value",Double.parseDouble(newData.getZco()));
			ctjson267.put("avg",null);
			ctjson267.put("max",null);
			String typeName267 = TypeDataUtil.getType("zco");
			List jsonDataList267 = TypeDataUtil.getData("zco");
			ctjson267.put("type",typeName267);
			ctjson267.put("data",jsonDataList267);
			list2.add(ctjson267);

			ctjson2.put("fields",list2);


			JSONObject ctjson3 = new JSONObject();
			ctjson3.put("name","loan");
			ctjson3.put("title","未结清贷款");
			List list3 = new LinkedList();

			JSONObject ctjson368 = new JSONObject();
			ctjson368.put("name","zcp");
			ctjson368.put("title","未结清贷款-贷款法人机构数");
			ctjson368.put("label",newData.getZcp());
			if(newData.getZcp() != null && !"".equals(newData.getZcp()) && !"null".equals(newData.getZcp()))
			ctjson368.put("value",Double.parseDouble(newData.getZcp()));
			ctjson368.put("avg",null);
			ctjson368.put("max",null);
			String typeName368 = TypeDataUtil.getType("zcp");
			List jsonDataList368 = TypeDataUtil.getData("zcp");
			ctjson368.put("type",typeName368);
			ctjson368.put("data",jsonDataList368);
			list3.add(ctjson368);

			JSONObject ctjson369 = new JSONObject();
			ctjson369.put("name","zcq");
			ctjson369.put("title","未结清贷款-贷款机构数");
			ctjson369.put("label",newData.getZcq());
			if(newData.getZcq() != null && !"".equals(newData.getZcq()) && !"null".equals(newData.getZcq()))
			ctjson369.put("value",Double.parseDouble(newData.getZcq()));
			ctjson369.put("avg",null);
			ctjson369.put("max",null);
			String typeName369 = TypeDataUtil.getType("zcq");
			List jsonDataList369 = TypeDataUtil.getData("zcq");
			ctjson369.put("type",typeName369);
			ctjson369.put("data",jsonDataList369);
			list3.add(ctjson369);

			JSONObject ctjson370 = new JSONObject();
			ctjson370.put("name","zcr");
			ctjson370.put("title","未结清贷款-贷款笔数");
			ctjson370.put("label",newData.getZcr());
			if(newData.getZcr() != null && !"".equals(newData.getZcr()) && !"null".equals(newData.getZcr()))
			ctjson370.put("value",Double.parseDouble(newData.getZcr()));
			ctjson370.put("avg",null);
			ctjson370.put("max",null);
			String typeName370 = TypeDataUtil.getType("zcr");
			List jsonDataList370 = TypeDataUtil.getData("zcr");
			ctjson370.put("type",typeName370);
			ctjson370.put("data",jsonDataList370);
			list3.add(ctjson370);

			JSONObject ctjson371 = new JSONObject();
			ctjson371.put("name","zcs");
			ctjson371.put("title","未结清贷款-合同总额");
			ctjson371.put("label",newData.getZcs());
			if(newData.getZcs() != null && !"".equals(newData.getZcs()) && !"null".equals(newData.getZcs()))
			ctjson371.put("value",Double.parseDouble(newData.getZcs()));
			ctjson371.put("avg",null);
			ctjson371.put("max",null);
			String typeName371 = TypeDataUtil.getType("zcs");
			List jsonDataList371 = TypeDataUtil.getData("zcs");
			ctjson371.put("type",typeName371);
			ctjson371.put("data",jsonDataList371);
			list3.add(ctjson371);

			JSONObject ctjson372 = new JSONObject();
			ctjson372.put("name","zct");
			ctjson372.put("title","未结清贷款-余额");
			ctjson372.put("label",newData.getZct());
			if(newData.getZct() != null && !"".equals(newData.getZct()) && !"null".equals(newData.getZct()))
			ctjson372.put("value",Double.parseDouble(newData.getZct()));
			ctjson372.put("avg",null);
			ctjson372.put("max",null);
			String typeName372 = TypeDataUtil.getType("zct");
			List jsonDataList372 = TypeDataUtil.getData("zct");
			ctjson372.put("type",typeName372);
			ctjson372.put("data",jsonDataList372);
			list3.add(ctjson372);

			JSONObject ctjson373 = new JSONObject();
			ctjson373.put("name","zcu");
			ctjson373.put("title","未结清贷款-最近六个月平均应还款");
			ctjson373.put("label",newData.getZcu());
			if(newData.getZcu() != null && !"".equals(newData.getZcu()) && !"null".equals(newData.getZcu()))
			ctjson373.put("value",Double.parseDouble(newData.getZcu()));
			ctjson373.put("avg",null);
			ctjson373.put("max",null);
			String typeName373 = TypeDataUtil.getType("zcu");
			List jsonDataList373 = TypeDataUtil.getData("zcu");
			ctjson373.put("type",typeName373);
			ctjson373.put("data",jsonDataList373);
			list3.add(ctjson373);


			ctjson3.put("fields",list3);


			JSONObject ctjson4 = new JSONObject();
			ctjson4.put("name","credit");
			ctjson4.put("title","未销户贷记卡");
			List list4 = new LinkedList();

			JSONObject ctjson474 = new JSONObject();
			ctjson474.put("name","zcv");
			ctjson474.put("title","未销户贷记卡-发卡法人机构数");
			ctjson474.put("label",newData.getZcv());
			if(newData.getZcv() != null && !"".equals(newData.getZcv()) && !"null".equals(newData.getZcv()))
			ctjson474.put("value",Double.parseDouble(newData.getZcv()));
			ctjson474.put("avg",null);
			ctjson474.put("max",null);
			String typeName474 = TypeDataUtil.getType("zcv");
			List jsonDataList474 = TypeDataUtil.getData("zcv");
			ctjson474.put("type",typeName474);
			ctjson474.put("data",jsonDataList474);
			list4.add(ctjson474);

			JSONObject ctjson475 = new JSONObject();
			ctjson475.put("name","zcw");
			ctjson475.put("title","未销户贷记卡-发卡机构数");
			ctjson475.put("label",newData.getZcw());
			if(newData.getZcw() != null && !"".equals(newData.getZcw()) && !"null".equals(newData.getZcw()))
			ctjson475.put("value",Double.parseDouble(newData.getZcw()));
			ctjson475.put("avg",null);
			ctjson475.put("max",null);
			String typeName475 = TypeDataUtil.getType("zcw");
			List jsonDataList475 = TypeDataUtil.getData("zcw");
			ctjson475.put("type",typeName475);
			ctjson475.put("data",jsonDataList475);
			list4.add(ctjson475);

			JSONObject ctjson476 = new JSONObject();
			ctjson476.put("name","zcx");
			ctjson476.put("title","未销户贷记卡-账户数");
			ctjson476.put("label",newData.getZcx());
			if(newData.getZcx() != null && !"".equals(newData.getZcx()) && !"null".equals(newData.getZcx()))
			ctjson476.put("value",Double.parseDouble(newData.getZcx()));
			ctjson476.put("avg",null);
			ctjson476.put("max",null);
			String typeName476 = TypeDataUtil.getType("zcx");
			List jsonDataList476 = TypeDataUtil.getData("zcx");
			ctjson476.put("type",typeName476);
			ctjson476.put("data",jsonDataList476);
			list4.add(ctjson476);

			JSONObject ctjson477 = new JSONObject();
			ctjson477.put("name","zcy");
			ctjson477.put("title","未销户贷记卡-授信总额");
			ctjson477.put("label",newData.getZcy());
			if(newData.getZcy() != null && !"".equals(newData.getZcy()) && !"null".equals(newData.getZcy()))
			ctjson477.put("value",Double.parseDouble(newData.getZcy()));
			ctjson477.put("avg",null);
			ctjson477.put("max",null);
			String typeName477 = TypeDataUtil.getType("zcy");
			List jsonDataList477 = TypeDataUtil.getData("zcy");
			ctjson477.put("type",typeName477);
			ctjson477.put("data",jsonDataList477);
			list4.add(ctjson477);

			JSONObject ctjson478 = new JSONObject();
			ctjson478.put("name","zcz");
			ctjson478.put("title","未销户贷记卡-单家行最高授信额");
			ctjson478.put("label",newData.getZcz());
			if(newData.getZcz() != null && !"".equals(newData.getZcz()) && !"null".equals(newData.getZcz()))
			ctjson478.put("value",Double.parseDouble(newData.getZcz()));
			ctjson478.put("avg",null);
			ctjson478.put("max",null);
			String typeName478 = TypeDataUtil.getType("zcz");
			List jsonDataList478 = TypeDataUtil.getData("zcz");
			ctjson478.put("type",typeName478);
			ctjson478.put("data",jsonDataList478);
			list4.add(ctjson478);

			JSONObject ctjson479 = new JSONObject();
			ctjson479.put("name","zda");
			ctjson479.put("title","未销户贷记卡-单家行最低授信额");
			ctjson479.put("label",newData.getZda());
			if(newData.getZda() != null && !"".equals(newData.getZda()) && !"null".equals(newData.getZda()))
			ctjson479.put("value",Double.parseDouble(newData.getZda()));
			ctjson479.put("avg",null);
			ctjson479.put("max",null);
			String typeName479 = TypeDataUtil.getType("zda");
			List jsonDataList479 = TypeDataUtil.getData("zda");
			ctjson479.put("type",typeName479);
			ctjson479.put("data",jsonDataList479);

			list4.add(ctjson479);

			JSONObject ctjson480 = new JSONObject();
			ctjson480.put("name","zdb");
			ctjson480.put("title","未销户贷记卡-已用额度");
			ctjson480.put("label",newData.getZdb());
			if(newData.getZdb() != null && !"".equals(newData.getZdb()) && !"null".equals(newData.getZdb()))
			ctjson480.put("value",Double.parseDouble(newData.getZdb()));
			ctjson480.put("avg",null);
			ctjson480.put("max",null);
			String typeName480 = TypeDataUtil.getType("zdb");
			List jsonDataList480 = TypeDataUtil.getData("zdb");
			ctjson480.put("type",typeName480);
			ctjson480.put("data",jsonDataList480);

			list4.add(ctjson480);

			JSONObject ctjson481 = new JSONObject();
			ctjson481.put("name","zdc");
			ctjson481.put("title","最近6个月平均使用额度");
			ctjson481.put("label",newData.getZdc());
			if(newData.getZdc() != null && !"".equals(newData.getZdc()) && !"null".equals(newData.getZdc()))
			ctjson481.put("value",Double.parseDouble(newData.getZdc()));
			ctjson481.put("avg",null);
			ctjson481.put("max",null);
			String typeName481 = TypeDataUtil.getType("zdc");
			List jsonDataList481 = TypeDataUtil.getData("zdc");
			ctjson481.put("type",typeName481);
			ctjson481.put("data",jsonDataList481);
			list4.add(ctjson481);

			ctjson4.put("fields",list4);

			JSONObject ctjson5 = new JSONObject();
			ctjson5.put("name","qcredit");
			ctjson5.put("title","准贷记卡");
			List list5 = new LinkedList();

			JSONObject ctjson582 = new JSONObject();
			ctjson582.put("name","zdd");
			ctjson582.put("title","准贷记卡-发卡法人机构数");
			ctjson582.put("label",newData.getZdd());
			if(newData.getZdd() != null && !"".equals(newData.getZdd()) && !"null".equals(newData.getZdd()))
			ctjson582.put("value",Double.parseDouble(newData.getZdd()));
			ctjson582.put("avg",null);
			ctjson582.put("max",null);
			String typeName582 = TypeDataUtil.getType("zdd");
			List jsonDataList582 = TypeDataUtil.getData("zdd");
			ctjson582.put("type",typeName582);
			ctjson582.put("data",jsonDataList582);
			list5.add(ctjson582);

			JSONObject ctjson583 = new JSONObject();
			ctjson583.put("name","zde");
			ctjson583.put("title","准贷记卡-发卡机构数");
			ctjson583.put("label",newData.getZde());
			if(newData.getZde() != null && !"".equals(newData.getZde()) && !"null".equals(newData.getZde()))
			ctjson583.put("value",Double.parseDouble(newData.getZde()));
			ctjson583.put("avg",null);
			ctjson583.put("max",null);
			String typeName583 = TypeDataUtil.getType("zde");
			List jsonDataList583 = TypeDataUtil.getData("zde");
			ctjson583.put("type",typeName583);
			ctjson583.put("data",jsonDataList583);
			list5.add(ctjson583);

			JSONObject ctjson584 = new JSONObject();
			ctjson584.put("name","zdf");
			ctjson584.put("title","准贷记卡-账户数");
			ctjson584.put("label",newData.getZdf());
			if(newData.getZdf() != null && !"".equals(newData.getZdf()) && !"null".equals(newData.getZdf()))
			ctjson584.put("value",Double.parseDouble(newData.getZdf()));
			ctjson584.put("avg",null);
			ctjson584.put("max",null);
			String typeName584 = TypeDataUtil.getType("zdf");
			List jsonDataList584 = TypeDataUtil.getData("zdf");
			ctjson584.put("type",typeName584);
			ctjson584.put("data",jsonDataList584);
			list5.add(ctjson584);

			JSONObject ctjson585 = new JSONObject();
			ctjson585.put("name","zdg");
			ctjson585.put("title","准贷记卡-授信总额");
			ctjson585.put("label",newData.getZdg());
			if(newData.getZdg() != null && !"".equals(newData.getZdg()) && !"null".equals(newData.getZdg()))
			ctjson585.put("value",Double.parseDouble(newData.getZdg()));
			ctjson585.put("avg",null);
			ctjson585.put("max",null);
			String typeName585 = TypeDataUtil.getType("zdg");
			List jsonDataList585 = TypeDataUtil.getData("zdg");
			ctjson585.put("type",typeName585);
			ctjson585.put("data",jsonDataList585);
			list5.add(ctjson585);

			JSONObject ctjson586 = new JSONObject();
			ctjson586.put("name","zdh");
			ctjson586.put("title","准贷记卡-单家行最高授信额");
			ctjson586.put("label",newData.getZdh());
			if(newData.getZdh() != null && !"".equals(newData.getZdh()) && !"null".equals(newData.getZdh()))
			ctjson586.put("value",Double.parseDouble(newData.getZdh()));
			ctjson586.put("avg",null);
			ctjson586.put("max",null);
			String typeName586 = TypeDataUtil.getType("zdh");
			List jsonDataList586 = TypeDataUtil.getData("zdh");
			ctjson586.put("type",typeName586);
			ctjson586.put("data",jsonDataList586);

			list5.add(ctjson586);

			JSONObject ctjson587 = new JSONObject();
			ctjson587.put("name","zdi");
			ctjson587.put("title","准贷记卡-单家行最低授信额");
			ctjson587.put("label",newData.getZdi());
			if(newData.getZdi() != null && !"".equals(newData.getZdi()) && !"null".equals(newData.getZdi()))
			ctjson587.put("value",Double.parseDouble(newData.getZdi()));
			ctjson587.put("avg",null);
			ctjson587.put("max",null);
			String typeName587 = TypeDataUtil.getType("zdi");
			List jsonDataList587 = TypeDataUtil.getData("zdi");
			ctjson587.put("type",typeName587);
			ctjson587.put("data",jsonDataList587);
			list5.add(ctjson587);

			JSONObject ctjson588 = new JSONObject();
			ctjson588.put("name","zdj");
			ctjson588.put("title","准贷记卡-透支余额");
			ctjson588.put("label",newData.getZdj());
			if(newData.getZdj() != null && !"".equals(newData.getZdj()) && !"null".equals(newData.getZdj()))
			ctjson588.put("value",Double.parseDouble(newData.getZdj()));
			ctjson588.put("avg",null);
			ctjson588.put("max",null);
			String typeName588 = TypeDataUtil.getType("zdj");
			List jsonDataList588 = TypeDataUtil.getData("zdj");
			ctjson588.put("type",typeName588);
			ctjson588.put("data",jsonDataList588);
			list5.add(ctjson588);

			JSONObject ctjson589 = new JSONObject();
			ctjson589.put("name","zdk");
			ctjson589.put("title","准贷记卡-最近6个月平均透支余额");
			ctjson589.put("label",newData.getZdk());
			if(newData.getZdk() != null && !"".equals(newData.getZdk()) && !"null".equals(newData.getZdk()))
			ctjson589.put("value",Double.parseDouble(newData.getZdk()));
			ctjson589.put("avg",null);
			ctjson589.put("max",null);
			String typeName589 = TypeDataUtil.getType("zdk");
			List jsonDataList589 = TypeDataUtil.getData("zdk");
			ctjson589.put("type",typeName589);
			ctjson589.put("data",jsonDataList589);
			list5.add(ctjson589);

			JSONObject ctjson590 = new JSONObject();
			ctjson590.put("name","zdl");
			ctjson590.put("title","担保笔数");
			ctjson590.put("label",newData.getZdl());
			if(newData.getZdl() != null && !"".equals(newData.getZdl()) && !"null".equals(newData.getZdl()))
			ctjson590.put("value",Double.parseDouble(newData.getZdl()));
			ctjson590.put("avg",null);
			ctjson590.put("max",null);
			String typeName590 = TypeDataUtil.getType("zdl");
			List jsonDataList590 = TypeDataUtil.getData("zdl");
			ctjson590.put("type",typeName590);
			ctjson590.put("data",jsonDataList590);
			list5.add(ctjson590);

			JSONObject ctjson591 = new JSONObject();
			ctjson591.put("name","zdm");
			ctjson591.put("title","担保金额");
			ctjson591.put("label",newData.getZdm());
			if(newData.getZdm() != null && !"".equals(newData.getZdm()) && !"null".equals(newData.getZdm()))
			ctjson591.put("value",Double.parseDouble(newData.getZdm()));
			ctjson591.put("avg",null);
			ctjson591.put("max",null);
			String typeName591 = TypeDataUtil.getType("zdm");
			List jsonDataList591 = TypeDataUtil.getData("zdm");
			ctjson591.put("type",typeName591);
			ctjson591.put("data",jsonDataList591);
			list5.add(ctjson591);

			JSONObject ctjson592 = new JSONObject();
			ctjson592.put("name","zdn");
			ctjson592.put("title","担保本金余额");
			ctjson592.put("label",newData.getZdn());
			if(newData.getZdn() != null && !"".equals(newData.getZdn()) && !"null".equals(newData.getZdn()))
			ctjson592.put("value",Double.parseDouble(newData.getZdn()));
			ctjson592.put("avg",null);
			ctjson592.put("max",null);
			String typeName592 = TypeDataUtil.getType("zdn");
			List jsonDataList592 = TypeDataUtil.getData("zdn");
			ctjson592.put("type",typeName592);
			ctjson592.put("data",jsonDataList592);
			list5.add(ctjson592);


			ctjson5.put("fields",list5);

			JSONObject ctjson6 = new JSONObject();
			ctjson6.put("name","housing");
			ctjson6.put("title","住房公积金");
			List list6 = new LinkedList();

/*			JSONObject ctjson693 = new JSONObject();
			ctjson693.put("name","zdo");
			ctjson693.put("title","住房公积金-参缴地");
			ctjson693.put("label",newData.getZdo());
			if(newData.getZdo() != null && !"".equals(newData.getZdo()) && !"null".equals(newData.getZdo()))
			ctjson693.put("value",Double.parseDouble(newData.getZdo()));
			ctjson693.put("avg",null);
			ctjson693.put("max",null);
			list6.add(ctjson693);*/
			JSONObject ctjson694 = new JSONObject();
			ctjson694.put("name","zdp");
			ctjson694.put("title","住房公积金-参缴日期");
			if("2936547".equals(newData.getZdp()) || "-21914".equals(newData.getZdp())){
				ctjson694.put("label",null);
			}else {
				ctjson694.put("label", DateTransUtil.transfer(newData.getZdp()));
			}
			if(newData.getZdp() != null && !"".equals(newData.getZdp()) && !"null".equals(newData.getZdp()) && !"2936547".equals(newData.getZdp()) && !"-21914".equals(newData.getZdp()))
				ctjson694.put("value",Double.parseDouble(newData.getZdp()));
			ctjson694.put("avg",null);
			ctjson694.put("max",null);
			String typeName694 = TypeDataUtil.getType("zdp");
			List jsonDataList694 = TypeDataUtil.getData("zdp");
			ctjson694.put("type",typeName694);
			if(jsonDataList694 != null) {
				for (int j = 0; j < jsonDataList694.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList694.get(j);
					jo.put("x", DateTransUtil.transfer(jo.get("x") + ""));
				}
			}
			ctjson694.put("data",jsonDataList694);
			list6.add(ctjson694);

			JSONObject ctjson695 = new JSONObject();
			ctjson695.put("name","zdq");
			ctjson695.put("title","住房公积金-初缴月份");
			ctjson695.put("label","999999".equals(newData.getZdq())?null:newData.getZdq());
			if(newData.getZdq() != null && !"".equals(newData.getZdq()) && !"null".equals(newData.getZdq()))
			ctjson695.put("value",Double.parseDouble(newData.getZdq())==999999?null:Double.parseDouble(newData.getZdq()));
			ctjson695.put("avg",null);
			ctjson695.put("max",null);
			String typeName695 = TypeDataUtil.getType("zdq");
			List jsonDataList695 = TypeDataUtil.getData("zdq");
			ctjson695.put("type",typeName695);
			ctjson695.put("data",jsonDataList695);
			list6.add(ctjson695);

			JSONObject ctjson696 = new JSONObject();
			ctjson696.put("name","zdr");
			ctjson696.put("title","住房公积金-缴至月份");
			ctjson696.put("label","999999".equals(newData.getZdr())?null:newData.getZdr());
			if(newData.getZdr() != null && !"".equals(newData.getZdr()) && !"null".equals(newData.getZdr()))
			ctjson696.put("value",Double.parseDouble(newData.getZdr())==999999?null:Double.parseDouble(newData.getZdr()));
			ctjson696.put("avg",null);
			ctjson696.put("max",null);
			String typeName696 = TypeDataUtil.getType("zdr");
			List jsonDataList696 = TypeDataUtil.getData("zdr");
			ctjson696.put("type",typeName696);
			ctjson696.put("data",jsonDataList696);

			list6.add(ctjson696);

			JSONObject ctjson697 = new JSONObject();
			ctjson697.put("name","zds");
			ctjson697.put("title","住房公积金-月缴存额");
			ctjson697.put("label",newData.getZds());
			if(newData.getZds() != null && !"".equals(newData.getZds()) && !"null".equals(newData.getZds()))
			ctjson697.put("value",Double.parseDouble(newData.getZds()));
			ctjson697.put("avg",null);
			ctjson697.put("max",null);
			String typeName697 = TypeDataUtil.getType("zds");
			List jsonDataList697 = TypeDataUtil.getData("zds");
			ctjson697.put("type",typeName697);
			ctjson697.put("data",jsonDataList697);

			list6.add(ctjson697);

			JSONObject ctjson698 = new JSONObject();
			ctjson698.put("name","zdt");
			ctjson698.put("title","住房公积金-缴费状态");
			ctjson698.put("label",newData.getZdt());
			if(newData.getZdt() != null && !"".equals(newData.getZdt()) && !"null".equals(newData.getZdt()))
			ctjson698.put("value",Double.parseDouble(newData.getZdt()));
			ctjson698.put("avg",null);
			ctjson698.put("max",null);
			String typeName698 = TypeDataUtil.getType("zdt");
			List jsonDataList698 = TypeDataUtil.getData("zdt");
			ctjson698.put("type",typeName698);
			ctjson698.put("data",jsonDataList698);
			list6.add(ctjson698);

			JSONObject ctjson699 = new JSONObject();
			ctjson699.put("name","zdu");
			ctjson699.put("title","住房公积金-个人缴存比例");
			ctjson699.put("label",newData.getZdu());
			if(newData.getZdu() != null && !"".equals(newData.getZdu()) && !"null".equals(newData.getZdu()))
			ctjson699.put("value",Double.parseDouble(newData.getZdu()));
			ctjson699.put("avg",null);
			ctjson699.put("max",null);
			String typeName699 = TypeDataUtil.getType("zdu");
			List jsonDataList699 = TypeDataUtil.getData("zdu");
			ctjson699.put("type",typeName699);
			ctjson699.put("data",jsonDataList699);
			list6.add(ctjson699);

			JSONObject ctjson6100 = new JSONObject();
			ctjson6100.put("name","zdv");
			ctjson6100.put("title","住房公积金-公司缴存比例");
			ctjson6100.put("label",newData.getZdv());
			if(newData.getZdv() != null && !"".equals(newData.getZdv()) && !"null".equals(newData.getZdv()))
			ctjson6100.put("value",Double.parseDouble(newData.getZdv()));
			ctjson6100.put("avg",null);
			ctjson6100.put("max",null);
			String typeName6100 = TypeDataUtil.getType("zdv");
			List jsonDataList6100 = TypeDataUtil.getData("zdv");
			ctjson6100.put("type",typeName6100);
			ctjson6100.put("data",jsonDataList6100);
			list6.add(ctjson6100);

			JSONObject ctjson6101 = new JSONObject();
			ctjson6101.put("name","zdw");
			ctjson6101.put("title","住房公积金-信息更新日期");
			ctjson6101.put("label","2936547".equals(newData.getZdw())?null:DateTransUtil.transfer(newData.getZdw()));
			if(newData.getZdw() != null && !"".equals(newData.getZdw()) && !"null".equals(newData.getZdw()))
			ctjson6101.put("value",Double.parseDouble(newData.getZdw())==2936547?null:Double.parseDouble(newData.getZdw()));
			ctjson6101.put("avg",null);
			ctjson6101.put("max",null);
			String typeName6101 = TypeDataUtil.getType("zdw");
			List jsonDataList6101 = TypeDataUtil.getData("zdw");
			ctjson6101.put("type",typeName6101);
			if(jsonDataList6101 != null) {
				for (int j = 0; j < jsonDataList6101.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList6101.get(j);
					jo.put("x", DateTransUtil.transfer(jo.get("x") + ""));
				}
			}
			ctjson6101.put("data",jsonDataList6101);

			list6.add(ctjson6101);


			ctjson6.put("fields",list6);

			JSONObject ctjson7 = new JSONObject();
			ctjson7.put("name","endowment");
			ctjson7.put("title","养老保险");
			List list7 = new LinkedList();

/*			JSONObject ctjson7102 = new JSONObject();
			ctjson7102.put("name","zdx");
			ctjson7102.put("title","养老保险-参保地");
			ctjson7102.put("label",newData.getZdx());
			if(newData.getZdx() != null && !"".equals(newData.getZdx()) && !"null".equals(newData.getZdx()))
			ctjson7102.put("value",Double.parseDouble(newData.getZdx()));
			ctjson7102.put("avg",null);
			ctjson7102.put("max",null);
			list7.add(ctjson7102);*/

			JSONObject ctjson7103 = new JSONObject();
			ctjson7103.put("name","zdy");
			ctjson7103.put("title","养老保险-参保日期");
			ctjson7103.put("label","2936547".equals(newData.getZdy())?null:DateTransUtil.transfer(newData.getZdy()));
			if(newData.getZdy() != null && !"".equals(newData.getZdy()) && !"null".equals(newData.getZdy()))
			ctjson7103.put("value",Double.parseDouble(newData.getZdy())==2936547?null:Double.parseDouble(newData.getZdy()));
			ctjson7103.put("avg",null);
			ctjson7103.put("max",null);
			String typeName7103 = TypeDataUtil.getType("zdy");
			List jsonDataList7103 = TypeDataUtil.getData("zdy");
			ctjson7103.put("type",typeName7103);
			if(jsonDataList7103 != null) {
				for (int j = 0; j < jsonDataList7103.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList7103.get(j);
					jo.put("x", DateTransUtil.transfer(jo.get("x") + ""));
				}
			}
			ctjson7103.put("data",jsonDataList7103);
			list7.add(ctjson7103);

			JSONObject ctjson7104 = new JSONObject();
			ctjson7104.put("name","zdz");
			ctjson7104.put("title","养老保险-累计缴费月数");
			ctjson7104.put("label",newData.getZdz());
			if(newData.getZdz() != null && !"".equals(newData.getZdz()) && !"null".equals(newData.getZdz()))
			ctjson7104.put("value",Double.parseDouble(newData.getZdz()));
			ctjson7104.put("avg",null);
			ctjson7104.put("max",null);
			String typeName7104 = TypeDataUtil.getType("zdz");
			List jsonDataList7104 = TypeDataUtil.getData("zdz");
			ctjson7104.put("type",typeName7104);
			ctjson7104.put("data",jsonDataList7104);
			list7.add(ctjson7104);

			JSONObject ctjson7105 = new JSONObject();
			ctjson7105.put("name","zea");
			ctjson7105.put("title","养老保险-参加工作月份");
			ctjson7105.put("label","999999".equals(newData.getZea())?null:newData.getZea());
			if(newData.getZea() != null && !"".equals(newData.getZea()) && !"null".equals(newData.getZea()))
			ctjson7105.put("value",Double.parseDouble(newData.getZea())==999999?null:Double.parseDouble(newData.getZea()));
			ctjson7105.put("avg",null);
			ctjson7105.put("max",null);
			String typeName7105 = TypeDataUtil.getType("zea");
			List jsonDataList7105 = TypeDataUtil.getData("zea");
			ctjson7105.put("type",typeName7105);
			ctjson7105.put("data",jsonDataList7105);
			list7.add(ctjson7105);

			JSONObject ctjson7106 = new JSONObject();
			ctjson7106.put("name","zeb");
			ctjson7106.put("title","养老保险-缴费状态");
			ctjson7106.put("label",newData.getZeb());
			if(newData.getZeb() != null && !"".equals(newData.getZeb()) && !"null".equals(newData.getZeb()))
			ctjson7106.put("value",Double.parseDouble(newData.getZeb()));
			ctjson7106.put("avg",null);
			ctjson7106.put("max",null);
			String typeName7106 = TypeDataUtil.getType("zeb");
			List jsonDataList7106 = TypeDataUtil.getData("zeb");
			ctjson7106.put("type",typeName7106);
			ctjson7106.put("data",jsonDataList7106);

			list7.add(ctjson7106);

			JSONObject ctjson7107 = new JSONObject();
			ctjson7107.put("name","zec");
			ctjson7107.put("title","养老保险-个人缴费基数");
			ctjson7107.put("label",newData.getZec());
			if(newData.getZec() != null && !"".equals(newData.getZec()) && !"null".equals(newData.getZec()))
			ctjson7107.put("value",Double.parseDouble(newData.getZec()));
			ctjson7107.put("avg",null);
			ctjson7107.put("max",null);
			String typeName7107 = TypeDataUtil.getType("zec");
			List jsonDataList7107 = TypeDataUtil.getData("zec");
			ctjson7107.put("type",typeName7107);
			ctjson7107.put("data",jsonDataList7107);
			list7.add(ctjson7107);
			JSONObject ctjson7108 = new JSONObject();
			ctjson7108.put("name","zed");
			ctjson7108.put("title","养老保险-本月缴费金额");
			ctjson7108.put("label",newData.getZed());
			if(newData.getZed() != null && !"".equals(newData.getZed()) && !"null".equals(newData.getZed()))
			ctjson7108.put("value",Double.parseDouble(newData.getZed()));
			ctjson7108.put("avg",null);
			ctjson7108.put("max",null);
			String typeName7108 = TypeDataUtil.getType("zed");
			List jsonDataList7108 = TypeDataUtil.getData("zed");
			ctjson7108.put("type",typeName7108);
			ctjson7108.put("data",jsonDataList7108);
			list7.add(ctjson7108);

			JSONObject ctjson7109 = new JSONObject();
			ctjson7109.put("name","zee");
			ctjson7109.put("title","养老保险-信息更新日期");
			ctjson7109.put("label","999999".equals(newData.getZee())?null:DateTransUtil.transfer(newData.getZee()));
			if(newData.getZee() != null && !"".equals(newData.getZee()) && !"null".equals(newData.getZee()))
			ctjson7109.put("value",Double.parseDouble(newData.getZee())==999999?null:Double.parseDouble(newData.getZee()));
			ctjson7109.put("avg",null);
			ctjson7109.put("max",null);
			String typeName7109 = TypeDataUtil.getType("zee");
			List jsonDataList7109 = TypeDataUtil.getData("zee");
			ctjson7109.put("type",typeName7109);
			if(jsonDataList7109 != null) {
				for (int j = 0; j < jsonDataList7109.size(); j++) {
					JSONObject jo = (JSONObject) jsonDataList7109.get(j);
					jo.put("x", DateTransUtil.transfer(jo.get("x") + ""));
				}
			}
			ctjson7109.put("data",jsonDataList7109);
			list7.add(ctjson7109);

			JSONObject ctjson7110 = new JSONObject();
			ctjson7110.put("name","zef");
			ctjson7110.put("title","养老保险-终端或终止缴费原因");
			ctjson7110.put("label",newData.getZef());
			if(newData.getZef() != null && !"".equals(newData.getZef()) && !"null".equals(newData.getZef()))
			ctjson7110.put("value",Double.parseDouble(newData.getZef()));
			ctjson7110.put("avg",null);
			ctjson7110.put("max",null);
			String typeName7110 = TypeDataUtil.getType("zef");
			List jsonDataList7110 = TypeDataUtil.getData("zef");
			ctjson7110.put("type",typeName7110);
			ctjson7110.put("data",jsonDataList7110);
			list7.add(ctjson7110);

			ctjson7.put("fields",list7);

			JSONObject ctjson8 = new JSONObject();
			ctjson8.put("name","query");
			ctjson8.put("title","机构查询");
			List list8 = new LinkedList();

			JSONObject ctjson8111 = new JSONObject();
			ctjson8111.put("name","zeg");
			ctjson8111.put("title","最近1个月内的查询机构数-贷款审批");
			ctjson8111.put("label",newData.getZeg());
			if(newData.getZeg() != null && !"".equals(newData.getZeg()) && !"null".equals(newData.getZeg()))
			ctjson8111.put("value",Double.parseDouble(newData.getZeg()));
			ctjson8111.put("avg",null);
			ctjson8111.put("max",null);
			String typeName8111 = TypeDataUtil.getType("zeg");
			List jsonDataList8111 = TypeDataUtil.getData("zeg");
			ctjson8111.put("type",typeName8111);
			ctjson8111.put("data",jsonDataList8111);
			list8.add(ctjson8111);

			JSONObject ctjson8112 = new JSONObject();
			ctjson8112.put("name","zeh");
			ctjson8112.put("title","最近1个月内的查询机构数-信用卡审批");
			ctjson8112.put("label",newData.getZeh());
			if(newData.getZeh() != null && !"".equals(newData.getZeh()) && !"null".equals(newData.getZeh()))
			ctjson8112.put("value",Double.parseDouble(newData.getZeh()));
			ctjson8112.put("avg",null);
			ctjson8112.put("max",null);
			String typeName8112 = TypeDataUtil.getType("zeh");
			List jsonDataList8112 = TypeDataUtil.getData("zeh");
			ctjson8112.put("type",typeName8112);
			ctjson8112.put("data",jsonDataList8112);

			list8.add(ctjson8112);
			JSONObject ctjson8113 = new JSONObject();
			ctjson8113.put("name","zei");
			ctjson8113.put("title","最近1个月内的查询次数-贷款审批");
			ctjson8113.put("label",newData.getZei());
			if(newData.getZei() != null && !"".equals(newData.getZei()) && !"null".equals(newData.getZei()))
			ctjson8113.put("value",Double.parseDouble(newData.getZei()));
			ctjson8113.put("avg",null);
			ctjson8113.put("max",null);
			String typeName8113 = TypeDataUtil.getType("zei");
			List jsonDataList8113 = TypeDataUtil.getData("zei");
			ctjson8113.put("type",typeName8113);
			ctjson8113.put("data",jsonDataList8113);
			list8.add(ctjson8113);
			JSONObject ctjson8114 = new JSONObject();
			ctjson8114.put("name","zej");
			ctjson8114.put("title","最近1个月内的查询次数-信用卡审批");
			ctjson8114.put("label",newData.getZej());
			if(newData.getZej() != null && !"".equals(newData.getZej()) && !"null".equals(newData.getZej()))
			ctjson8114.put("value",Double.parseDouble(newData.getZej()));
			ctjson8114.put("avg",null);
			ctjson8114.put("max",null);
			String typeName8114 = TypeDataUtil.getType("zej");
			List jsonDataList8114 = TypeDataUtil.getData("zej");
			ctjson8114.put("type",typeName8114);
			ctjson8114.put("data",jsonDataList8114);
			list8.add(ctjson8114);

			JSONObject ctjson8115 = new JSONObject();
			ctjson8115.put("name","zek");
			ctjson8115.put("title","最近2年内的查询次数-贷后管理");
			ctjson8115.put("label",newData.getZek());
			if(newData.getZek() != null && !"".equals(newData.getZek()) && !"null".equals(newData.getZek()))
			ctjson8115.put("value",Double.parseDouble(newData.getZek()));
			ctjson8115.put("avg",null);
			ctjson8115.put("max",null);
			String typeName8115 = TypeDataUtil.getType("zek");
			List jsonDataList8115 = TypeDataUtil.getData("zek");
			ctjson8115.put("type",typeName8115);
			ctjson8115.put("data",jsonDataList8115);
			list8.add(ctjson8115);

			JSONObject ctjson8116 = new JSONObject();
			ctjson8116.put("name","zel");
			ctjson8116.put("title","最近2年内的查询次数-担保资格审查");
			ctjson8116.put("label",newData.getZel());
			if(newData.getZel() != null && !"".equals(newData.getZel()) && !"null".equals(newData.getZel()))
			ctjson8116.put("value",Double.parseDouble(newData.getZel()));
			ctjson8116.put("avg",null);
			ctjson8116.put("max",null);
			String typeName8116 = TypeDataUtil.getType("zel");
			List jsonDataList8116 = TypeDataUtil.getData("zel");
			ctjson8116.put("type",typeName8116);
			ctjson8116.put("data",jsonDataList8116);
			list8.add(ctjson8116);

			JSONObject ctjson8117 = new JSONObject();
			ctjson8117.put("name","zem");
			ctjson8117.put("title","最近2年内的查询次数-特约商户实名审查");
			ctjson8117.put("label",newData.getZem());
			if(newData.getZem() != null && !"".equals(newData.getZem()) && !"null".equals(newData.getZem()))
			ctjson8117.put("value",Double.parseDouble(newData.getZem()));
			ctjson8117.put("avg",null);
			ctjson8117.put("max",null);
			String typeName8117 = TypeDataUtil.getType("zem");
			List jsonDataList8117 = TypeDataUtil.getData("zem");
			ctjson8117.put("type",typeName8117);
			ctjson8117.put("data",jsonDataList8117);
			list8.add(ctjson8117);

/*			JSONObject ctjson8118 = new JSONObject();
			ctjson8118.put("name","zen");
			ctjson8118.put("title","change_nameflag");
			ctjson8118.put("label",newData.getZen());
			if(newData.getZen() != null && !"".equals(newData.getZen()) && !"null".equals(newData.getZen()))
			ctjson8118.put("value",Double.parseDouble(newData.getZen()));
			ctjson8118.put("avg",null);
			ctjson8118.put("max",null);
			String typeName8118 = TypeDataUtil.getType("zen");
			List jsonDataList8118 = TypeDataUtil.getData("zen");
			ctjson8118.put("type",typeName8118);
			ctjson8118.put("data",jsonDataList8118);
			list8.add(ctjson8118);*/

/*			JSONObject ctjson8119 = new JSONObject();
			ctjson8119.put("name","zeo");
			ctjson8119.put("title","degree");
			ctjson8119.put("label",newData.getZeo());
			if(newData.getZeo() != null && !"".equals(newData.getZeo()) && !"null".equals(newData.getZeo()))
			ctjson8119.put("value",Double.parseDouble(newData.getZeo()));
			ctjson8119.put("avg",null);
			ctjson8119.put("max",null);
			String typeName8119 = TypeDataUtil.getType("zeo");
			List jsonDataList8119 = TypeDataUtil.getData("zeo");
			ctjson8119.put("type",typeName8119);
			ctjson8119.put("data",jsonDataList8119);
			list8.add(ctjson8119);*/

			ctjson8.put("fields",list8);


			jsonList.add(ctjson1);
			jsonList.add(ctjson2);
			jsonList.add(ctjson3);
			jsonList.add(ctjson4);
			jsonList.add(ctjson5);
			jsonList.add(ctjson6);
			jsonList.add(ctjson7);
			jsonList.add(ctjson8);


		}
		return jsonList;
	}

	@Override
	public List getCustomerInNewWay(String zaa) throws Exception {
		return null;
	}

	//(new BigDecimal(Double.parseDouble(newData.getZbm()).setScale(0, BigDecimal.ROUND_HALF_UP)).
	@Override
	public List getCustomersInCity(String cityId,int firstPage,int maxPage) throws Exception {
		List<Customers> list =  crd.queryAllInCityInPage(cityId,firstPage,maxPage);
		List jsonList = new LinkedList();
		for(int i = 0;i<list.size();i++){
			Customers newData = list.get(i);
			JSONObject ctjson = new JSONObject();
			ctjson.put("id",newData.getZaa());
			ctjson.put("loan_amount",(new BigDecimal(newData.getZbm()).setScale(0, BigDecimal.ROUND_HALF_UP)));
			ctjson.put("loan_rate","");
			ctjson.put("credit_grade",newData.getBadratio());

			jsonList.add(ctjson);
		}

		return jsonList;
	}

	@Override
	public List getCreditRecordByType(String cityId, String category,int firstPage,int maxPage) throws Exception {
		List<Customers> list = null;
		List jsonList = new LinkedList();
		if("broken".equals(category)){
			list = crd.queryBrokenInCityInPage(cityId,firstPage,maxPage);
		}
		if("abided".equals(category)){
			list = crd.queryAbidedInCityInPage(cityId,firstPage,maxPage);
		}
		if (list != null) {
			for(int i = 0;i<list.size();i++){
				Customers newData = list.get(i);
				JSONObject ctjson = new JSONObject();
				ctjson.put("id",newData.getZaa());
				ctjson.put("loan_amount",(new BigDecimal(newData.getZbm()).setScale(0, BigDecimal.ROUND_HALF_UP)));
				ctjson.put("loan_rate","");
				ctjson.put("credit_grade",newData.getBadratio());
				jsonList.add(ctjson);
			}
		}

		if("none".equals(category)){
			list = crd.queryNoneInCityInPage(cityId,firstPage,maxPage);
			for(int i = 0;i<list.size();i++){
				Customers newData = list.get(i);
				JSONObject ctjson = new JSONObject();
				ctjson.put("id",newData.getZaa());
				int amout = (new BigDecimal(Double.parseDouble(newData.getAdviseloan())/10000).setScale(0, BigDecimal.ROUND_HALF_UP)).intValue();

				ctjson.put("loan_amount",amout*10000);
				ctjson.put("loan_rate","");
				ctjson.put("credit_grade",newData.getBadratio());
				jsonList.add(ctjson);
			}
		}


		return jsonList;
	}

	//@Override
	public List getCustomersByIdNew1(String applid) throws Exception {
		System.out.println("重构代码");
		//get all attributes
		List<AttributeItem> attrilist = AttributesUtil.getAttributes();
		Collections.sort(attrilist);
		//get all customers
		List<Customers> customers = crd.queryByApplid(applid);
		//json list
		List<JSONObject> jsonlist = new ArrayList<JSONObject>();

		for(Customers cust : customers){
			JSONObject group = new JSONObject();
			List<JSONObject> templist = new ArrayList<JSONObject>();;
			String pregroup = "";
			//present customer attris
			for(AttributeItem attri : attrilist){
				if(!attri.getGroupId().equals(pregroup)){
					pregroup = attri.getGroupId();
					//add group node
					group = new JSONObject();
					templist = new ArrayList<JSONObject>();
					group.put("name",pregroup);
					group.put("title", CodeLibrary.getItemName("oa_group_id", pregroup));
					group.put("fields", templist);
					jsonlist.add(group);
				}
				//add attributes
				String methodName = "get" + attri.getAttributeNo().substring(0, 1).toUpperCase() +  attri.getAttributeNo().substring(1);
				Method method;
				String value = null;
				try {
					method = cust.getClass().getDeclaredMethod(methodName, new Class[]{});
					value = (String) method.invoke(cust);
				} catch (Exception e) {
					e.printStackTrace();
				}
				JSONObject single = new JSONObject();
				single.put("name", attri.getAttributeNo());
				single.put("title", attri.getAttributeName());
				single.put("label",value);
				if(value != null && !value.isEmpty() && !"null".equals(value) && !"99999".equals(value)){
					single.put("value",value);
					if(attri.getDataFormat().equals("date"))
						single.put("value", DateTransUtil.transfer(value));
/*					if(!"null".equals(attri.getCodeNo())){
						System.out.println(attri.getCodeNo());
						single.put("value",CodeLibrary.getItemName(attri.getCodeNo(), value));
					}*/
				}else{
					single.put("value","");
				}
				single.put("avg",null);
				single.put("max",null);
				templist.add(single);
			}
		}

		return jsonlist;
	}

}
