import java.util.Scanner;
public class NumberOfDays {
	public static void main(String[] args){
		String m, y;
		Scanner input = new Scanner(System.in);
		String[] valMonth = {"January", "February", "March", "April", "May", "June", "July",
		"August", "September", "October", "November", "December", "Jan", "Feb", "Mar", "Apr",
		"May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jan.", "Feb.", "Mar.", "Apr.",
		"May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.",		
		};
		boolean check = false;
		
		do {		
		System.out.println("Input month: ");
		m = input.nextLine();
		if(isNumeric(m)) 
			if(Integer.parseInt(m)>=1 && Integer.parseInt(m)<=12) check = true;
		for(int i = 0; i<valMonth.length; i++) 
		if(m.equals(valMonth[i])) {
			check = true;
			break;
		}
		if (check==false) System.out.println("Invalid month! Please input again.");
		} while(check == false);
		
		do {
		System.out.println("Input year:");
		y = input.nextLine();
		if (isNumeric(y)) if(Integer.parseInt(y) > 0) check = false;
		if (check==true) System.out.println("Invalid year! Please input again.");
		} while(check == true);
		boolean leapYear = (Integer.parseInt(y) % 4 == 0 && Integer.parseInt(y) % 100 != 0) || (Integer.parseInt(y) % 400 == 0);
	switch(m){
	case "1": System.out.println(
			 "January " + y + " had 31 days"); break;
	case "2": System.out.println("February " + y + " had" +
			  ((leapYear) ? " 29 days" : " 28 days")); break;
	case "3": System.out.println(
			 "March " + y + " had 31 days"); break;
	case "4": System.out.println(
			 "April " + y + " had 30 days"); break;
	case "5": System.out.println(
			 "May " + y + " had 31 days"); break;
	case "6": System.out.println(
			 "June " + y + " had 30 days"); break;
	case "7": System.out.println(
			 "July " + y + " had 31 days"); break;
	case "8": System.out.println(
			 "August " + y + " had 31 days"); break;
	case "9": System.out.println(
			 "September " + y + " had 30 days"); break;
	case "10": System.out.println(
			 "October " + y + " had 31 days"); break;
	case "11": System.out.println(
			 "November " + y + " had 30 days"); break;
	case "12": System.out.println(
			 "December " + y + " had 31 days");break;
	case "Jan": System.out.println(
			 "January " + y + " had 31 days"); break;
	case "Feb": System.out.println("February " + y + " had" +
			  ((leapYear) ? " 29 days" : " 28 days")); break;
	case "Mar": System.out.println(
			 "March " + y + " had 31 days"); break;
	case "Apr": System.out.println(
			 "April " + y + " had 30 days"); break;
	case "May": System.out.println(
			 "May " + y + " had 31 days"); break;
	case "Jun": System.out.println(
			 "June " + y + " had 30 days"); break;
	case "Jul": System.out.println(
			 "July " + y + " had 31 days"); break;
	case "Aug": System.out.println(
			 "August " + y + " had 31 days"); break;
	case "Sep": System.out.println(
			 "September " + y + " had 30 days"); break;
	case "Oct": System.out.println(
			 "October " + y + " had 31 days"); break;
	case "Nov": System.out.println(
			 "November " + y + " had 30 days"); break;
	case "Dec": System.out.println(
			 "December " + y + " had 31 days");break;
	case "January": System.out.println(
			 "January " + y + " had 31 days"); break;
	case "February": System.out.println("February " + y + " had" +
			  ((leapYear) ? " 29 days" : " 28 days")); break;
	case "March": System.out.println(
			 "March " + y + " had 31 days"); break;
	case "April": System.out.println(
			 "April " + y + " had 30 days"); break;
	case "June": System.out.println(
			 "June " + y + " had 30 days"); break;
	case "July": System.out.println(
			 "July " + y + " had 31 days"); break;
	case "August": System.out.println(
			 "August " + y + " had 31 days"); break;
	case "September": System.out.println(
			 "September " + y + " had 30 days"); break;
	case "October": System.out.println(
			 "October " + y + " had 31 days"); break;
	case "November": System.out.println(
			 "November " + y + " had 30 days"); break;
	case "December": System.out.println(
			 "December " + y + " had 31 days");
	}
 }
	private static boolean isNumeric(String str) {
		try {  
		    Integer.parseInt(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
	}

}