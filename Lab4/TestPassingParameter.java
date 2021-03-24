package lab4;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		}
	
	public static void swap(Object o1, Object o2) {
		DigitalVideoDisc dvd1 = (DigitalVideoDisc) o1;
		DigitalVideoDisc dvd2 = (DigitalVideoDisc) o2;
		DigitalVideoDisc tmp = new DigitalVideoDisc(dvd1.getTitle());
		tmp.setCategory(dvd1.getCategory());
		tmp.setCost(dvd1.getCost());
		tmp.setDirector(dvd1.getDirector());
		tmp.setLength(dvd1.getLength());
		
		dvd1.setCategory(dvd2.getCategory());
		dvd1.setCost(dvd2.getCost());
		dvd1.setDirector(dvd2.getDirector());
		dvd1.setLength(dvd2.getLength());
		dvd1.setTitle(dvd2.getTitle());
		
		dvd1.setCategory(tmp.getCategory());
		dvd1.setCost(tmp.getCost());
		dvd1.setDirector(tmp.getDirector());
		dvd1.setLength(tmp.getLength());
		dvd1.setTitle(tmp.getTitle());
		
	}
	
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}