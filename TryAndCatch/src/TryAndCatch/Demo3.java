package TryAndCatch;

public class Demo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c=120;
		int d[]= {10,20,3,40,69};
		try
		{
			c=a/b;//no exception
//			System.out.println(d[7]);//it has exception
		}
		catch(ArithmeticException e)
		{
		System.out.println("cant divied by zero");
			b=1;
			c=a/b;			
		}
	
		try
		{
			System.out.println(d[6]);
		}
        catch(Exception e)//to handle the multiple exception
		
		{
			System.out.println("Exception handler");
			e.printStackTrace();// to print name of exception
		}
	System.out.println(c);
	System.out.println("exceution done");

}


}
