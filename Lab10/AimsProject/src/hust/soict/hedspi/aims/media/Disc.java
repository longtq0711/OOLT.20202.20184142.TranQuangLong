package hust.soict.hedspi.aims.media;

public class Disc extends Media {
	String director;
	int length;
	public Disc() {
		super();
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}

	public Disc(String id, String category, float cost) {
		super(id, category, cost);
	}
	
	public Disc(String id, String title, String category) {
		super(id, title, category);
	}
	
	public Disc(String id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public Disc(String id, String title, String category, int length, float cost) {
		super(id, title, category, cost);
		this.length = length;
	}
	
	public Disc(String id, String title, String category, String director, int length, float cost) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}
}
