package lab3;
import java.time.*;
/**
* Name: Manoj Kumar P S
* Description:  accept the date and print the duration in days, months and years with regards to the current system date
* Date: 3/20/2021
*/


public class AcceptPrintDuration {

	public static void main(String[] args) {
		LocalDate pdate = LocalDate.of(2018, 04, 18);
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(pdate, now);
 
     System.out.println("Difference in year is: "+diff.getYears()+ " Years " +diff.getMonths()+ " months " +diff.getDays()+ " days");
  }

	}


