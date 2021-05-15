package hust.soict.hedspi.aims.media;

public abstract class Media {
	String title;
	String category;
	float cost;
	String id;
	public Media() {
		super();
	}
	public String getId() {
		return id;
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
	public Media(String id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public Media(String id, String category, float cost) {
		this.id = id;
		this.category = category;
		this.cost = cost;
	}
	
	public Media(String id, String title, String category) {
		this.id = id;
		this.title = title;
		this.category = category;
	}
	
	public Media(String id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public int compareTo(Media media) {
		if (this instanceof Book && (media instanceof DigitalVideoDisc || media instanceof CompactDisc)) {
			return -1;
		}
		if(this instanceof DigitalVideoDisc && media instanceof CompactDisc)
			return -1;
		if(this instanceof CompactDisc && (media instanceof DigitalVideoDisc || media instanceof Book))
			return 1;
		if(this instanceof DigitalVideoDisc && media instanceof Book)
			return 1;
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		Media media = (Media) o;
		if(id.equals(media.id)) return true;
		return false;
	}
}
