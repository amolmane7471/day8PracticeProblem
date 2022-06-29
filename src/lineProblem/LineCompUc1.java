package lineProblem;

public class LineCompUc1 {
	public void calLength(double a,double b,double c,double d) {
		double x1=a ,y1=b, x2=c, y2=d;
		double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Distance Btw Two Points:"+length);
	}
}
