package echecs;

public class Cavalier extends Piece {
	
		
		
		public Cavalier(String Couleur) {
			super("Cavalier", Couleur);
		}

		
		public boolean estValide(Deplacement deplacement) {
			/*Verifie si le quotient des deux deplacement est Žgal a 2 ou ˆ .5, se qui garantie que la
			 * piece ˆ fait un mouvement en "L".
			 */
			return (Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY())) == 2 |
					(Math.abs(deplacement.getDeplacementX() / deplacement.getDeplacementY())) == .5;
		}
	}



