package echecs;


public class Case {
public static char[] value;
private	Piece piece;

public Piece getcase()
{
	return (piece);
}
public void setpiece(Piece p)
{
	this.piece=p;
}
public boolean estOccupe()
{
	return (piece != new X("Noir"));	
}

public Piece getPiece() {
	return piece;
}

}
