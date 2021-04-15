package echecs;





public class Pion extends Piece {
	Echiquier e;
	public Pion(String Couleur) {
		super("Pion", Couleur);
	}



	public boolean estValide(Deplacement deplacement) {
		
		
	
		{
			if (this.getCouleur().equals("noir")){
				
				return deplacement.getDeplacementY() <= (deplacement.getDepart().getLigne() == 1 ? 2 : 1) && deplacement.getDeplacementY() > 0;
			}
			else 
				return deplacement.getDeplacementY() >= (deplacement.getDepart().getLigne() == 6 ? -2 : -1) && deplacement.getDeplacementY() < 0;
		}
							
		}
		
	}


