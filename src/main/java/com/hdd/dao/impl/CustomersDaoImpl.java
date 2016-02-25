package com.hdd.dao.impl;

import com.hdd.Entity.CreditRecord;
import com.hdd.Entity.Customers;
import com.hdd.dao.CustomersDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomersDaoImpl implements CustomersDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {  
	    this.sessionFactory = sessionFactory;  
	}

/*	@SuppressWarnings("unchecked")
	public List<Customers> getAllCreditRecord() {
		// TODO Auto-generated method stub
		String hql = "from Customers";
	    Query query = sessionFactory.getCurrentSession().createQuery(hql);

	    return (List<Customers>)query.list();
	}

	public Customers getCreditRecord(String zaa) {
		// TODO Auto-generated method stub
		   	String hql = "from Customers cr where cr.zaa=?";
		    Query query = sessionFactory.getCurrentSession().createQuery(hql);
		    query.setString(0, zaa);

		    return (Customers)query.uniqueResult();
	}*/

	 public List<Customers> queryAll() throws Exception {
	        return null;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<Customers> queryById(String id) throws Exception {
	    	
	        String hql = "FROM NewData as nd WHERE nd.id = ?";
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);
	        query.setString(0, id);
	        List<Customers> list  = query.list();
	        
	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<Customers> queryByApplid(String appl_id) throws Exception {
	        
	        String hql = "FROM Customers as ct WHERE ct.zaa = ?";
	        Query query = sessionFactory.getCurrentSession().createQuery(hql);
	        query.setString(0, appl_id);
	        List<Customers> list  = query.list();

	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<Customers> queryAllInCity(String cityId) throws Exception {

	        
	        //String hql = "select * from newdata where zaa in (select APPL_ID from add_info_22 where 签约城市= ?)";
			String hql = "select * from newdata where creditgrade IS NOT NULL ";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);
	        //query.setString(0, cityId);
	        List<Customers> list  = query.list();

	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<Customers> queryBrokenInCity(String cityId) throws Exception {

	        //String hql = "select * from newdata where zae = 1 and zaa in (select APPL_ID from add_info_22 where 签约城市= ?)";
			String hql = "select * from newdata where  zae = 1 and creditgrade IS NOT NULL and zac IS NOT NULL ";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);
			//query.setString(0, cityId);
	        List<Customers> list  = query.list();

	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<Customers> queryAbidedInCity(String cityId) throws Exception {
	        
	        //String hql = "select * from newdata where zae = 0 and zaa in (select APPL_ID from add_info_22 where 签约城市= ?)";
			String hql = "select * from newdata where  zae = 0 and creditgrade IS NOT NULL and zac IS NOT NULL ";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);
	        //query.setString(0, cityId);
	        List<Customers> list  = query.list();

	        return list;
	    }


	 	@SuppressWarnings("unchecked")
	    public List<Customers> queryNoneInCity(String cityId) throws Exception {
	       
	        String hql = "select * from newdata where creditgrade IS NOT NULL  and zac is null ";
	        Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);
	        //query.setString(0, cityId);
	        List<Customers> list  = query.list();

	        return list;
	    }

	@Override
	public List<Customers> queryAllInCityInPage(String cityId, int firstPage, int maxPage) throws Exception {

		String hql = "select * from newdata where creditgrade IS NOT NULL ";
		Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);
		//query.setString(0, cityId);
		query.setFirstResult(firstPage);
		query.setMaxResults(maxPage);

		List<Customers> list  = query.list();

		return list;
	}

	@Override
	public List<Customers> queryBrokenInCityInPage(String cityId, int firstPage, int maxPage) throws Exception {
		String hql = "select * from newdata where  zae = 1 and creditgrade IS NOT NULL and zac IS NOT NULL";
		Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);

		query.setFirstResult(firstPage);
		query.setMaxResults(maxPage);
		List<Customers> list  = query.list();

		return list;
	}

	@Override
	public List<Customers> queryAbidedInCityInPage(String cityId, int firstPage, int maxPage) throws Exception {
		String hql = "select * from newdata where  zae = 0 and creditgrade IS NOT NULL and zac IS NOT NULL";
		Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);
		query.setFirstResult(firstPage);
		query.setMaxResults(maxPage);
		List<Customers> list  = query.list();

		return list;
	}

	@Override
	public List<Customers> queryNoneInCityInPage(String city, int firstPage, int maxPage) throws Exception {
		String hql = "select * from newdata where creditgrade IS NOT NULL  and zac is null ";
		Query query = sessionFactory.getCurrentSession().createSQLQuery(hql).addEntity(Customers.class);
		query.setFirstResult(firstPage);
		query.setMaxResults(maxPage);;
		List<Customers> list  = query.list();

		return list;
	}

	@Override
	public void insertCustomer(Customers customers) throws Exception {
		sessionFactory.getCurrentSession().save(customers);
	}

}
