package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;


public class DiskTest {
	public static void main(String[] args) {
			DigitalVideoDisc dvd1 = new DigitalVideoDisc("Harry Potter", "Animation", "Roger Allers", 19.95f, 87);
			DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 24.95f, 124);
			DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Jhon Musker", 18.99f, 90);
			DigitalVideoDisc dvd4 = new DigitalVideoDisc("AX", "Animation", "Long", 30f, 120);
			DigitalVideoDisc dvd5 = new DigitalVideoDisc("AX", "Animation", "Long", 30f, 120);
			
			Order anOrder = Order.getInstanceOrder();
			anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd5);
//			anOrder.printOrdered();
			System.out.printf("Total cost before get discount: %f %n", anOrder.totalCost());
			anOrder.getALuckyItem();
			System.out.printf("Total cost after get discount: %f %n", anOrder.totalCost());
			
			if (dvd1.search("Harrry Potter")) {
				System.out.println("Disc found: " + dvd1.getTitle());
			}
			else System.out.println("Disc not found!");
		}
	
}
