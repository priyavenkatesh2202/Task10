package task10;

public class Polymor 
{

	public static void main(String[] args)
	{
			BasicTea[] obj = new BasicTea[3]; 
        
       
        obj[0]= new GreenTea(); 
        
        obj[1]= new HerbalTea();
        
        obj[2]= new Blacktea();
        
        for( BasicTea tea: obj)
        {
        	tea.addHotwater();
        	
        	tea.addTealeaves();
        	
        	tea.Tea();
        	
        	System.out.println("-----------");
        }
        
        
        	
        	
        	
        
       
       
         
    }
		// TODO Auto-generated method stub

	}


