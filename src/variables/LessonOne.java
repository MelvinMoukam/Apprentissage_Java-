package variables;

public class LessonOne {
	
	enum Color {
		green , red, yellow , blue ;
	}

	public static void main(String[] args) {
		
		int firstDay =3 ; 
		
		// Etape 1 :  variable daysInWeek avec une valeur de 7
	    
		int daysInWeek =7;
		
		// Etape 2 : valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci

		firstDay+=daysInWeek;
		
		 // Etape 3 :  constante numérique nommé STARTINGDAY avec la nouvelle valeur de la variable firstDay 
	
		final int STARTINGDAY =firstDay ; 
	
		  // Affiche le résultat 
        System.out.println("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + STARTINGDAY);
       
        
        // Mise en évidence de la boucle d'énumérattion for et for each
    	for(int i=0 ; i<=4; i++) {
    	Portéevar.PrintText("mes fans");
        }
    	
    
		for(int i:Portéevar.myArray) {
			System.out.println(i);
    	}
    	
		 for (int i=1; i<=5; i++){
	            System.out.println("i am having so much fun");
	        }
		 
		 
		 
		 
		 // Mise en évidence de la structure conditionnelle If || switch
		 
		 Color selectColor =  Color.blue ; 
		 
		switch(selectColor) {
		case green:
			System.out.println("la couleur selectionnée est verte");
			break; 
			
		case red:
			System.out.println("la couleur selectionnée est rouge");
			break; 
			
		case yellow:
			System.out.println("la couleur selectionnée est jaune");
			break; 
		case blue:
			System.out.println("la couleur selectionnée est blue");
			break; 
			
		default:
			System.out.println("Aucune couleur ne correspond");

		}
		   }
	}

	




