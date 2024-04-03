package iut.bad;

public class Humain {

	private String nom, prenom;
	private int age;
	
	public Humain(String nom, String prenom, int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}
	
	public String getNom() {
		return this.nom;
	}
	public String getPrenom() {
	return this.prenom;	
	}
	
	public int getAge() {
	return this.age;
	}
	
	public void setNom(String nom) {
	this.nom=nom;	
	}

	public void setPrenom(String prenom) {
	this.prenom=prenom;
	}

	public void setAge(int age) {
	this.age=age;
	}
	
	public void details() {
	System.out.println(" Nom: "+getNom()+" Prénom: "+getPrenom()+" Age: "+getAge()+" ans ");	
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Nom: ");
		sb.append(getNom());
		sb.append(" Prénom: ");
		sb.append(getPrenom());
		sb.append(" Age: ");
		sb.append(getAge()+" ans ");
		
		return sb.toString();
	}
	
	static int dure=100;
	public static void ami(Humain pers, Humain hom, int duree) {
		dure=duree;
		System.out.println(pers.getNom() + " "+pers.getPrenom()+
							" est ami avec "+hom.getNom() + " "+hom.getPrenom()+
							"et sont amis depuis : "+dure+" jours");
	}
	
}
