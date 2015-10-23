package com.shallowanddeep;



public class ShallowCopyDemo implements Cloneable{
	
	public static void main(String[] args) throws CloneNotSupportedException{
		/*Dept dept=new Dept(1,"JAVA");
		Employee emp=new Employee(1,"srini",dept);
		Employee clone = (Employee)emp.clone();
		System.out.println("Shallow cloning Before Modifying in emp->"+emp.dept.deptName);
		System.out.println("Shallow cloning Before Modifying in clone->"+clone.dept.deptName);
		clone.dept.deptName="SAP";
		System.out.println("Shallow cloning After Modifying in emp-->"+emp.dept.deptName);
		System.out.println("Shallow cloning After Modifying in emp->"+clone.dept.deptName);*/
		
		//Deep cloning
		
		Dept dept1=new Dept(1,"JAVA");
		Employee emp1=new Employee(1,"srini",dept1);
		Employee clone1 = (Employee)emp1.clone();
		System.out.println("Deep cloning Before Modifying emp1-->"+emp1.dept.deptName);
		System.out.println("Deep cloning Before Modifying clone1-->"+clone1.dept.deptName);
		//clone1.getDept().setDeptName("SAP");
		clone1.dept.deptName="SAP";
		System.out.println("Deep cloning After Modifying emp1-->"+emp1.dept.deptName);
		System.out.println("Deep cloning After Modifying clone1-->"+clone1.dept.deptName);
		
		
	
	}

}
