import java.util.*;
class sici
{
	void main()
	{
		double pr,rate,t,sim,com;
		scanner sc =new Scanner(system.in);
		system.out.println("enter amount");
		pr=sc.nextDouble();
		system.out.println("senter no.of year");
		t=sc.nextDouble;
		system.out.println("enter the rate of interestt");
		rate=sc.nextDouble;
		sim=(pr*rate)/100;
		com=pr*math.pow(1.0+rate/100.0,t)-pr;
		system.out.println("simple interest");
		system.out.println("compound interest="+com);
		
	}
}
class Demo
{
	sici si=new sici();
	si.main();
}
