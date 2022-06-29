package day8PracticeProblem;
import java.lang.Math;
public class EmpWageUc3 {

	public void partOrFullTime() {
		int IS_PARTTIME=1;
		int IS_FULLTIME=2;
		int EMP_RATE_PER_HOUR=20;
		int empHrs;
		int empWage;
		double empcheck=Math.floor(Math.random()*10)%3;
		if(empcheck==IS_PARTTIME)
			{
			empHrs=4;
			empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Part Time Emp Wage:"+empWage);
			}
		else if(empcheck==IS_FULLTIME)
	{
			empHrs=8;
			empWage=empHrs*EMP_RATE_PER_HOUR;
			System.out.println("Full Time Emp Wage:"+empWage);
	}
     else 
     {	
    	 empHrs=0;
       System.out.println(" Emp is absent:");
     }
     }

}
