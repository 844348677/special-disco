package com.hdd.dao.impl;

import com.hdd.Entity.Lgd;
import com.hdd.dao.LgdDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuh on 2016/2/2.
 */
@Repository
public class LgdDaoImpl implements LgdDao {

    @Autowired
    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Lgd> queryByApplId(String appl_id) throws Exception {
        String hql = "FROM Lgd as lgd WHERE lgd.applid = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, appl_id);
        List<Lgd> list  = query.list();
        return list;
    }

    @Override
    public void insertLgd(Lgd lgd) throws Exception {
        sessionFactory.getCurrentSession().save(lgd);
    }
}
