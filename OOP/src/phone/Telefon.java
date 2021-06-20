package phone;

public class Telefon {
	private String telefonnr;
	private String artTelefon;
	public String getTelfonnr() {
		return telefonnr;
	}

	public static void main(String[] args) {

	}

	public Telefon(String telefonnr, String artTelefon) {
		super();
		this.telefonnr = telefonnr;
		this.artTelefon = artTelefon;
	}

	public String getTelefonnr() {
		return telefonnr;
	}

	public void setTelefonnr(String telefonnr) {
		this.telefonnr = telefonnr;
	}

	public String getArtTelefon() {
		return artTelefon;
	}

	public void setArtTelefon(String artTelefon) {
		this.artTelefon = artTelefon;
	}
private void getInfo() {
System.out.println(telefonnr+" "+artTelefon);
}
}
