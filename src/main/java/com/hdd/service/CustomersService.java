package com.hdd.service;

import com.hdd.Entity.Customers;

import java.util.List;

/**
 * Created by liuh on 2016/2/1.
 */
public interface CustomersService {
    public List<Customers> getAllCustomers() throws Exception;

    public List getCustomersById(String zaa)  throws Exception;

    public List getCustomersByIdNew(String zaa)  throws Exception;

    public List getCustomerInNewWay(String zaa) throws Exception;

    public List getCustomersInCity(String cityId,int firstPage,int maxPage)  throws Exception;

    public List getCreditRecordByType(String cityId,String category,int firstPage,int maxPage)  throws Exception;

}
