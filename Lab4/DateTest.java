package lab4;

public class DateTest {
    public static void main(String[] args) {
    	MyDate aDate = new MyDate("twenty-ninth","February","twenty twenty");
        MyDate bDate = new MyDate("First","January","twenty");
        MyDate cDate = new MyDate("Second","January","twenty twenty one");
        MyDate dDate = new MyDate("Third","January","twenty twenty one");
        MyDate eDate = new MyDate("Fourth","January","twenty twenty one");
        MyDate fDate = new MyDate("Fifth","January","twenty twenty one");

        MyDate[] dlist = {aDate, bDate, cDate, dDate, eDate, fDate};
//        aDate.setMonth(2);
//        aDate.setDay(29);
//        aDate.setYear(2100);
//        aDate.accept();
        aDate.print();
        bDate.print();
        if (DateUtils.compare(aDate, bDate)>0) {
        	System.out.printf("aDate is after bDate\n");
        } else if (DateUtils.compare(aDate, bDate)<0) {
        	System.out.printf("aDate is before bDate\n");
        } else System.out.printf("aDate is bDate\n");
        aDate.printFormat();
        System.out.println("Date list before sorting: ");
        DateUtils.printListDate(dlist);
        DateUtils.sortDate(dlist);
        System.out.println("Date list after sorting: ");
        DateUtils.printListDate(dlist);
    }
}