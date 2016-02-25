package com.hdd.dao.impl;

import java.util.List;

import com.hdd.Entity.CreditRecord;
import com.hdd.dao.CreditRecordDao;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CreditRecordDaoImpl implements CreditRecordDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;  
	}  

	@SuppressWarnings("unchecked")
	public List<CreditRecord> getAllCreditRecord() {
		// TODO Auto-generated method stub
		String hql = "from CreditRecord";  
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);

	    return (List<CreditRecord>)query.list(); 
	}

	public CreditRecord getCreditRecord(String zaa) {
		// TODO Auto-generated method stub
		   	String hql = "from CreditRecord cr where cr.zaa=?";  
		    Query query = sessionFactory.getCurrentSession().createQuery(hql);  
		    query.setString(0, zaa);  

		    return (CreditRecord)query.uniqueResult(); 
	}
	
	 public List<CreditRecord> queryAll() throws Exception {
	        return null;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<CreditRecord> queryById(String id) throws Exception {
	    	
	        String hql = "FROM NewData as nd WHERE nd.id = ?";
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);
	        query.setString(0, id);
	        List<CreditRecord> list  = query.list();
	        
	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<CreditRecord> queryByApplId(String appl_id) throws Exception {
	        
	        String hql = "FROM NewData as nd WHERE nd.zaa = ?";
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);
	        query.setString(0, appl_id);
	        List<CreditRecord> list  = query.list();


	       

	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<CreditRecord> queryAllInCity(String cityId) throws Exception {

	        
	        String hql = "select * from newdata where zaa in (select APPL_ID from add_info_22 where 签约城市= ?)";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
	        query.setString(0, cityId);
	        List<CreditRecord> list  = query.list();



	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<CreditRecord> queryBrokenInCity(String cityId) throws Exception {

	        String hql = "select * from newdata where zae = 1 and zaa in (select APPL_ID from add_info_22 where 签约城市= ?)";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
	        query.setString(0, cityId);
	        List<CreditRecord> list  = query.list();

	

	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<CreditRecord> queryAbidedInCity(String cityId) throws Exception {
	        
	        String hql = "select * from newdata where zae = 0 and zaa in (select APPL_ID from add_info_22 where 签约城市= ?)";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
	        query.setString(0, cityId);
	        List<CreditRecord> list  = query.list();

	       

	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<CreditRecord> queryNoneInCity(String cityId) throws Exception {
	       
	        String hql = "select * from newdata where zaa in (select APPL_ID from add_info_22 where 签约城市= ?)  and zac is null ";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql);
	        query.setString(0, cityId);
	        List<CreditRecord> list  = query.list();

	        return list;
	    }

}
