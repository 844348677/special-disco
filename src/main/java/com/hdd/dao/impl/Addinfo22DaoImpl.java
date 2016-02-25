package com.hdd.dao.impl;

import com.hdd.Entity.Add_info_22;
import com.hdd.dao.Addinfo22Dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liuh on 2016/1/26.
 */
@Repository
public class Addinfo22DaoImpl implements Addinfo22Dao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;  
	}  
	
	@SuppressWarnings("unchecked")
    public List<Add_info_22> queryAll() throws Exception {

        String hql = "FROM Add_info_22 ";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List<Add_info_22> list = query.list();

        return list;
    }


    @SuppressWarnings("unchecked")
    public List<Add_info_22> queryById(String id) throws Exception {

        String hql = "FROM Add_info_22 as ai WHERE ai.id = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, id);
        List<Add_info_22> list = query.list();

  

        return list;
    }


    @SuppressWarnings("unchecked")
    public List<Add_info_22> queryByApplId(String appl_id) throws Exception {

        String hql = "FROM Add_info_22 as ai WHERE ai.APPL_ID = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, appl_id);
        List<Add_info_22> list = query.list();



        return list;
    }
}
