package day8PracticeProblem;

public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Pgm");
		EmpWageUc1 emp1=new EmpWageUc1();
		EmpWageUc2 emp2=new EmpWageUc2();
		EmpWageUc3 emp3=new EmpWageUc3();
		EmpWageUc4 emp4=new EmpWageUc4();
		EmpWageUc5 emp5=new EmpWageUc5();
		EmpWageUc6 emp6=new EmpWageUc6();
		emp1.presentOrAbsent();
		emp2.dailyEmpWage();
		emp3.partOrFullTime();
		emp4.switchCase();
	    emp5.wagesForMonth();
	    emp6.empWageCheck();
	}

}
