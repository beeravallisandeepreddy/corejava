class Test1
{
public static void main (String args[])
{
System.out.println("main method start");
	
Test1 obj = new Test1();
obj.simpleInterest(10000,16,3);
System.out.println("main method");

System.out.println("main method end");
}
public void simpleInterest(int p, int t, int r)
{
int x= (p*t*r)/100;
System.out.println ("Simple Interest " +x);
System.out.println("method");

System.out.println("method end");
}
}