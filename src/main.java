

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class main {
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		
	    //Program greets user 
		System.out.println("Hello!");
		
		//explanation of what this program will do for the user
        System.out.println("This program will help calculate"); 
        System.out.println("the amount of days between two dates.");
        System.out.println("");
        System.out.println("Please enter first date in MM/dd/YYYY format."); 
        
        //Prompt user to enter first date
        System.out.println("Example; August 12th, 1988 would be 08/12/1988."); 
        
        //Scanner for the first date
		String firstDate = scanner.nextLine();
		//formats date into months, days, years
		DateTimeFormatter formatter1=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		//Convert the string data to LocalDate
	    LocalDate localOne = LocalDate.parse(firstDate, formatter1);
		
	    //prompt user for second date
		System.out.println("Please enter second date in MM/dd/YYYY format."); 
		//scan for secondDate
		String secondDate = scanner.nextLine();
		//formats date into Months, days, years
		DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		//Convert string data into the LocalDate 
	    LocalDate localTwo = LocalDate.parse(secondDate, formatter2);
        scanner.close();
	

        
        Period intervalPeriod = Period.between(localOne, localTwo);
        
        System.out.print("There are " + intervalPeriod.getYears());
        System.out.print(" years, " + intervalPeriod.getMonths() +" months, ");
        System.out.println("and " + intervalPeriod.getDays() + " days, between the two dates.");
        System.out.println("Thank you for using this program, and have a great day!");
		
       }
       
	}

	
	
		
		
	

		
		
	
		
	

