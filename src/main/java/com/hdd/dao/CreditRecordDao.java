package com.hdd.dao;

import java.util.List;

import com.hdd.Entity.CreditRecord;

public interface CreditRecordDao {
	
	public List<CreditRecord> getAllCreditRecord();
	
	public CreditRecord getCreditRecord(String zaa);
	
    List<CreditRecord> queryAll() throws Exception;

    List<CreditRecord>  queryById(String id) throws Exception;

    List<CreditRecord>  queryByApplId(String appl_id) throws Exception;

    List<CreditRecord> queryAllInCity(String cityId) throws Exception;

    List<CreditRecord> queryBrokenInCity(String cityId) throws Exception;

    List<CreditRecord> queryAbidedInCity(String cityId) throws Exception;


    List<CreditRecord>  queryNoneInCity(String city) throws Exception;

}
