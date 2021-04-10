package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	public Track() {
		super();
	}
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	@Override
	public void play() {
		 System.out.println("Playing DVD: "+ this.getTitle());
		 System.out.println("DVD Length: "+ this.getLength());
	 }
}
