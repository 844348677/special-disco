package com.hdd.service;

import java.util.List;

/**
 * Created by liuh on 2016/2/2.
 */
public interface RiskService {

    public List getRiskByApplid(String applid)  throws Exception;

    public List getRiskVariableByApplid(String applid)  throws Exception;

    public List getRiskResultByApplid(String applid)  throws Exception;

}
