package lab3;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
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
