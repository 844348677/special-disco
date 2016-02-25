package com.hdd.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hdd.Entity.Lgd;
import com.hdd.dao.LgdDao;
import com.hdd.service.LgdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by liuh on 2016/2/2.
 */
@Service("lgdServiceBase")
public class LgdServiceImpl implements LgdService {

    @Autowired
    protected LgdDao lgdDao;

    @Override
    public List getLgdByApplid(String applid) throws Exception {
        List<Lgd> list =  lgdDao.queryByApplId(applid);
        System.out.println("listsize:"+list.size());
        List jsonList = new LinkedList();
        for(int i=0;i<list.size();i++){
            Lgd lgd = list.get(i);
            JSONObject lgdjson = new JSONObject();
            lgdjson.put("id",lgd.getApplid());
            lgdjson.put("dot1",lgd.getAmout10000());
            lgdjson.put("dot2",lgd.getAmout20000());
            lgdjson.put("dot3",lgd.getAmout30000());
            lgdjson.put("dot4",lgd.getAmout40000());
            lgdjson.put("dot5",lgd.getAmout50000());
            lgdjson.put("dot6",lgd.getAmout60000());
            lgdjson.put("dot7",lgd.getAmout70000());
            lgdjson.put("dot8",lgd.getAmout80000());
            lgdjson.put("dot9",lgd.getAmout90000());
            lgdjson.put("dot10",lgd.getAmout100000());
            lgdjson.put("dot11",lgd.getAmout110000());
            lgdjson.put("dot12",lgd.getAmout120000());
            lgdjson.put("dot13",lgd.getAmout130000());
            lgdjson.put("dot14",lgd.getAmout140000());
            lgdjson.put("dot15",lgd.getAmout150000());
            lgdjson.put("dot16",lgd.getAmout160000());
            lgdjson.put("dot17",lgd.getAmout170000());
            lgdjson.put("dot18",lgd.getAmout180000());
            lgdjson.put("dot19",lgd.getAmout190000());
            lgdjson.put("dot20",lgd.getAmout200000());
            lgdjson.put("dot21",lgd.getAmout210000());
            lgdjson.put("dot22",lgd.getAmout220000());
            lgdjson.put("dot23",lgd.getAmout230000());
            lgdjson.put("dot24",lgd.getAmout240000());
            lgdjson.put("dot25",lgd.getAmout250000());
            lgdjson.put("dot26",lgd.getAmout260000());
            lgdjson.put("dot27",lgd.getAmout270000());
            lgdjson.put("dot28",lgd.getAmout280000());
            lgdjson.put("dot29",lgd.getAmout290000());
            lgdjson.put("dot30",lgd.getAmout300000());
            lgdjson.put("dot31",lgd.getAmout310000());
            lgdjson.put("dot32",lgd.getAmout320000());
            lgdjson.put("dot33",lgd.getAmout330000());
            lgdjson.put("dot34",lgd.getAmout340000());
            lgdjson.put("dot35",lgd.getAmout350000());
            lgdjson.put("dot36",lgd.getAmout360000());
            lgdjson.put("dot37",lgd.getAmout370000());
            lgdjson.put("dot38",lgd.getAmout380000());
            lgdjson.put("dot39",lgd.getAmout390000());
            lgdjson.put("dot40",lgd.getAmout400000());
            lgdjson.put("dot41",lgd.getAmout410000());
            lgdjson.put("dot42",lgd.getAmout420000());
            lgdjson.put("dot43",lgd.getAmout430000());
            lgdjson.put("dot44",lgd.getAmout440000());
            lgdjson.put("dot45",lgd.getAmout450000());
            lgdjson.put("dot46",lgd.getAmout460000());
            lgdjson.put("dot47",lgd.getAmout470000());
            lgdjson.put("dot48",lgd.getAmout480000());
            lgdjson.put("dot49",lgd.getAmout490000());

            jsonList.add(lgdjson);
        }

        return jsonList;
    }
}
