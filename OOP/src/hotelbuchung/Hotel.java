package hotelbuchung;

public class Hotel {
	private int zimmer;
	private int belegt;
	private Person [] gast=new Person[zimmer];
	
	public void einmieten(Person g) {
		if (zimmer-belegt>0) {
		gast[belegt]=g;
		belegt++;}
		else {
			System.out.println("Das hotel ist bereits voll belegt");
		}
	}
	
   public void freieZimmer() {
		
	}
   
   public void status() {
for (int i = 0; i < belegt; i++) {
	gast[i].vorstellen();
}
}

}
