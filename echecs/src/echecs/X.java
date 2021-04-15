package echecs;

	public class X extends Piece {
		public X(String couleur) {
			super("x",couleur);
		}
		 
			public boolean estValide(Deplacement deplacement) {
				return false;
				
			}
}
