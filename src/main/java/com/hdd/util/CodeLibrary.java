package com.hdd.util;

import java.util.HashMap;
import java.util.Map;

public class CodeLibrary {

	private static Map<String, Map<String, String>> map = new HashMap<String, Map<String, String>>();
	
	/**
	 * load code library
	 */
	private static void load() {
		//read all codenos
		String contents = FileUtil.readFile("/codeno.txt");
		//to init the attributes list
		String previous = "";
		Map<String, String> temp = new HashMap<String, String>();
		for(String rows : contents.split(":")){
			String data[] = rows.split(",");
			if(previous.equals(data[0])){
				temp.put(data[1], data[2]);
			}else{
				temp = new HashMap<String, String>();
				map.put(data[0], temp);
				temp.put(data[1], data[2]);
				previous = data[0];
			}
		}		
	}
	
	/**
	 * get itemname
	 */
	public static String getItemName(String codeNo, String itemNo){
		if(map.isEmpty()) load();
		return map.get(codeNo).get(itemNo);
	}
}
