package lineProblem;

public class LineCompUc3 {
public void compare1(int a,int b)
{
	  int obj1=a ,obj2=b;
System.out.println("lines are equal or not status: "+Integer.compare(obj1,obj2));
//if(obj1.compareTo(obj2)>0)
if(+Integer.compare(obj1,obj2)==0)
{
	System.out.println("both Lines are equal");
	}
else if(+Integer.compare(obj1,obj2)>0)
{
	System.out.println(" line one is greater than line two");
}
else
{
	System.out.println(" line one is less than line two");
	
}	
}
}
