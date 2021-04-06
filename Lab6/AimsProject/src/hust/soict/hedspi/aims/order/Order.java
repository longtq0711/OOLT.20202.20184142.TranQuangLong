package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static int nbOrders = 0;
	private MyDate dateOrdered;
	
	private Order() {
		dateOrdered = new MyDate();
	}
	public static Order getInstanceOrder() {
		if(nbOrders <= MAX_LIMITTED_ORDERS) {
			Order newOrder = new Order();
			nbOrders++;
			return newOrder;
		}
		else {
            System.out.println("The numbers of orders is almost max.");
            return null;
        }
	}
	public int size() {
		return itemsOrdered.size();
	}
	
	public void addMedia(Media item) {
		if(itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(item);
		} else {
			System.out.println("The order is full!");
			return;
		}
	}
	
	public void addMedia() {
        int type = 0;
        Scanner sc = new Scanner(System.in);
        if(itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("Order is full. Cannot add more.");
            return;
        }
    
        do {            
            System.out.println("Choose type of media you want to add: ");
            System.out.println("1. Digital Video Disc.");
            System.out.println("2. Book.");
            type = sc.nextInt();
        } while (type != 1 && type != 2);
        
        switch(type){
            case 1:
                DigitalVideoDisc newDisc = DigitalVideoDisc.getDisc();
                itemsOrdered.add(newDisc);
                break;
            case 2:
                Book newBook = Book.getBook();
                itemsOrdered.add(newBook);
                break;
        }
    }
	
	public void removeMedia(Media item) {
		if(itemsOrdered.size() > 0) {
			itemsOrdered.remove(item);
		} else {
			System.out.println("Empty order. Please add some item");
			return;
		}
	}
	public void removeMedia(int id) {
        if(itemsOrdered.size() <= 0) {
            System.out.println("Empty order. Please add some items.");
            return;
        }
        if(id < itemsOrdered.size())
                itemsOrdered.remove(id);

    }
	
	public static int getOrderId() {
		Scanner sc = new Scanner(System.in);
		int orderId = 0;
		do {
			System.out.println("Please choose order id: ");
			orderId = sc.nextInt();
		} while(orderId<0 || orderId > Order.nbOrders);
		return orderId;
	}
		
	
	public void printOrdered() {
		System.out.println("***********************Order***********************");
		System.out.printf("Date: ");
		dateOrdered.print();
		System.out.printf("\nOrdered Items:\n");
		int i=1;
		for(Media media: itemsOrdered) {
			System.out.println(i + ". " + "DVD - " + media.getTitle() + " - " + media.getCategory() +
		             " - " + media.getCost());
		i++;
		}
		System.out.println("Total cost: " + totalCost());
	}
	
	public float totalCost() {
		float total = 0;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
//	public DigitalVideoDisc getALuckyItem() {
//		int lucky_item = (int)(Math.random() * ((this.qtyOrdered - 1)+1)+1);
//		System.out.println(lucky_item);
//		if (lucky_item > this.qtyOrdered) {
//			return null;
//		} else {
//			this.itemOrdered[lucky_item].setCost(0);
//			return this.itemOrdered[lucky_item];
//		}
//	}

}
