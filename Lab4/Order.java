package lab4;


public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERS = 5;
	public static int nbOrders = 0;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
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
	public void printOrdered() {
		System.out.println("***********************Order***********************");
		System.out.printf("Date: ");
		dateOrdered.print();
		System.out.printf("\nOrdered Items:\n");
		for(int i=1; i<=this.qtyOrdered; i++) {
			System.out.println(i + "DVD - " + itemOrdered[i].getTitle() + " - " + itemOrdered[i].getCategory()
					+ " - " + itemOrdered[i].getDirector() + " - " + itemOrdered[i].getLength()
					+ ": " + itemOrdered[i].getCost());
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc ...dvdlist) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("The order is almost full");
			return;
		}
		for (DigitalVideoDisc dvdlist1 : dvdlist) {
			if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
				this.itemOrdered[this.qtyOrdered++] = dvdlist1;
				System.out.println("The DVD " + dvdlist1.getTitle() + " has been added.");
			} else {
				System.out.println("The DVD " + dvdlist1.getTitle() + " could not be added.");			
			}
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED-1) {
				this.itemOrdered[this.qtyOrdered++] = dvd1;
				this.itemOrdered[this.qtyOrdered++] = dvd2;
				System.out.println("The DVD " + dvd2.getTitle() + " has been added.");
				System.out.println("The DVD " + dvd2.getTitle() + " has been added.");
			}
			else if (qtyOrdered < MAX_NUMBERS_ORDERED-1) {
				this.itemOrdered[this.qtyOrdered++] = dvd1;
				System.out.println("The DVD " + dvd1.getTitle() + " has been added.");
				System.out.println("The DVD " + dvd2.getTitle() + " could not be added.");
			} 
			else {
				System.out.println("The item quantity has reached its limit.");
			}
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			qtyOrdered++;
			itemOrdered[qtyOrdered] = disc; 
			System.out.println("The disc has been added");
		} else {
			System.out.println("The order is almost full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int flag = -1;
		for(int i = 1; i <= this.qtyOrdered; i++) {
			if (this.itemOrdered[i].getTitle().compareTo(disc.getTitle()) == 0) {
				flag = i;
				break;
			}
		}
		if (flag != -1) {
			for(int i = flag; i < this.qtyOrdered - 1; i ++) {
				itemOrdered[i] = itemOrdered[i+1];
			}
			qtyOrdered--;
			System.out.println("Remove succesfully");	
		}else {
			System.out.println("Disc not found");
		}
	}
	public float totalCost() {
		float total = 0;
		for(int i = 1; i <= qtyOrdered; i++) {
			total += this.itemOrdered[i].getCost();
		}
		return total;
	}

}
