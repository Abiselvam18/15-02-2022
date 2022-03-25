package javaloops._02_2022;

public class Example2 
{
	public static void main( String[] args )
	{
		//forEach loop

		//Array		
		int employeeIds[] = {100, 101, 102, 103, 104, 105};

		double employeeSalaries[] = {10000.60, 12000.25, 14000.30, 8000.20, 11000.50, 6000.70};


		for(int employeeId: employeeIds) 
		{ 
			System.out.println(employeeId); 
		}

		System.out.println("=============");
		
		for(double employeeSalary: employeeSalaries)
		{
			System.out.println(employeeSalary);
		}

	}
}
