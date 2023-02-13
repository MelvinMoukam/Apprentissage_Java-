package les_classes;

public class Telephone {
	
	int pixels;
	String nom;
	Marque marque;
	
	
 public Telephone(int pixels,String nom,Marque marque){
	 
	 this.pixels=pixels;
	 this.nom=nom;
	 this.marque=marque;
}

	 public static void main(String[] args) {
	 
		Marque apple = new Marque("app");
		
		Telephone iphone = new Telephone(2000, "pro_max",apple);
		
		System.out.println (iphone.nom);
	

}
	
}
