package hust.soict.hedspi.aims.media;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.PlayerException;

public class DigitalVideoDisc extends Media implements Playable, Comparable<Media> {
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
	
	 public static DigitalVideoDisc getDVD() {
	        Scanner sc = new Scanner(System.in);
	        String title, category, director, temp;
	        float price;
	        int length;
	        System.out.println("Enter the title:  ");
	            title = sc.nextLine();

	        System.out.println("Enter the category: ");
	        	category = sc.nextLine();

	        System.out.println("Enter the price: ");
	            price = sc.nextFloat();   
	    
	        System.out.println("Enter the director name: ");
	            director = sc.nextLine();
	            
	        System.out.println("Enter the lenght of disc: ");
	            length = sc.nextInt();
	        DigitalVideoDisc newDVD = new DigitalVideoDisc(title, director, category, price, length);
	        
	        System.out.println("Do you want to play DVD(Y/N):");
	        temp = sc.nextLine();
	        if(temp.equalsIgnoreCase("y")) newDVD.play();
	        return newDVD;
	    }
	 public int compareTo(Media media) {
			if(media instanceof DigitalVideoDisc) {
				if(this.getCost() < media.getCost())
					return -1;
				else if(this.getCost() == media.getCost())
					return 0;
				else return 1;
			}else {
				return super.compareTo(media);
			}
		}
	 
	 @Override
	 public void play() throws PlayerException{
			if(this.getLength() > 0) {
				System.out.println("Playing DVD: " + this.getTitle());
				System.out.println("DVD length: " + this.getLength());
			} else {
				throw new PlayerException("ERROR: DVD length is non-positive");
			}
		}
	 
	 
	
	
}
