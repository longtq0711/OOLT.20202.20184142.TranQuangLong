package hust.soict.hedspi.test.media;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;

public class TestMediaCompareTo {

	public static void main(String[] args) {
		java.util.Collection<Media> collection = new java.util.ArrayList<Media>();
		Book b1 = new Book("Who", "kksaksl", 123);
		Book b2 = new Book("Why", "zxcv", 445);
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Long", "basdf", "qqw", 8, 11);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Tran", "jklasoid", "rtret",32, 12);
		
		CompactDisc cd1 = new CompactDisc("abcd", "music", 12, "jdjfwa");
		CompactDisc cd2 = new CompactDisc("ádfasdf", "music", 34, "asad");
		
		
		collection.add(b1);
		collection.add(b2);
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(cd1);
		collection.add(cd2);
		
		display(collection)
	
	}
	
	private static void display(java.util.Collection<Media> collection) {
		Iterator<Media> iterator = collection.iterator();
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		int i = 1;
		while(iterator.hasNext()) {
			Media media = iterator.next();
			if(media instanceof Book) {
				System.out.println(i + "Book"+ media.getId()+media.getTitle()+media.getCategory()+media.getCost());
			}else if(media instanceof DigitalVideoDisc) {
				System.out.println(i + "DVD"+ media.getId()+media.getTitle()+media.getCategory()+media.getCost());
			}else if(media instanceof CompactDisc) {
				System.out.println(i + "CD"+ media.getId()+media.getTitle()+media.getCategory()+media.getCost());
			}
			i++;
		}
		
		java.util.Collections.sort((List<Media>)collection);
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		i = 1;
		while(iterator.hasNext()) {
			Media media = iterator.next();
			if(media instanceof Book) {
				System.out.println(i + "Book"+ media.getId()+media.getTitle()+media.getCategory()+media.getCost());
			}else if(media instanceof DigitalVideoDisc) {
				System.out.println(i + "DVD"+ media.getId()+media.getTitle()+media.getCategory()+media.getCost());
			}else if(media instanceof CompactDisc) {
				System.out.println(i + "CD"+ media.getId()+media.getTitle()+media.getCategory()+media.getCost());
			}
			i++;
		}
		System.out.println("----------------------------------");
	}
}

