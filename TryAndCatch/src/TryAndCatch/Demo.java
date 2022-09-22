package TryAndCatch;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c=120;
		
		try
		{
			c=a/b;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant divied by zero");
			b=1;
			c=a/b;
		}
        catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("range over");
		}
	System.out.println(c);
	System.out.println("exceution done");

}
}//multiple catch present but try block handl only one catch 