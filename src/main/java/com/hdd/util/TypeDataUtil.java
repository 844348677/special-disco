package com.hdd.util;

import com.alibaba.fastjson.JSONObject;
import com.hdd.Entity.SingletonSave;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by liuh on 2016/2/18.
 */
public class TypeDataUtil {



    public static String getType(String name){
        SingletonSave ssi = SingletonSave.getInstance();

        Map allPoint = ssi.getAllPoint();
        // Map allValue = ssi.getAllValue();
        List allPointList = (List) allPoint.get(name);

        if(allPointList!=null) {
            if (allPointList.size() == 30) {
                return "continuous";
            } else {
                return "discrete";
            }
        }else {
            return "";
        }

    }
    public static List<JSONObject>  getData(String name){
        SingletonSave ssi = SingletonSave.getInstance();

        Map allPoint = ssi.getAllPoint();
         Map allValue = ssi.getAllValue();
        List point = (List) allPoint.get(name);
        List value = (List) allValue.get(name);

        List<JSONObject> resultList = new LinkedList<JSONObject>(){};


        if(point !=null) {
            for (int i = 0; i < point.size(); i++) {
                JSONObject json = new JSONObject();
                json.put("x", value.get(i));
                json.put("y", point.get(i));


                resultList.add(json);
            }
            return resultList;
        }else {
            return null;
        }




    }
}
