package com.hdd.util;

import java.util.ArrayList;
import java.util.List;

public class AttributesUtil {

	private static List<AttributeItem> attributes = new ArrayList<AttributeItem>();

	/**
	 * get all attributes of the customer which required to show on the page
	 * @return
	 */
	public static List<AttributeItem> getAttributes(){

/*		String zaa = PropertiesReadUtil.getProperty("zaa");
		System.out.println(zaa);*/

		if(attributes.isEmpty()){
			//read attributes config file
			String contents = FileUtil.readFile("/attributes.txt");
			//to init the attributes list
			for(String rows : contents.split(":")){
				String data[] = rows.split(",");
				AttributeItem item = new AttributeItem();
				item.setAttributeNo(data[0]);
				item.setAttributeName(data[1]);
				item.setSortNo(data[2]);
				item.setGroupId(data[3]);
				item.setDataFormat(data[4]);
				item.setCodeNo(data[5]);
				attributes.add(item);
			}
		}
		return attributes;
	}
}
