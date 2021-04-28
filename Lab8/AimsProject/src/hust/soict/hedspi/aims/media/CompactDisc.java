package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable {
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public CompactDisc() {
		super();
	}
	public CompactDisc(String title, String category, float cost, String artist) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artist = artist;
    }
	public String getArtist() {
		return artist;
	}
	public void addTrack(Track track) {
		for(int i = 0; i < tracks.size(); i++){
			if(tracks.get(i).getTitle() == track.getTitle()) {
				System.out.println("Track is already in the list of tracks");
				return;
			}
			else tracks.add(track);
		}
	}
	public void removeTrack(Track track) {
		for(int i = 0; i < tracks.size(); i++){
			if(tracks.get(i).getTitle() == track.getTitle()) {
				tracks.remove(i);
				System.out.println("Remove track succesfully");
				return;
			}
			else System.out.println("Track does not exist");;
		}
	}
	public static CompactDisc getCD() {
        Scanner sc = new Scanner(System.in);
        String title, category, artist, temp;
        float price;
        System.out.println("Enter the title:  ");
            title = sc.nextLine();

        System.out.println("Enter the category: ");
        	category = sc.nextLine();

        System.out.println("Enter the price: ");
            price = sc.nextFloat();   
    
        System.out.println("Enter the artist: ");
            artist = sc.nextLine();
           
        CompactDisc newCD = new CompactDisc(title, category, price, artist);
        
        System.out.println("Do you want to play CD(Y/N):");
        temp = sc.nextLine();
        if(temp.equalsIgnoreCase("y")) newCD.play();
        return newCD;
    }
	
	public int compareTo(Media media) {
		if(media instanceof CompactDisc) {
			CompactDisc cd = (CompactDisc)media;
			if(tracks.size() == cd.tracks.size()) {
				if(this.length < cd.getLength())
					return -1;
				else if(this.length == cd.getLength())
					return 0;
				else return 1;
			}
			else if(tracks.size() < cd.tracks.size())
				return -1;
			else return 1;
		}else {
			return super.compareTo(media);
		}
	}
	@Override
	public void play() {
		System.out.println("Title: " + this.getTitle());
		System.out.println("Artist: " + this.getArtist());
		System.out.println("Length: " + this.getLength());
		System.out.println("Director" + this.getDirector());
		if (tracks.isEmpty()) {
			System.out.println("Nothing to play");
		} else for(int i=0; i < tracks.size(); i++) {
			tracks.get(i).play();
		}
	}
	
}
