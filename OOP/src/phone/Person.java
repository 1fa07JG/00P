package phone;


import java.time.LocalDate;

public class Person {
	private int persnr;
	private String nachname;
	private String vorname;
	private String geschlecht;
	private LocalDate gebdatum;

	public int getPersnr() {
		return persnr;
	}

	public void setPersnr(int persnr) {
		this.persnr = persnr;
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

	public LocalDate getGebdatum() {
		return gebdatum;
	}

	public void setGebdatum(LocalDate gebdatum) {
		this.gebdatum = gebdatum;
	}

	public Person(int persnr, String nachname, String vorname, String geschlecht, LocalDate gebdatum) {
		super();
		this.persnr = persnr;
		this.nachname = nachname;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
		this.gebdatum = gebdatum;
	}
	
	private void getInfo() {
System.out.println(persnr+" "+nachname+" "+vorname+" "+geschlecht+" "+gebdatum);
	}

}
