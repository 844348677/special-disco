package com.hdd.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTransUtil {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	
	public static String transfer(String span){
		if(span != null && !"".equals(span) && !"null".equals(span)) {
			Double doubleSpan = Double.parseDouble(span);
			long time = Math.round(doubleSpan) - 3653;
			return format.format(new Date(time * 24 * 3600 * 1000));
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(DateTransUtil.transfer("19767"));
		System.out.println(DateTransUtil.transfer("19785"));
		System.out.println(DateTransUtil.transfer("20150"));
	}

	public static String excuseMonth(String monthString){
		if(monthString != null && !"".equals(monthString) && !"null".equals(monthString)) {
			Double doubleSpan = Double.parseDouble(monthString);
			StringBuffer str = new StringBuffer(Math.round(doubleSpan) + "");
			String strInsert = "/";
			str.insert(4, strInsert);
			//System.out.println(str.toString());

			return str.toString();
		}
		return null;
	}
}
