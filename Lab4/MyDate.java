package lab4;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    private int Day;
    private int Month; 
    private int Year;

    public MyDate() {
    	super();
    	 Calendar curDate = Calendar.getInstance();
         this.Day = curDate.get(Calendar.DAY_OF_MONTH);
         this.Month = curDate.get(Calendar.MONTH);
         this.Year = curDate.get(Calendar.YEAR);
    }

    public MyDate(int day, int month, int year) {
		super();
		if((day >=1 && day <=31) && (month >=1 && month <= 12) && (year >= 0)){
	            this.Day = day;
	            this.Month = month;
	            this.Year = year;
	        }
	        else{
	            if(day < 1 || day > 31)
	                System.out.println("Error : Invalid day");
	            if(month < 1 || month > 12)
	                System.out.println("Error : Invalid month");
	            if (year < 0)
	                System.out.println("Error : Invalid year");
	       }
	}

    public MyDate(String iDate) {
        String dateFormat = "MMMMM dd yyyy";
        Date bDate;
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        Calendar fDate = Calendar.getInstance();
        formatter.setLenient(false);
        try {
            if(iDate.contains("1st"))
               bDate = formatter.parse((iDate.replaceAll("st", "")).trim());
            else if(iDate.contains("2nd"))
                bDate = formatter.parse((iDate.replaceAll("nd", "")).trim());
            else if(iDate.contains("3rd"))
                bDate = formatter.parse((iDate.replaceAll("rd", "")).trim());
            else
                bDate = formatter.parse((iDate.replaceAll("th", "")).trim()); //replaceAll(): replace all st|nd|rd|th = ""
                                                                        //trim() to remove blank before and after the str
        } catch (ParseException pe) {
            System.out.println("Not a valid date or wrong format.");
            return;
        }      
        
        fDate.setTime(bDate);
        this.Day = fDate.get(Calendar.DAY_OF_MONTH);
        this.Month = fDate.get(Calendar.MONTH)+1;//Month is less than real month 1 point because of Calendar library
        this.Year = fDate.get(Calendar.YEAR);
    }    
    
    public MyDate(String day, String month, String year) {
    	String[] strDay = {"zero","first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth","thirteenth",
                "fourteenth","fifteenth","sixteenth","seventeenth","eighteenth","nineteenth","twentieth","twenty-first","twenty-second","twenty-third",
                "twenty-fourth","twenty-fifth","twenty-sixth","twenty-seventh","twenty-eighth","twenty-ninth","thirtieth","thirty-first"};
        String[] strMonth = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                          "seven", "eight", "nine", "ten", "eleven", "twelve",
                          "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                          "eighteen", "nineteen" };
        String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};
        for(int i=1; i<=31; i++) {
        	if (strDay[i].equalsIgnoreCase(day)) this.Day = i;
        }
        for(int i=0;i<12;i++) {
            if(strMonth[i].equalsIgnoreCase(month))
                this.Month = i;
        }
        String[] yearList = year.split("\\s|-");
        int yNumber = 0;
        switch (yearList.length) {
            case 4:
                for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[0])) yNumber += i*1000;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[1])) yNumber += i*100;
                for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[2])) yNumber += i*10;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[3])) yNumber += i;
                break;
            case 3:
                for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[0])) yNumber += i*1000;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[0])) yNumber += i*100;
                for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[1])) yNumber += i*10;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[1])) yNumber += i*100;
                for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[2])) yNumber += i*10;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[2])) yNumber += i;
                break;
            case 2:
                for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[0])) yNumber += i*1000;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[0])) yNumber += i*100;
                for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[1])) yNumber += i*10;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[1])) yNumber += i; 
                break;
            case 1:
            	for(int i=0;i<10;i++) if(tensArray[i].equalsIgnoreCase(yearList[0])) yNumber += i*10;
                for(int i=0;i<20;i++) if(unitsArray[i].equalsIgnoreCase(yearList[0])) yNumber += i;
            default:
                break;
        }
        this.Year = yNumber;
    }
    
    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Calendar fDate = Calendar.getInstance();
        fDate.set(Year, Month, 1); //set the time
        if(day < 1 || day > fDate.getActualMaximum(Calendar.DAY_OF_MONTH) ){ 
            System.out.println("Not valid day.");
            return;
        }
            
        this.Day = day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
	    if(month >=0 && month <=11)
            this.Month = month;
        else {
            System.out.println("Error: Invalid Month.");
        }
	}

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
		if(year >=0 )
	        this.Year = year;
	    else {
	        System.out.println("Error: Invalid Year.");
	    }
        this.Year = year;
    }
        
    public void accept() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter a date: mm dd yy ");
        String strDate = keyboard.nextLine();
        String dateFormat = "MMMMM dd yyyy";
        Date bDate;
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        Calendar fDate = Calendar.getInstance();
        formatter.setLenient(false);
        try {
            bDate = formatter.parse((strDate.replaceAll("st|nd|rd|th", "")).trim());
        } catch (ParseException pe) {
            System.out.println("Invalid date or format");
            return ;
        }
        
        fDate.setTime(bDate);
        this.Day = fDate.get(Calendar.DAY_OF_MONTH);
        this.Month = fDate.get(Calendar.MONTH)+1;//Month is less than real month 1 point because of Calendar library
        this.Year = fDate.get(Calendar.YEAR);
    
        keyboard.close();
    }
    
//    public void print() {
//        System.out.printf("%02d/%02d/%4d\n", Day, Month, Year); 
//    }
    public void print() {
        Calendar fDate = Calendar.getInstance();
        fDate.set(Year, Month, Day);
        String dateFormat;
        
        switch (Day) {
            case 1:
                dateFormat = "MMMMM d'st' yyyy";
                break;
            case 2:
                dateFormat = "MMMMM d'nd' yyyy";
                break;
            case 3:
                dateFormat = "MMMMM d'rd' yyyy";
                break;
            default:
                dateFormat = "MMMMM dd'th' yyyy";
                break;
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        System.out.println(formatter.format(fDate.getTime())); 
                                                                
    }
    public void printFormat() {
        Calendar fDate = Calendar.getInstance();
        fDate.set(Year, Month, Day);
        String dateFormat;
        int opt;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please choose the optional date format; ");
        System.out.println("1. yyyy-MM-dd");
        System.out.println("2. d/M/yyyy");
        System.out.println("3. dd-MMM-yyyy");
        System.out.println("4. MMM d yyyy");
        System.out.println("5. mm-dd-yyyy");
        opt = keyboard.nextInt();
        
        switch (opt) {
            case 1:
                dateFormat = "yyyy-MM-dd";
                break;
            case 2:
                dateFormat = "d/M/yyyy";
                break;
            case 3:
                dateFormat = "dd-MMM-yyyy";
                break;
            case 4:
                dateFormat = "MMM d yyyy";
                break;
            case 5:
                dateFormat = "mm-dd-yyyy";
                break;
            default:
                dateFormat = "MMMMM dd yyyy";
                break;
        }
        
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        System.out.println(formatter.format(fDate.getTime())); 
        keyboard.close();
                                                                
    }
}
