package com.hdd.dao;

import com.hdd.Entity.Customers;

import java.util.List;

public interface CustomersDao {
	
/*	public List<Customers> getAllCreditRecord();
	
	public Customers getCreditRecord(String zaa);*/
	
    List<Customers> queryAll() throws Exception;

    List<Customers>  queryById(String id) throws Exception;

    List<Customers>  queryByApplid(String appl_id) throws Exception;

    List<Customers> queryAllInCity(String cityId) throws Exception;

    List<Customers> queryBrokenInCity(String cityId) throws Exception;

    List<Customers> queryAbidedInCity(String cityId) throws Exception;

    List<Customers>  queryNoneInCity(String city) throws Exception;

    List<Customers> queryAllInCityInPage(String cityId,int firstPage,int maxPage) throws Exception;

    List<Customers> queryBrokenInCityInPage(String cityId,int firstPage,int maxPage) throws Exception;

    List<Customers> queryAbidedInCityInPage(String cityId,int firstPage,int maxPage) throws Exception;

    List<Customers>  queryNoneInCityInPage(String city,int firstPage,int maxPage) throws Exception;

    void insertCustomer(Customers customers) throws Exception;

}
