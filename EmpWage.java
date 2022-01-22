package empWage;

public class EmpWage
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to employee wage computation program");
		//Constants
	     final int IS_PART_TIME = 1;
	     final int IS_FULL_TIME = 2;
	     final int EMP_RATE_PER_HOUR = 20;
	    //Variables
	    int empHrs = 0;
        int empWage = 0;
	    //Computation
	    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck)
		{
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
		    empHrs = 0;
		
		}
	    if ( empCheck == IS_FULL_TIME )
						empHrs = 8;
					else if ( empCheck == IS_PART_TIME )
					    empHrs = 4;
					empWage = empHrs * EMP_RATE_PER_HOUR;
					System.out.println("Emp Wage:" + empWage);
	}

}
