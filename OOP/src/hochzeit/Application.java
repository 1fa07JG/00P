package hochzeit;

public class Application {

	public static void main(String[] args) {
Person p1 = new Person("Ptoltemeios","Kleopatra");
Person p2 = new Person("Antonius","Marcus");
p1.heiraten(p2);
p1.getInfo();
p2.scheiden();
p2.getInfo();
	}

}
