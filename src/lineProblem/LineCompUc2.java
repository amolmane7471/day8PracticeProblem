package lineProblem;
public class LineCompUc2 {

	double lengthOfLine1(double x1,double y1,double x2,double y2) {
		return (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
	}
	  double lengthOfLine2(double p1,double q1,double p2,double q2) {
		return (Math.sqrt(Math.pow((p2-p1),2)+Math.pow((q2-q1),2)));
	}

}