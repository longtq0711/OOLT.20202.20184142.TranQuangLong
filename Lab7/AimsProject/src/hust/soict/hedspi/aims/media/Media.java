package hust.soict.hedspi.aims.media;

public abstract class Media {
	String title;
	String category;
	float cost;
	public Media() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
}
