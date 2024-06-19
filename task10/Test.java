package task10;

public class Test
	{
	public static void main(String[] args) 
	{
		Circle c = new Circle(9);  	// radius input value
		
		System.out.println("The Circumference of Circle is : "+c.circumference());

		
	}
	}


	class Circle
	{
		
		int radius;
	
	public Circle() // no argument constructor
	
	{
	     this.radius = 0;
			
		}
		
	public Circle(int radius) // argument constructor
      {
			
	  this.radius = radius;
			
		}
		
		
		
		public double circumference()  // formula to calculate circumference
		{
			
			return 2 * 3.14 * radius;
			
		}
	}
		
	
	
		

	


