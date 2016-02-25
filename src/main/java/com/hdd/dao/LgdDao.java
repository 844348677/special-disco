package com.hdd.dao;

import com.hdd.Entity.Lgd;

import java.util.List;

/**
 * Created by liuh on 2016/2/2.
 */
public interface LgdDao {

    List<Lgd> queryByApplId(String appl_id) throws Exception;

    void insertLgd(Lgd lgd) throws Exception;
}
