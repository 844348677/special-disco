package com.hdd.dao.impl;

import com.hdd.Entity.Risk;
import com.hdd.dao.RiskDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuh on 2016/2/2.
 */
@Repository
public class RiskDaoImpl implements RiskDao {

    @Autowired
    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Risk> queryByApplId(String appl_id) throws Exception {
        String hql = "FROM Risk as risk WHERE risk.applid = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, appl_id);
        List<Risk> list  = query.list();
        return list;
    }

    @Override
    public List<Risk> queryAll() throws Exception {
        String hql = "select * from risk";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Risk.class);
        List<Risk> list = query.list();

        return list;
    }

    @Override
    public void insertRisk(Risk risk) throws Exception {
        sessionFactory.getCurrentSession().save(risk);
    }
}
