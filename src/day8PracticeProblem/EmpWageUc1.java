package day8PracticeProblem;
import java.lang.Math;
public class EmpWageUc1 {

	public void presentOrAbsent() {
				int IS_FULLTIME=1;
				double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck==IS_FULLTIME)
			System.out.println("Emp is present");
		else 
			System.out.println("Emp is absent");
			}


	
}


