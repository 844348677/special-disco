package com.hdd.util;

public class AttributeItem implements Comparable<AttributeItem> {

	/**
	 * the attributes
	 */

	//the unique key of this item, related with a column of the table of database
	private String attributeNo;

	//the chinese name presented on the page
	private String attributeName;

	//the order to show on page
	private String sortNo;

	//the format of the attribute
	private String dataFormat;

	//the group which this attribute belongs
	private String groupId;

	//the codeno related with this attribute, to tranlate code to chinese
	private String codeNo;

	/**
	 * funtions : getter and setter
	 * @return
	 */
	public String getAttributeNo() {
		return attributeNo;
	}
	public void setAttributeNo(String attributeNo) {
		this.attributeNo = attributeNo;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getSortNo() {
		return sortNo;
	}
	public void setSortNo(String sortNo) {
		this.sortNo = sortNo;
	}
	public String getDataFormat() {
		return dataFormat;
	}
	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getCodeNo() {
		return codeNo;
	}
	public void setCodeNo(String codeNo) {
		this.codeNo = codeNo;
	}
	@Override
	public int compareTo(AttributeItem arg0) {
		return this.getSortNo().compareTo(arg0.getSortNo());
	}
}
