package task10;

public class Programm
    {
	
	public static void main(String[] args) 
	{
		
		Account c = new Account(3000,"rs");
		
		System.out.println("The Account balance is " +c.currency+ " "+c.balance);

	}
	}


	class Account
	{
		double balance;
		String currency;
		
				
		public Account()
		{
			
			balance = 0;
			currency = "rs";
			
		}
		
		
		
		public Account(double balance, String currency) 
		{
			
			this.balance = balance;
			this.currency = "rs";
			
		}
		
		
		public void deposit(double bal)
		{
			
			this.balance += bal;
			
		}
		
		public void withdrawl(double bal) 
		{
			
			this.balance -= bal;
			
		}
		
		
	}

