package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.PlayerException;

public class Track implements Playable, Comparable<Track> {
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
	public int compareTo(Track track) {
		if(this.title.compareTo(track.title) < 0)
			return -1;
		else if(this.title.compareTo(track.title) == 0)
			return 0;
		else return 1;
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
	
	public boolean equals(Object o) {
		Track track = (Track) o;
		if(length == track.length && title.equals(track.title)) return true;
		return false;
	}
	
}
