package com.hdd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdd.Entity.CreditRecord;
import com.hdd.dao.CreditRecordDao;
import com.hdd.service.CreditRecordService;

@Service("creditServiceBase")
public class CreditRecordServiceImpl implements CreditRecordService{

	@Autowired
	protected CreditRecordDao crd;
	public List<CreditRecord> getAllCreditRecord() {
		// TODO Auto-generated method stub
		return crd.getAllCreditRecord();
	}

	public CreditRecord getCreditRecord(String zaa) {
		// TODO Auto-generated method stub
		return crd.getCreditRecord(zaa);
	}

}
