package hust.soict.hedspi.aims.media;
import java.util.*;

public class Book extends Media {
	 private ArrayList<String> authors = new ArrayList<String>();
	public Book() {
		super();
	}
	  public static Book getBook() {
	        Book newBook = new Book();
	        Scanner sc = new Scanner(System.in);
	        String temp;
	        System.out.println("Enter the title:  ");
	            newBook.setTitle(sc.nextLine());

	        System.out.println("Enter the category: ");
	            newBook.setCategory(sc.nextLine());

	        System.out.println("Enter the price: ");
	        	newBook.setCost(sc.nextFloat());
	        do {            
	                System.out.println("Enter the author name (enter to skip): ");
	                temp = sc.nextLine();
	                if(!temp.isEmpty())
	                    newBook.addAuthor(temp);
	                else
	                    return newBook;
	        } while (true);
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
