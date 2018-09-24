	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.Scanner;
	import java.util.concurrent.TimeUnit;

	class Main
	{
	    public static void main (String[] args) throws java.lang.Exception
	    {
	    	double dateYears;
	    	
	    	
	        
	        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Hello!");
	        System.out.println("This program will help calculate");
	        System.out.println("the amount of days between two dates.");
	        System.out.println("");
	        System.out.println("Please enter first date in MM/dd/YYYY format.");
	        System.out.println("Example; August 12th, 1988 would be 08/12/1988.");
	        Date firstDate= format.parse(scanner.nextLine());
	        System.out.println("Please enter second date in MM/dd/YYYY format.");
	        Date secondDate= format.parse(scanner.nextLine());
	        scanner.close();
	        
	       

	        
	        long diff = firstDate.getTime()-secondDate.getTime();
	        long diffDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	        diffDays = Math.abs(diffDays);
	        dateYears = (diffDays / 365);
	        System.out.println(diffDays + ", is the number of days between dates.");
	        System.out.println(dateYears + ", is the number of years between each dates." );
	        System.out.println("Thank you for using this program!");
	

	    }
	}

