package TryAndCatch;

public class Demo1 {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
		int c=120;
		int d[]= {1,20,30,40,50};
		
		try  {c=a/b;}
		catch(ArithmeticException e)
		{
			System.out.println("cant divied by zero");
			b=1;
			c=a/b;
		}
		try{System.out.println(d[7]);}
		
		catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("range over");
		}
		
			
	System.out.println(c);
	System.out.println("exceution done");

}

	}


