package com.hdd.dao.impl;

import com.hdd.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by liuh on 2016/2/2.
 */
public class BaseDaoImpl<T> implements BaseDao {



    protected Class<T> entityClass;

    @Autowired
    private SessionFactory sessionFactory;


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Object findObject(Object id) throws Exception {
        return null;
    }

    @Override
    public List findObjectList() throws Exception {
        return null;
    }

    @Override
    public void deleteObject(Object entity) throws Exception {

    }

    @Override
    public void insertObject(Object entity) throws Exception {

    }

    @Override
    public void updateObject(Object entity) throws Exception {

    }

    @Override
    public List findObjectListByPagination(Integer page, Integer rows) throws Exception {
        return null;
    }

    @Override
    public Integer findCountObjectTotal() throws Exception {
        return null;
    }

    @Override
    public Integer findRecordCountByFiele(String fieldName, Long fieldValue, Class entity) {
        return null;
    }

    @Override
    public int excuteSql(String sql) throws Exception {
        return 0;
    }

    @Override
    public void deleteObjectByParams(Map params) throws Exception {

    }

    @Override
    public List findObjectListByParams(Map params) throws Exception {
        return null;
    }

    @Override
    public List find(Integer page, Integer rows, Map params) throws Exception {
        return null;
    }
}
