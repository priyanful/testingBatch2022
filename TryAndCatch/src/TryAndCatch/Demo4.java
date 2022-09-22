package TryAndCatch;

public class Demo4 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=120;
		
		try
		{
			c=a/b;
//			
		}
		catch(ArithmeticException e)
		{
		System.out.println("cant divied by zero");
			b=1;
			c=a/b;			
		}
		finally
		{
			System.out.println("fianl block");
		}
System.out.println("vaule of c  =" +c);
System.out.println("execution done");	}

}
