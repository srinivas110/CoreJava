package com.shallowanddeep;

public class Dept implements Cloneable{
	
	private int deptId;
	 String deptName;
	public Dept(int deptId,String deptName){
		this.deptId=deptId;
		this.deptName=deptName;
	}
	/*public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}*/
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
