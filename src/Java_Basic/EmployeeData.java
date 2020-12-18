package Java_Basic;

import java.util.ArrayList;

public class EmployeeData 
{
	 String name;
     int empId;
     ArrayList<String> deviceList;
     
	public EmployeeData(String name, int empId, ArrayList<String> deviceList)
	{
		this.name = name;
		this.empId = empId;
		this.deviceList = deviceList;
	}


	public static void main(String[] args) 
	{
        ArrayList<String> dList = new ArrayList<String>();
        dList.add("Iphone");
        dList.add("iPad");
        dList.add("iPod");
        dList.add("MAC Book");
        
		EmployeeData e1 =new EmployeeData("Pallavi" ,175,dList);
		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.deviceList);
		System.out.println(e1.deviceList.get(0));
		
		for(String d:dList)
		{
			System.out.println(d);
		}
	}

}
