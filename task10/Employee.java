package task10;

public class Employee {
	
		
		 private int id; 		//attributes created id , name and salary
		 private String name;
		 private double salary;
		
		public Employee(int id, String name, double salary) //constructor with class name
		{
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
		 }
													
		public void raiseSalary(double percent)  // method raise salary
		{
		 double increase = salary * percent / 100.0;
		 salary += increase;
		 }

		
		public double getAnnualSalary()		//monthly salary * 12 =  annual salary
			{
		        return salary * 12; 
		    }

		public int getId() {
		 return id;
		 }
		public String getName() {
		 return name;
		 }
		public double getSalary() {
		 return salary;
		 }

		 public String toString() {
		        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
		    }

		public static void main(String[] args)
		    {
		        Employee employee = new Employee(1, "Arjun", 60000.0);
		        
		        System.out.println(employee);
		    }
		}
	

