class Test1
{
public static void main (String args[])
{
Test1 obj = new Test1();
obj.simpleInterest(10000,16,3);
}
public void simpleInterest(int p, int t, int r)
{
int x= (p*t*r)/100;
System.out.println ("Simple Interest " +x);
}
}