package com.hdd.dao;

import com.hdd.Entity.Risk;

import java.util.List;

/**
 * Created by liuh on 2016/2/2.
 */
public interface RiskDao {

    List<Risk> queryByApplId(String appl_id) throws Exception;

    List<Risk> queryAll() throws Exception;

    void insertRisk(Risk risk) throws Exception;
}
