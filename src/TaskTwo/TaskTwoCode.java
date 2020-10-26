package TaskTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TaskTwoCode {
	
	public static void main(String[] args) throws LessThanTwoCountException
	{
		List<Employee> people = Arrays.asList(
				new Employee("SE","SAM","XXXXXX"),
				new Employee("SE","Nancy","yyyyy"),
				new Employee("ASE","Mark","ZZZZ")
				);
		
		//Map<String,List<Employee>> EmployeeTitles = new HashMap<>(); 

	people.stream() .collect(Collectors.groupingBy(Employee::getTitle))
	.forEach((EmployeeTitle,EmployeesList) -> {
		try
		{
	   if(EmployeesList.size()<2)
	   {
		   throw new LessThanTwoCountException("Error: The current title has less than two employees.");
		}
		System.out.print("Title "+ EmployeeTitle);	
		System.out.println(" Count "+ EmployeesList.size());
		EmployeesList.forEach( emp -> System.out.println("Name "+emp.name+" - Mobile "+emp.mobile));
		}
		catch (LessThanTwoCountException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	});
		
		
	}

}
