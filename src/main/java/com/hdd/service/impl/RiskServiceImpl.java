package com.hdd.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hdd.Entity.Lgd;
import com.hdd.Entity.Risk;
import com.hdd.Entity.SingletonSave;
import com.hdd.dao.CustomersDao;
import com.hdd.dao.LgdDao;
import com.hdd.dao.RiskDao;
import com.hdd.service.RiskService;
import com.hdd.util.RankUtil;
import com.hdd.util.SaveUtil;
import com.hdd.util.TypeDataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by liuh on 2016/2/2.
 */
@Service("riskServiceBase")
public class RiskServiceImpl implements RiskService {

    @Autowired
    protected CustomersDao ctd;

    @Autowired
    protected LgdDao lgdDao;

    @Autowired
    protected RiskDao riskDao;

    @Override
    public List getRiskByApplid(String applid) throws Exception {
        List<Risk> list =  riskDao.queryByApplId(applid);
        //System.out.println("listsize:"+list.size());
        List jsonList = new LinkedList();

        for(int i=0;i<list.size();i++){
            Risk risk = list.get(i);
            //System.out.println("risk:"+risk.toString());
            JSONObject riskjson = new JSONObject();
            riskjson.put("totalscore",risk.getB19());
            riskjson.put("id",risk.getApplid());
            riskjson.put("x1",risk.getA11());
            riskjson.put("x2",risk.getA12());
            riskjson.put("x3",risk.getA13());
            riskjson.put("x4",risk.getA14());
            riskjson.put("x5",risk.getA15());
            riskjson.put("x6",risk.getA16());
            riskjson.put("x7",risk.getA17());
            riskjson.put("x8",risk.getA18());
            riskjson.put("x9",risk.getA19());

            riskjson.put("y1",risk.getB11());
            riskjson.put("y2",risk.getB12());
            riskjson.put("y3",risk.getB13());
            riskjson.put("y4",risk.getB14());
            riskjson.put("y5",risk.getB15());
            riskjson.put("y6",risk.getB16());
            riskjson.put("y7",risk.getB17());
            riskjson.put("y8",risk.getB18());

            jsonList.add(riskjson);
        }
       //System.out.println("jsonList:"+jsonList.toString());
        return jsonList;
    }

    @Override
    public List getRiskVariableByApplid(String applid) throws Exception {
        if(SingletonSave.getInstance().getAllPoint().size() == 0) {
            SaveUtil.saveRisk(riskDao);
            SaveUtil.saveCustomer(ctd);
        }

        List<Risk> list =  riskDao.queryByApplId(applid);
        //System.out.println("listsize:"+list.size());
        List jsonList = new LinkedList();

        for(int i=0;i<list.size();i++){
            Risk risk = list.get(i);
            //System.out.println("risk:"+risk.toString());

            /**
             {
             "name": "x1",
             "title": "贷记卡逾期指标",
             "description": "两年内贷记卡 逾期情况， 数值越高越严重",
             "label": "300",
             "value": 300,
             "avg": 200,
             "max": 700
             }

             BigDecimal bd   =   new   BigDecimal(minValue+binRular*(i+1));
             pointValue.add(bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
             */
            JSONObject riskjson1 = new JSONObject();
            riskjson1.put("name","x1");
            riskjson1.put("kind","variable");
            riskjson1.put("title","贷记卡逾期指标");
            riskjson1.put("description","两年内贷记卡逾期情况， 数值越高越严重");

            BigDecimal riskbd1   =   new   BigDecimal(risk.getA11());
            riskjson1.put("value",riskbd1.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            riskjson1.put("label",riskbd1.setScale(2,BigDecimal.ROUND_HALF_UP)+"");
            riskjson1.put("avg",null);
            riskjson1.put("max",null);
            String typeName1 = TypeDataUtil.getType("x1");
            List jsonDataList1 = TypeDataUtil.getData("x1");
            riskjson1.put("type",typeName1);
            riskjson1.put("data",jsonDataList1);

            JSONObject riskjson2 = new JSONObject();
            riskjson2.put("name","x2");
            riskjson2.put("kind","variable");
            riskjson2.put("title","半年信用查询指标");
            riskjson2.put("description","信用查询次数，数值越大查询越频繁");

            BigDecimal riskbd2   =   new   BigDecimal(risk.getA12());
            riskjson2.put("value",riskbd2.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            riskjson2.put("label",riskbd2.setScale(2,BigDecimal.ROUND_HALF_UP)+"");
            riskjson2.put("avg",null);
            riskjson2.put("max",null);
            String typeName2 = TypeDataUtil.getType("x2");
            List jsonDataList2 = TypeDataUtil.getData("x2");
            riskjson2.put("type",typeName2);
            riskjson2.put("data",jsonDataList2);

            JSONObject riskjson3 = new JSONObject();
            riskjson3.put("name","x3");
            riskjson3.put("kind","variable");
            riskjson3.put("title","租用住房");
            riskjson3.put("description","居住房屋属于租借或自购");
            riskjson3.put("label",risk.getA13());
            riskjson3.put("value",Double.parseDouble(risk.getA13()));
            riskjson3.put("avg",null);
            riskjson3.put("max",null);
            String typeName3 = TypeDataUtil.getType("x3");
            List jsonDataList3 = TypeDataUtil.getData("x3");
            riskjson3.put("type",typeName3);
            riskjson3.put("data",jsonDataList3);

            JSONObject riskjson4 = new JSONObject();
            riskjson4.put("name","x4");
            riskjson4.put("kind","variable");
            riskjson4.put("title","季度审批查询指标");
            riskjson4.put("description","贷款审批查询次数，数值越大查询越频繁");

            BigDecimal riskbd4   =   new   BigDecimal(risk.getA14());
            riskjson4.put("value",riskbd4.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            riskjson4.put("label",riskbd4.setScale(2,BigDecimal.ROUND_HALF_UP)+"");
            riskjson4.put("avg",null);
            riskjson4.put("max",null);
            String typeName4 = TypeDataUtil.getType("x4");
            List jsonDataList4 = TypeDataUtil.getData("x4");
            riskjson4.put("type",typeName4);
            riskjson4.put("data",jsonDataList4);

            JSONObject riskjson5 = new JSONObject();
            riskjson5.put("name","x5");
            riskjson5.put("kind","variable");
            riskjson5.put("title","非房贷笔数");
            riskjson5.put("description","非房贷的贷款笔数，数值越大笔数越多");
            riskjson5.put("label",risk.getA15());
            riskjson5.put("value",Double.parseDouble(risk.getA15()));
            riskjson5.put("avg",null);
            riskjson5.put("max",null);
            String typeName5 = TypeDataUtil.getType("x5");
            List jsonDataList5 = TypeDataUtil.getData("x5");
            riskjson5.put("type",typeName5);
            riskjson5.put("data",jsonDataList5);

            JSONObject riskjson6 = new JSONObject();
            riskjson6.put("name","x6");
            riskjson6.put("kind","variable");
            riskjson6.put("title","贷后查询指标");
            riskjson6.put("description","贷后管理查询记录，数值越大查询越频繁");

            BigDecimal riskbd6   =   new   BigDecimal(risk.getA16());
            riskjson6.put("value",riskbd6.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            riskjson6.put("label",riskbd6.setScale(2,BigDecimal.ROUND_HALF_UP)+"");
            riskjson6.put("avg",null);
            riskjson6.put("max",null);
            String typeName6 = TypeDataUtil.getType("x6");
            List jsonDataList6 = TypeDataUtil.getData("x6");
            riskjson6.put("type",typeName6);
            riskjson6.put("data",jsonDataList6);

            JSONObject riskjson7 = new JSONObject();
            riskjson7.put("name","x7");
            riskjson7.put("kind","variable");
            riskjson7.put("title","贷款负债压力");
            riskjson7.put("description","未结清贷款未来半年内需要归还的金额，对申请人所造成的负债压力");

            BigDecimal riskbd7   =   new   BigDecimal(risk.getA17());
            riskjson7.put("value",riskbd7.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            riskjson7.put("label",riskbd7.setScale(2,BigDecimal.ROUND_HALF_UP)+"");
            riskjson7.put("avg",null);
            riskjson7.put("max",null);
            String typeName7 = TypeDataUtil.getType("x7");
            List jsonDataList7 = TypeDataUtil.getData("x7");
            riskjson7.put("type",typeName7);
            riskjson7.put("data",jsonDataList7);

            JSONObject riskjson8 = new JSONObject();
            riskjson8.put("name","x8");
            riskjson8.put("kind","variable");
            riskjson8.put("title","结息水平");
            riskjson8.put("description","申请人提供的流水单中的季度结息统计，数值越大，结息越高");

            BigDecimal riskbd8   =   new   BigDecimal(risk.getA18());
            riskjson8.put("value",riskbd8.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            riskjson8.put("label",riskbd8.setScale(2,BigDecimal.ROUND_HALF_UP)+"");
            riskjson8.put("avg",null);
            riskjson8.put("max",null);
            String typeName8 = TypeDataUtil.getType("x8");
            List jsonDataList8 = TypeDataUtil.getData("x8");
            riskjson8.put("type",typeName8);
            riskjson8.put("data",jsonDataList8);

            JSONObject riskjson9 = new JSONObject();
            riskjson9.put("name","x9");
            riskjson9.put("kind","variable");
            riskjson9.put("title","担保资格查询指标");
            riskjson9.put("description","两年内担保资格查询次数高低，数值越大查询越频繁");

            BigDecimal riskbd9   =   new   BigDecimal(risk.getA19());
            riskjson9.put("value",riskbd9.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
            riskjson9.put("label",riskbd9.setScale(2,BigDecimal.ROUND_HALF_UP)+"");
            riskjson9.put("avg",null);
            riskjson9.put("max",null);
            String typeName9 = TypeDataUtil.getType("x9");
            List jsonDataList9 = TypeDataUtil.getData("x9");
            riskjson9.put("type",typeName9);
            riskjson9.put("data",jsonDataList9);


            jsonList.add(riskjson1);
            jsonList.add(riskjson2);
            jsonList.add(riskjson3);
            jsonList.add(riskjson4);
            jsonList.add(riskjson5);
            jsonList.add(riskjson6);
            jsonList.add(riskjson7);
            jsonList.add(riskjson8);
            jsonList.add(riskjson9);


        }
        //System.out.println("jsonList:"+jsonList.toString());
        return jsonList;
    }

    @Override
    public List getRiskResultByApplid(String applid) throws Exception {


        List<Risk> list =  riskDao.queryByApplId(applid);
        //System.out.println("listsize:"+list.size());
        List jsonList = new LinkedList();

        for(int i=0;i<list.size();i++) {
            Risk risk = list.get(i);

            SingletonSave ss = SingletonSave.getInstance();
            Map avgMap = ss.getAvgMap();
            /**
             *
             {
             "name": "grade",
             "title": "评级",
             "description": "",
             "label": "B",
             "value": 300,
             "avg": 200,
             "max": 700,
             "variables": [
             "x1",
             "x2",
             "x3",
             "x4",
             "x5",
             "x6",
             "x7",
             "x8",
             "x9"
             ]
             }
             *
             */

            JSONObject riskjson1 = new JSONObject();
            riskjson1.put("name","grade");
            riskjson1.put("kind","result");
            riskjson1.put("title","评级");
            riskjson1.put("description","");
            riskjson1.put("label","");
            riskjson1.put("value",Double.parseDouble(risk.getB19()));
            riskjson1.put("avg",avgMap.get("y9"));
            //riskjson1.put("max",null);
            List<String> list1 = new LinkedList<String>();
            list1.add("x1");
            list1.add("x2");
            list1.add("x3");
            list1.add("x4");
            list1.add("x5");
            list1.add("x6");
            list1.add("x7");
            list1.add("x8");
            list1.add("x9");
            riskjson1.put("variables",list1);
            String typeName1 = TypeDataUtil.getType("y9");
            List<JSONObject> jsonDataList1 = TypeDataUtil.getData("y9");
            if(jsonDataList1 != null)
                riskjson1.put("max",jsonDataList1.get(jsonDataList1.size()-1).get("x"));
            riskjson1.put("type",typeName1);
            riskjson1.put("data",jsonDataList1);

            List scoreList = ss.getScoreList();
            int scoreSortInt = RankUtil.getRank(scoreList,risk.getB19());
            System.out.println("人物排名:"+scoreSortInt);

            JSONObject riskjson2 = new JSONObject();
            riskjson2.put("name","rank");
            riskjson2.put("kind","result");
            riskjson2.put("title","人群排名");
            riskjson2.put("description","");
            riskjson2.put("label",scoreSortInt+"名");
            riskjson2.put("value",scoreSortInt);
            riskjson2.put("avg",avgMap.get("y2"));
            riskjson2.put("max",null);
            List<String> list2 = new LinkedList<String>();
/*            list2.add("x1");
            list2.add("x2");
            list2.add("x3");
            list2.add("x4");
            list2.add("x5");
            list2.add("x6");
            list2.add("x7");
            list2.add("x8");
            list2.add("x9");*/
            riskjson2.put("variables",list2);
            String typeName2 = TypeDataUtil.getType("y2");
            List jsonDataList2 = TypeDataUtil.getData("y2");
            riskjson2.put("type","continuous");
            riskjson2.put("data",new LinkedList());

            JSONObject riskjson3 = new JSONObject();
            riskjson3.put("name","break_rate");
            riskjson3.put("kind","result");
            riskjson3.put("title","违约率");
            riskjson3.put("description","");
            riskjson3.put("label",Double.parseDouble(risk.getB11())*100+"%");
            riskjson3.put("value",Double.parseDouble(risk.getB11()));
            riskjson3.put("avg",avgMap.get("y1"));
            //riskjson3.put("max",null);
            List<String> list3 = new LinkedList<String>();
/*            list3.add("x1");
            list3.add("x2");
            list3.add("x3");
            list3.add("x4");*/
            list3.add("x5");
            list3.add("x6");
            list3.add("x7");
            list3.add("x8");
            list3.add("x9");
            riskjson3.put("variables",list3);
            String typeName3 = TypeDataUtil.getType("y1");
            List<JSONObject> jsonDataList3 = TypeDataUtil.getData("y1");
            riskjson3.put("type",typeName3);
            if(jsonDataList3 != null)
                riskjson3.put("max",jsonDataList3.get(jsonDataList3.size()-1).get("x"));
            riskjson3.put("data",jsonDataList3);

            JSONObject riskjson4 = new JSONObject();
            riskjson4.put("name","loan_amount");
            riskjson4.put("kind","result");
            riskjson4.put("title","放款额度");
            riskjson4.put("description","");
            riskjson4.put("label",new BigDecimal(Double.parseDouble(risk.getB13())/10000).setScale(0, BigDecimal.ROUND_HALF_UP)+"万");
            riskjson4.put("value",Double.parseDouble(risk.getB13()));
            riskjson4.put("avg",avgMap.get("y3"));
            //riskjson4.put("max",null);
            List<String> list4 = new LinkedList<String>();
            list4.add("x1");
            list4.add("x2");
            list4.add("x3");
            list4.add("x4");
            list4.add("x5");
            list4.add("x6");
            list4.add("x7");
            list4.add("x8");
            list4.add("x9");
            riskjson4.put("variables",list4);
            String typeName4 = TypeDataUtil.getType("y3");
            List<JSONObject> jsonDataList4 = TypeDataUtil.getData("y3");
            riskjson4.put("type",typeName4);
            if(jsonDataList4 != null)
                riskjson4.put("max",jsonDataList4.get(jsonDataList4.size()-1).get("x"));
            riskjson4.put("data",jsonDataList4);

            JSONObject riskjson5 = new JSONObject();
            riskjson5.put("name","loan_rate");
            riskjson5.put("kind","result");
            riskjson5.put("title","放款利率");
            riskjson5.put("description","");
            riskjson5.put("label","");
            riskjson5.put("value",null);
            riskjson5.put("avg",avgMap.get("y5"));
            riskjson5.put("max",null);
            List<String> list5 = new LinkedList<String>();
            list5.add("x1");
            list5.add("x2");
            list5.add("x3");
/*            list5.add("x4");
            list5.add("x5");*/
            list5.add("x6");
            list5.add("x7");
            list5.add("x8");
            list5.add("x9");
            riskjson5.put("variables",list5);
            String typeName5 = TypeDataUtil.getType("y5");
            List<JSONObject> jsonDataList5 = TypeDataUtil.getData("y5");
            riskjson5.put("type","continuous");
            riskjson5.put("data",new LinkedList());

            JSONObject riskjson6 = new JSONObject();
            riskjson6.put("name","credit_management_ability");
            riskjson6.put("kind","result");
            riskjson6.put("title","信用管理能力");
            riskjson6.put("description","多维度考量申请人的信用透支的管理能力，如借款需求、按期还款的习惯");
            riskjson6.put("label",risk.getB16());
            riskjson6.put("value",Double.parseDouble(risk.getB16()));
            riskjson6.put("avg",avgMap.get("y6"));
            //riskjson6.put("max",null);
            List<String> list6 = new LinkedList<String>();
            list6.add("x1");
            list6.add("x2");
            list6.add("x3");
            list6.add("x4");
            list6.add("x5");
            list6.add("x6");
            list6.add("x7");
/*            list6.add("x8");
            list6.add("x9");*/
            riskjson6.put("variables",list6);
            String typeName6 = TypeDataUtil.getType("y6");
            List<JSONObject> jsonDataList6 = TypeDataUtil.getData("y6");
            riskjson6.put("type",typeName6);
            if(jsonDataList6 != null)
                riskjson6.put("max",jsonDataList6.get(jsonDataList6.size()-1).get("x"));
            riskjson6.put("data",jsonDataList6);

            JSONObject riskjson7 = new JSONObject();
            riskjson7.put("name","credit_status");
            riskjson7.put("kind","result");
            riskjson7.put("title","近期信用状态");
            riskjson7.put("description","近期申请人住房情况及信用是否稳定");
            riskjson7.put("label",risk.getB17());
            riskjson7.put("value",Double.parseDouble(risk.getB17()));
            riskjson7.put("avg",avgMap.get("y7"));
            //riskjson7.put("max",null);
            List<String> list7 = new LinkedList<String>();
            list7.add("x1");
            list7.add("x2");
            list7.add("x3");
            list7.add("x4");
            list7.add("x5");
            list7.add("x6");
/*            list7.add("x7");
            list7.add("x8");*/
            list7.add("x9");
            riskjson7.put("variables",list7);
            String typeName7 = TypeDataUtil.getType("y7");
            List<JSONObject> jsonDataList7 = TypeDataUtil.getData("y7");
            riskjson7.put("type",typeName7);
            if(jsonDataList7 != null)
                riskjson7.put("max",jsonDataList7.get(jsonDataList7.size()-1).get("x"));
            riskjson7.put("data",jsonDataList7);

            JSONObject riskjson8 = new JSONObject();
            riskjson8.put("name","loan_comprehensive_qualification");
            riskjson8.put("kind","result");
            riskjson8.put("title","贷款综合资质");
            riskjson8.put("description","综合考虑申请人的贷款信用记录、银行流水、负债和偿债能力");
            riskjson8.put("label",risk.getB18());
            riskjson8.put("value",Double.parseDouble(risk.getB18()));
            riskjson8.put("avg",avgMap.get("y8"));
            //riskjson8.put("max",null);
            List<String> list8 = new LinkedList<String>();
            list8.add("x1");
  /*          list8.add("x2");
            list8.add("x3");
            list8.add("x4");
            list8.add("x5");
            list8.add("x6");*/
            list8.add("x7");
            list8.add("x8");
            list8.add("x9");
            riskjson8.put("variables",list8);
            String typeName8 = TypeDataUtil.getType("y8");
            List<JSONObject> jsonDataList8 = TypeDataUtil.getData("y8");
            riskjson8.put("type",typeName8);
            if(jsonDataList8 != null)
                riskjson8.put("max",jsonDataList8.get(jsonDataList8.size()-1).get("x"));
            riskjson8.put("data",jsonDataList8);

            JSONObject riskjson9 = new JSONObject();
            riskjson9.put("name","lgd");
            riskjson9.put("kind","result");
            riskjson9.put("title","违约损失率");
            riskjson9.put("description","");
            riskjson9.put("label","");
            riskjson9.put("value",null);
            riskjson9.put("avg",null);
            riskjson9.put("max",null);
            List<String> list9 = new LinkedList<String>();
            list9.add("x1");
            list9.add("x2");
            list9.add("x3");
            list9.add("x4");
            list9.add("x5");
            list9.add("x6");
            list9.add("x7");
            list9.add("x8");
            list9.add("x9");
            riskjson1.put("variables",list9);
/*            String typeName9 = TypeDataUtil.getType("y9");
            List<JSONObject> jsonDataList9 = TypeDataUtil.getData("y9");*/
            riskjson9.put("type","continuous");
            List lgdList = this.getLgdByApplid(applid);
            riskjson9.put("data",lgdList);

            JSONObject riskjson10 = new JSONObject();
            riskjson10.put("name","expect_profit_rate");
            riskjson10.put("kind","result");
            riskjson10.put("title","预期收益率");
            riskjson10.put("description","");
            riskjson10.put("label","");
            riskjson10.put("value",null);
            riskjson10.put("avg",null);
            riskjson10.put("max",null);
            List<String> list10 = new LinkedList<String>();
            list10.add("x1");
            list10.add("x2");
            list10.add("x3");
/*            list10.add("x4");
            list10.add("x5");
            list10.add("x6");
            list10.add("x7");
            list10.add("x8");
            list10.add("x10");*/
            riskjson1.put("variables",list10);
            String typeName10 = TypeDataUtil.getType("y10");
            List<JSONObject> jsonDataList10 = TypeDataUtil.getData("y10");
            riskjson10.put("type","continuous");
            riskjson10.put("data",new LinkedList());

            jsonList.add(riskjson1);
            jsonList.add(riskjson2);
            jsonList.add(riskjson3);
            jsonList.add(riskjson4);
            jsonList.add(riskjson5);
            jsonList.add(riskjson9);
            jsonList.add(riskjson10);
            jsonList.add(riskjson6);
            jsonList.add(riskjson7);
            jsonList.add(riskjson8);

        }


        return jsonList;
    }


    public List getLgdByApplid(String applid) throws Exception {
        List<Lgd> list =  lgdDao.queryByApplId(applid);
        System.out.println("listsize:"+list.size());
        List jsonList = new LinkedList();
        for(int i=0;i<list.size();i++){
            Lgd lgd = list.get(i);

/*            JSONObject lgdjson1 = new JSONObject();
            lgdjson1.put("x",1);
            lgdjson1.put("y",lgd.getAmout10000());
            jsonList.add(lgdjson1);*/

            JSONObject lgdjson1 = new JSONObject();
            lgdjson1.put("x",1);
            lgdjson1.put("y",lgd.getAmout10000());
            jsonList.add(lgdjson1);
            JSONObject lgdjson2 = new JSONObject();
            lgdjson2.put("x",2);
            lgdjson2.put("y",lgd.getAmout20000());
            jsonList.add(lgdjson2);
            JSONObject lgdjson3 = new JSONObject();
            lgdjson3.put("x",3);
            lgdjson3.put("y",lgd.getAmout30000());
            jsonList.add(lgdjson3);
            JSONObject lgdjson4 = new JSONObject();
            lgdjson4.put("x",4);
            lgdjson4.put("y",lgd.getAmout40000());
            jsonList.add(lgdjson4);
            JSONObject lgdjson5 = new JSONObject();
            lgdjson5.put("x",5);
            lgdjson5.put("y",lgd.getAmout50000());
            jsonList.add(lgdjson5);
            JSONObject lgdjson6 = new JSONObject();
            lgdjson6.put("x",6);
            lgdjson6.put("y",lgd.getAmout60000());
            jsonList.add(lgdjson6);
            JSONObject lgdjson7 = new JSONObject();
            lgdjson7.put("x",7);
            lgdjson7.put("y",lgd.getAmout70000());
            jsonList.add(lgdjson7);
            JSONObject lgdjson8 = new JSONObject();
            lgdjson8.put("x",8);
            lgdjson8.put("y",lgd.getAmout80000());
            jsonList.add(lgdjson8);
            JSONObject lgdjson9 = new JSONObject();
            lgdjson9.put("x",9);
            lgdjson9.put("y",lgd.getAmout90000());
            jsonList.add(lgdjson9);
            JSONObject lgdjson10 = new JSONObject();
            lgdjson10.put("x",10);
            lgdjson10.put("y",lgd.getAmout100000());
            jsonList.add(lgdjson10);
            JSONObject lgdjson11 = new JSONObject();
            lgdjson11.put("x",11);
            lgdjson11.put("y",lgd.getAmout110000());
            jsonList.add(lgdjson11);
            JSONObject lgdjson12 = new JSONObject();
            lgdjson12.put("x",12);
            lgdjson12.put("y",lgd.getAmout120000());
            jsonList.add(lgdjson12);
            JSONObject lgdjson13 = new JSONObject();
            lgdjson13.put("x",13);
            lgdjson13.put("y",lgd.getAmout130000());
            jsonList.add(lgdjson13);
            JSONObject lgdjson14 = new JSONObject();
            lgdjson14.put("x",14);
            lgdjson14.put("y",lgd.getAmout140000());
            jsonList.add(lgdjson14);
            JSONObject lgdjson15 = new JSONObject();
            lgdjson15.put("x",15);
            lgdjson15.put("y",lgd.getAmout150000());
            jsonList.add(lgdjson15);
            JSONObject lgdjson16 = new JSONObject();
            lgdjson16.put("x",16);
            lgdjson16.put("y",lgd.getAmout160000());
            jsonList.add(lgdjson16);
            JSONObject lgdjson17 = new JSONObject();
            lgdjson17.put("x",17);
            lgdjson17.put("y",lgd.getAmout170000());
            jsonList.add(lgdjson17);
            JSONObject lgdjson18 = new JSONObject();
            lgdjson18.put("x",18);
            lgdjson18.put("y",lgd.getAmout180000());
            jsonList.add(lgdjson18);
            JSONObject lgdjson19 = new JSONObject();
            lgdjson19.put("x",19);
            lgdjson19.put("y",lgd.getAmout190000());
            jsonList.add(lgdjson19);
            JSONObject lgdjson20 = new JSONObject();
            lgdjson20.put("x",20);
            lgdjson20.put("y",lgd.getAmout200000());
            jsonList.add(lgdjson20);
            JSONObject lgdjson21 = new JSONObject();
            lgdjson21.put("x",21);
            lgdjson21.put("y",lgd.getAmout210000());
            jsonList.add(lgdjson21);
            JSONObject lgdjson22 = new JSONObject();
            lgdjson22.put("x",22);
            lgdjson22.put("y",lgd.getAmout220000());
            jsonList.add(lgdjson22);
            JSONObject lgdjson23 = new JSONObject();
            lgdjson23.put("x",23);
            lgdjson23.put("y",lgd.getAmout230000());
            jsonList.add(lgdjson23);
            JSONObject lgdjson24 = new JSONObject();
            lgdjson24.put("x",24);
            lgdjson24.put("y",lgd.getAmout240000());
            jsonList.add(lgdjson24);
            JSONObject lgdjson25 = new JSONObject();
            lgdjson25.put("x",25);
            lgdjson25.put("y",lgd.getAmout250000());
            jsonList.add(lgdjson25);
            JSONObject lgdjson26 = new JSONObject();
            lgdjson26.put("x",26);
            lgdjson26.put("y",lgd.getAmout260000());
            jsonList.add(lgdjson26);
            JSONObject lgdjson27 = new JSONObject();
            lgdjson27.put("x",27);
            lgdjson27.put("y",lgd.getAmout270000());
            jsonList.add(lgdjson27);
            JSONObject lgdjson28 = new JSONObject();
            lgdjson28.put("x",28);
            lgdjson28.put("y",lgd.getAmout280000());
            jsonList.add(lgdjson28);
            JSONObject lgdjson29 = new JSONObject();
            lgdjson29.put("x",29);
            lgdjson29.put("y",lgd.getAmout290000());
            jsonList.add(lgdjson29);
            JSONObject lgdjson30 = new JSONObject();
            lgdjson30.put("x",30);
            lgdjson30.put("y",lgd.getAmout300000());
            jsonList.add(lgdjson30);
            JSONObject lgdjson31 = new JSONObject();
            lgdjson31.put("x",31);
            lgdjson31.put("y",lgd.getAmout310000());
            jsonList.add(lgdjson31);
            JSONObject lgdjson32 = new JSONObject();
            lgdjson32.put("x",32);
            lgdjson32.put("y",lgd.getAmout320000());
            jsonList.add(lgdjson32);
            JSONObject lgdjson33 = new JSONObject();
            lgdjson33.put("x",33);
            lgdjson33.put("y",lgd.getAmout330000());
            jsonList.add(lgdjson33);
            JSONObject lgdjson34 = new JSONObject();
            lgdjson34.put("x",34);
            lgdjson34.put("y",lgd.getAmout340000());
            jsonList.add(lgdjson34);
            JSONObject lgdjson35 = new JSONObject();
            lgdjson35.put("x",35);
            lgdjson35.put("y",lgd.getAmout350000());
            jsonList.add(lgdjson35);
            JSONObject lgdjson36 = new JSONObject();
            lgdjson36.put("x",36);
            lgdjson36.put("y",lgd.getAmout360000());
            jsonList.add(lgdjson36);
            JSONObject lgdjson37 = new JSONObject();
            lgdjson37.put("x",37);
            lgdjson37.put("y",lgd.getAmout370000());
            jsonList.add(lgdjson37);
            JSONObject lgdjson38 = new JSONObject();
            lgdjson38.put("x",38);
            lgdjson38.put("y",lgd.getAmout380000());
            jsonList.add(lgdjson38);
            JSONObject lgdjson39 = new JSONObject();
            lgdjson39.put("x",39);
            lgdjson39.put("y",lgd.getAmout390000());
            jsonList.add(lgdjson39);
            JSONObject lgdjson40 = new JSONObject();
            lgdjson40.put("x",40);
            lgdjson40.put("y",lgd.getAmout400000());
            jsonList.add(lgdjson40);
            JSONObject lgdjson41 = new JSONObject();
            lgdjson41.put("x",41);
            lgdjson41.put("y",lgd.getAmout410000());
            jsonList.add(lgdjson41);
            JSONObject lgdjson42 = new JSONObject();
            lgdjson42.put("x",42);
            lgdjson42.put("y",lgd.getAmout420000());
            jsonList.add(lgdjson42);
            JSONObject lgdjson43 = new JSONObject();
            lgdjson43.put("x",43);
            lgdjson43.put("y",lgd.getAmout430000());
            jsonList.add(lgdjson43);
            JSONObject lgdjson44 = new JSONObject();
            lgdjson44.put("x",44);
            lgdjson44.put("y",lgd.getAmout440000());
            jsonList.add(lgdjson44);
            JSONObject lgdjson45 = new JSONObject();
            lgdjson45.put("x",45);
            lgdjson45.put("y",lgd.getAmout450000());
            jsonList.add(lgdjson45);
            JSONObject lgdjson46 = new JSONObject();
            lgdjson46.put("x",46);
            lgdjson46.put("y",lgd.getAmout460000());
            jsonList.add(lgdjson46);
            JSONObject lgdjson47 = new JSONObject();
            lgdjson47.put("x",47);
            lgdjson47.put("y",lgd.getAmout470000());
            jsonList.add(lgdjson47);
            JSONObject lgdjson48 = new JSONObject();
            lgdjson48.put("x",48);
            lgdjson48.put("y",lgd.getAmout480000());
            jsonList.add(lgdjson48);
            JSONObject lgdjson49 = new JSONObject();
            lgdjson49.put("x",49);
            lgdjson49.put("y",lgd.getAmout490000());
            jsonList.add(lgdjson49);


        }

        return jsonList;
    }

}
