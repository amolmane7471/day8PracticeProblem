package day8PracticeProblem;
public class EmpWageUc6 {
	public static final	int IS_PARTTIME=1;
	public static final	int IS_FULLTIME=2;
	public static final	int EMP_RATE_PER_HOUR=20;
	public static final	int NUM_WORKING_DAYS=20;
	public static final int WORKING_HRS_IN_MONTH=100;
	public void empWageCheck() {
	    int empHrs,totalEmpWage,totalEmpHrs=0,totalWorkingDays=0;
	    while(totalEmpHrs<=WORKING_HRS_IN_MONTH && totalWorkingDays<NUM_WORKING_DAYS)
	    {	
	    	totalWorkingDays++;
	    	int empcheck=(int)Math.floor(Math.random()*10)%3;
		switch (empcheck) {
		case IS_PARTTIME:
			empHrs=4;
			break;
		case IS_FULLTIME:
	    empHrs=8;
	    break;
	default:
	    empHrs=0;
		}
		if(empcheck==1)
		{
		  System.out.println("Employee Status: Part Time Present");
		}
		else if(empcheck==2)
		{
			System.out.println("Employee Status: Full Time Present");
		}
		else
			System.out.println("Employee Status: Absent");
		  totalEmpHrs +=empHrs;
	System.out.println(" Day:"+totalWorkingDays  +  " Total EmpHours:"+totalEmpHrs);
	    }
	    totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
	    System.out.println("Total Emp Wage Is:"+totalEmpWage);
	}

}
