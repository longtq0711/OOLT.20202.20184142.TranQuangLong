package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.LuckyItemException;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static int nbOrders = 0;
	private MyDate dateOrdered;
	private static final int numberOfOrder = 2;
	private static final float thresholdsTotal = 100;
	private static final float thresholdsSale = 0.2f;
	
	public Order() {
		if(nbOrders >= MAX_NUMBERS_ORDERED) {
			System.out.println("The order is full, can't make any new order!");
			System.exit(0);
		} else {
			dateOrdered = new MyDate();
			nbOrders++;
			System.out.println("Creat new order successfully!");
		}
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
            System.out.println("3. Compact Disc.");
            type = sc.nextInt();
        } while (type != 1 && type != 2 && type !=3);
        
        switch(type){
            case 1:
                DigitalVideoDisc newDVD = DigitalVideoDisc.getDVD();
                itemsOrdered.add(newDVD);
                break;
            case 2:
                Book newBook = Book.getBook();
                itemsOrdered.add(newBook);
                break;
            case 3:
                CompactDisc newCD = CompactDisc.getCD();
                itemsOrdered.add(newCD);
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
	private boolean checkOrder(Order order) {
		for(Media media: order.itemsOrdered) {
			if(media.getCost() <= order.totalCost()*thresholdsSale)
				return true;
		}
		return false;
	}
		
	public Media getALuckyItem() throws LuckyItemException{
		if(itemsOrdered.size() >= numberOfOrder && this.totalCost() >= thresholdsTotal) {
			if(checkOrder(this)) {
				int item = 0;
				do {
					double rand = Math.random();
					rand *= itemsOrdered.size();
					item = (int)rand;
				} while (itemsOrdered.get(item).getCost() <= this.totalCost()*thresholdsSale);
				return itemsOrdered.get(item);
			}else {
				throw new LuckyItemException("All are bigger than (" + totalCost()*thresholdsSale + ")");
			}
		}else {
			throw new LuckyItemException("Numbers of Order " + numberOfOrder + "\nSum>= " + thresholdsTotal);
		}
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

}
