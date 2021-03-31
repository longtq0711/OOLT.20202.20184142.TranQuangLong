package hust.soict.hedspi.aims.disc;

import java.util.Arrays;
import java.util.List;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public DigitalVideoDisc(String title, String director, String category, float cost, int length) {
	        this.title = title;
	        this.director = director;
	        this.category = category;
	        this.cost = cost;
	        this.length = length;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
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
	
	
}
