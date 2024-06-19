package task10;

public class Person 
{
	  private String name;
	    private int age;
	    
	    
	    
	    public Person(String name, int age) // constructor
	    
	    {
	        this.name = name;
	        this.age = age;
	    }
	    
	    
	    public String getName()    // getter method
	    {
	        return name;
	    }
	    public int getAge()
	    {
	        return age;
	    }
	
      public static void main(String[] args) // main method
	  {
	    Person person1 = new Person("Arun", 9);
	    Person person2 = new Person("Ajay", 18);
	    
	   System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
	    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
	  }
	

	
		// TODO Auto-generated method stub

	}



