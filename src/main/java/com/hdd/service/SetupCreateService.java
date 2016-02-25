package com.hdd.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by liuh on 2016/2/15.
 */
public interface SetupCreateService {

    public Map<String,List> getValueMap();

    public JSONObject getEnumNum(List dataList);

    public Map<String,List> getContinueInfo(List continueInfo);

    public void  getRiskByName(String name);

    public JSONObject getCustomerByName(String name);

    public void getRiskAll();

    public void getCustoemrAll();

    public void savePoint();

}
