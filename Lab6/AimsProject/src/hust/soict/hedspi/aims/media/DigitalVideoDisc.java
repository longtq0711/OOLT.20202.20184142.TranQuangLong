package hust.soict.hedspi.aims.media;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	public DigitalVideoDisc(String title, String director, String category, float cost, int length) {
	        this.title = title;
	        this.director = director;
	        this.category = category;
	        this.cost = cost;
	        this.length = length;
	}
	public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean search(String title) {
		List<String> tokens = Arrays.asList(title.split(" "));
		List<String> list = Arrays.asList(this.title.split(" "));
		int count = 0;
		String thisTitle = this.title.toLowerCase();

		for(String token : tokens) {
			token = token.toLowerCase();
			if(thisTitle.contains(token)) {
				count++;
				continue;
			}
		}
		return (count == list.size());
	}
	
	 public static DigitalVideoDisc getDisc() {
	        DigitalVideoDisc newDisc = new DigitalVideoDisc(); 
	        Scanner sc = new Scanner(System.in);
	        String temp;
	        System.out.println("Enter the title:  ");
	            newDisc.setTitle(sc.nextLine());

	        System.out.println("Enter the category: ");
	            newDisc.setCategory(sc.nextLine());

	        System.out.println("Enter the price: ");
	            newDisc.setCost(sc.nextFloat());   
	    
	        System.out.println("Enter the director name: ");
	            newDisc.setDirector(sc.nextLine());
	            
	        System.out.println("Enter the lenght of disc: ");
	            newDisc.setLength(sc.nextInt());
	        return newDisc;
	    }
	
	
}
