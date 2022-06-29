package lineProblem;

public class LineComp {

		public static void main(String[] args) {
			System.out.println("Welcome To Line Comparison Computation Program");
			LineCompUc1 l1=new LineCompUc1();
			LineCompUc2 l2=new LineCompUc2();
			LineCompUc3 l3=new LineCompUc3();
			l1.calLength(2,2,4,4);
             double lengthL1 =l2.lengthOfLine1(2.0,2.0,4.0,4.0);  
		System.out.println("length of line one: " +lengthL1);
		double lengthL2 =l2.lengthOfLine1(2.0,2.0,4.0,4.0);  
		System.out.println("length of line two: "+lengthL2);
		Integer obj1=new Integer((int) lengthL1);
		Integer obj2=new Integer((int) lengthL2);
		System.out.println("lines are equal or not: "+obj1.equals(obj2));
		//System.out.println("lines are equal or not: "+obj1.compareTo(obj2));
		l3.compare1(obj1,obj2);
		}
		

	}