package echecs;
public interface MEchiquier
{
	
	public abstract void debuter();
	public abstract Case getCase(int ligne, int colonne);
	public abstract boolean cheminPossible (Deplacement deplacement);
	public abstract boolean captureParUnPionPossible(Deplacement deplacement);
}



