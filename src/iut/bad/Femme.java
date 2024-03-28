package iut.bad;

public class Femme extends Humain {

	public Femme(String nom, String prenom, int age) {
		super(nom,prenom,age);
		
	}
	
	public void parentString() {
		super.toString();
	}
	
	public static void main(String[] args) {
		Homme h1= new Homme("Rakoto","Nirina",42);
		Femme f1 = new Femme("Ravao", "Soa",40);
		Humain.ami(h1, f1,5);
	}
}
