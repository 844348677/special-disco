package com.hdd.service;

import java.util.List;

import com.hdd.Entity.CreditRecord;

public interface CreditRecordService {
	
	public List<CreditRecord> getAllCreditRecord();
	
	public CreditRecord getCreditRecord(String zaa);

}
