package task10;

public class Question6 {

	public static void main(String[] args) 
	{
		    Blacktea blackTea = new Blacktea();
	        blackTea.Tea(); // Prepare black tea
	        blackTea.sugar();
	        blackTea.addHotwater();
	        blackTea.addTealeaves();
	        System.out.println();
	        
	        GreenTea greenTea = new GreenTea();
	        greenTea.Tea(); // Prepare green tea
	        greenTea.addHotwater();
	        greenTea.addTealeaves();
	        System.out.println();

	        HerbalTea herbalTea = new HerbalTea();
	        herbalTea.Tea(); // Prepare herbal tea
	        herbalTea.milk();
	        herbalTea.sugar();
	        herbalTea.addHotwater();
	        herbalTea.addTealeaves();
	        System.out.println();
	    }
}
		
		// TODO Auto-generated method stub

	


