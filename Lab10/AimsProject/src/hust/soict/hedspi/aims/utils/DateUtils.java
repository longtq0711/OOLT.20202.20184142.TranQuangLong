package hust.soict.hedspi.aims.utils;

public class DateUtils {
	public static int compare(MyDate d1, MyDate d2) {
		if(d1.getYear() > d2.getYear()) {
			return 1;
		} else if (d1.getYear() < d2.getYear()) {
			return -1;
		} else {
			if (d1.getMonth() > d2.getMonth()) {
				return 1;
			} else if (d1.getMonth() < d2.getMonth()) {
				return -1;
			} else {
				if (d1.getDay() > d2.getDay()) {
					return 1;
				} else if (d1.getDay() < d2.getDay()) {
					return -1;
				} else return 0;
			}
		}
	}
	
	
	public static void sortDate(MyDate[] dlist) {
		int n = dlist.length;
		for(int i=0; i<n-1; i++)
			for (int j=1; j<n-i-1; j++) {
				if(compare(dlist[i], dlist[j])>0){
					MyDate tmp = new MyDate();
					tmp.setDay(dlist[i].getDay());
					tmp.setMonth(dlist[i].getMonth());
					tmp.setYear(dlist[i].getYear());
					dlist[i].setDay(dlist[j].getDay());
					dlist[i].setMonth(dlist[j].getMonth());
					dlist[i].setYear(dlist[j].getYear());
					dlist[j].setDay(tmp.getDay());
					dlist[j].setMonth(tmp.getMonth());
					dlist[j].setYear(tmp.getYear());
 				}
			}
	}
	
	public static void printListDate(MyDate[] dlist) {
		for (int i=0; i<dlist.length; i++) {
			dlist[i].print();
		}
	}
	
	

}
