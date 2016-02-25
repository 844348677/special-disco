package com.hdd.Entity;

import java.util.*;

/**
 * Created by liuh on 2016/2/17.
 */
public class SingletonSave {
    private static SingletonSave instance;

    private Map riskDiscrete;

    private Map riskContinuous;

    private Map customerDiscrete;

    private Map customerContinuous;

    private Map riskValue = new TreeMap();

    private Map customerValue = new TreeMap();

    private Map riskPoint = new TreeMap();

    private Map customerPoint = new TreeMap();

    private Map allPoint = new TreeMap();

    private Map allValue = new TreeMap();

    private Map avgMap = new HashMap();

    private Map maxMap = new HashMap();

    private List<Integer> scoreList = new ArrayList<Integer>();

    public List<Integer> getScoreList() {
        return scoreList;
    }

    public void setScoreList(List<Integer> scoreList) {
        this.scoreList = scoreList;
    }

    public Map getAvgMap() {
        return avgMap;
    }

    public void setAvgMap(Map avgMap) {
        this.avgMap = avgMap;
    }

    public Map getMaxMap() {
        return maxMap;
    }

    public void setMaxMap(Map maxMap) {
        this.maxMap = maxMap;
    }

    public Map getAllValue() {
        return allValue;
    }

    public void setAllValue(Map allValue) {
        this.allValue = allValue;
    }

    public Map getAllPoint() {
        return allPoint;
    }

    public void setAllPoint(Map allPoint) {
        this.allPoint = allPoint;
    }

    public Map getRiskValue() {
        return riskValue;
    }

    public void setRiskValue(Map riskValue) {
        this.riskValue = riskValue;
    }

    public Map getCustomerValue() {
        return customerValue;
    }

    public void setCustomerValue(Map customerValue) {
        this.customerValue = customerValue;
    }

    public Map getRiskPoint() {
        return riskPoint;
    }

    public void setRiskPoint(Map riskPoint) {
        this.riskPoint = riskPoint;
    }

    public Map getCustomerPoint() {
        return customerPoint;
    }

    public void setCustomerPoint(Map customerPoint) {
        this.customerPoint = customerPoint;
    }

    private SingletonSave() {
    }

    public static synchronized SingletonSave getInstance() {
        if (instance == null) {
            instance = new SingletonSave();
        }
        return instance;
    }

    public static void setInstance(SingletonSave instance) {
        SingletonSave.instance = instance;
    }

    public Map getRiskDiscrete() {
        return riskDiscrete;
    }

    public void setRiskDiscrete(Map riskDiscrete) {
        this.riskDiscrete = riskDiscrete;
    }

    public Map getRiskContinuous() {
        return riskContinuous;
    }

    public void setRiskContinuous(Map riskContinuous) {
        this.riskContinuous = riskContinuous;
    }

    public Map getCustomerDiscrete() {
        return customerDiscrete;
    }

    public void setCustomerDiscrete(Map customerDiscrete) {
        this.customerDiscrete = customerDiscrete;
    }

    public Map getCustomerContinuous() {
        return customerContinuous;
    }

    public void setCustomerContinuous(Map customerContinuous) {
        this.customerContinuous = customerContinuous;
    }
}