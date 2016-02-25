package com.hdd.test;


import com.hdd.Entity.CreditRecord;
import com.hdd.service.CreditRecordService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;


public class TestCreditRecord {
	
    private CreditRecordService crService;
    
    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before(){
//        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"../mvc-dispatcher-servlet.xml"});
        ApplicationContext ac = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml");
        crService = (CreditRecordService) ac.getBean("creditService");
    }
    
    @Test
    public void testSaveMethod(){
    	
    	List<CreditRecord> crs=crService.getAllCreditRecord();
    	int i=0;
    	for(CreditRecord cr :crs)
    	{
    		if(i==1)
    		{
    			System.out.printf("zaa...%s,zab..%s\n",cr.getZaa(),cr.getZab());
    			break;
    		}
    		i++;
    		
    	}
    	

    }
}
