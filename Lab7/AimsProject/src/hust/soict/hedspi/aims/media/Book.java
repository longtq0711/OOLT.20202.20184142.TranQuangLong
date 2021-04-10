package hust.soict.hedspi.aims.media;
import java.util.*;

public class Book extends Media {
	 private ArrayList<String> authors = new ArrayList<String>();
	public Book() {
		super();
	}
	public Book(String title, String category, float cost) {
		this.title = title;
        this.category = category;
        this.cost = cost;
      }
	  public static Book getBook() {
	        Scanner sc = new Scanner(System.in);
	        String title, category, temp;
	        float price;
	        System.out.println("Enter the title:  ");
	            title = sc.nextLine();

	        System.out.println("Enter the category: ");
	            category = sc.nextLine();

	        System.out.println("Enter the price: ");
	        	price = sc.nextFloat();
	       Book newBook = new Book(title, category, price);
	       return newBook;
	    }
	public void addAuthor(String authorName) {
		for(int i=0; i<authors.size(); i++) {
			if(authors.get(i).equals(authorName)) {
				System.out.println("Duplicate author name!");
			} else {
				authors.add(authorName);
			}
		}
	}

	public void removeAuthor(String authorName) {
		for(int i=0; i<authors.size(); i++) {
			if(authors.get(i).equals(authorName)) {
				authors.remove(i);
				System.out.println("Author name has been deleted!");
			}
		} 
	}
}
