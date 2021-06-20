package hotelbuchung;

public class Person {
	
	private String nachname;
	private String vorname;
	private String geschlecht;
	public Person(String nachname, String vorname, String geschlecht) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
	}
	
	public String vorstellen() {
		return "Mein Name ist "+nachname+", "+vorname;
				
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
	public String getGeschlecht() {
		return geschlecht;
	}
	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}
	
	

}
