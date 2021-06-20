package hochzeit;

public class Person {

	private String nachname;
	private String vorname;
	private String geschlecht;
	private Person partner=null;

	public Person(String nachname, String vorname) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
	}
	public void heiraten(Person p) {
		if (p.partner==null) {
		partner=p;
		partner.heiraten(this);}
	}
	
	public void scheiden() {
		if (partner!=null) {
		partner=null;
		partner.scheiden();}
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void getName() {
		System.out.println(nachname + ", " + vorname);
	}
	
	public void getInfo() {
		getName();
		if (partner!=null) {
		System.out.print("Partner: " );
		partner.getName();
		}

	}

}
