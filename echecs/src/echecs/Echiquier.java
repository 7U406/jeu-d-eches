package echecs;


public class Echiquier implements MEchiquier{
	
	private Case[][] location;
	
	public Echiquier() {
		location = new Case[8][8];
		for (int ctr = 0; ctr <= 7; ctr++)
			for (int ctr1 = 0; ctr1 <= 7; ctr1++)
				location[ctr][ctr1] = new Case();	
	}
	
	

	
	

	

	public Case getCase1(int colonne, int ligne) {
		
		return location[colonne][ligne];
	}

	

	

	








	@Override
	public void debuter() {
		// TODO Auto-generated method stub
		
	}








	@Override
	public Case getCase(int ligne, int colonne) {
		// TODO Auto-generated method stub
		return null;
	}








	@Override
	public boolean cheminPossible(Deplacement deplacement) {
		// TODO Auto-generated method stub
		return false;
	}








	@Override
	public boolean captureParUnPionPossible(Deplacement deplacement) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

 