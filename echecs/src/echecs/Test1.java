package echecs;
import java.util.Scanner;

public class Test1 {
	static int k=1;
static	int r=1;
 static  int u=0;
static int n=0;
	static Case l[][]=new Case [8][8];
static Echiquier e=new Echiquier();
	static int i,v,x,y;
	static String t[]= {"1 ere joueur vas y","2 eme joueur vas y"};
	static String q[]= {"blanc","noir"};

	public static void main(String[] args) {
	
		for (int ctr = 0; ctr <8; ctr++)
		{
			for (int ctr1 = 0; ctr1 <8; ctr1++)
			{
				l[ctr][ctr1]=new Case();
			}	
		}
		for (int ctr = 0; ctr <8; ctr++)
		{
			for (int ctr1 = 0; ctr1 <8; ctr1++)
			
			{
				e.getCase1(ctr, ctr1).setpiece(new X("rouge"));
			}

		}
	int ligne = 7;
		
		for (String couleur = "noir" ; !couleur.equals("blanc"); couleur = "blanc", ligne = 0){
			
			e.getCase1(ligne,0).setpiece(new Tour(couleur));
			e.getCase1(ligne,1).setpiece(new Cavalier(couleur));
			e.getCase1(ligne,2).setpiece(new Fou(couleur));
			e.getCase1(ligne,3).setpiece(new Reine(couleur));
			e.getCase1(ligne,4).setpiece(new Roi(couleur));
			e.getCase1(ligne,5).setpiece(new Fou(couleur));
			e.getCase1(ligne,6).setpiece(new Cavalier(couleur));
			e.getCase1(ligne,7).setpiece(new Tour(couleur));
						ligne += couleur.equals("noir") ? -1 : 1;
		ligne=6;
			for (int ctr = 0; ctr <= 7; ctr++)
				e.getCase1( ligne,ctr).setpiece(new Pion(couleur));
		}
		
ligne=0;
e.getCase1(ligne,0).setpiece(new Tour("blanc"));
e.getCase1(ligne,1).setpiece(new Cavalier("blanc"));
e.getCase1(ligne,2).setpiece(new Fou("blanc"));
e.getCase1(ligne,3).setpiece(new Reine("blanc"));
e.getCase1(ligne,4).setpiece(new Roi("blanc"));
e.getCase1(ligne,5).setpiece(new Fou("blanc"));
e.getCase1(ligne,6).setpiece(new Cavalier("blanc"));
e.getCase1(ligne,7).setpiece(new Tour("blanc"));
ligne=1;
for (int ctr = 0; ctr <= 7; ctr++)
{
	e.getCase1( ligne,ctr).setpiece(new Pion("blanc"));
}
e.getCase1( 6,4).setpiece(new Tour("blanc"));
while(k!=0 && r!=0)
	{
	
	
		for(int f=0;f<2;f++)
	{
		System.out.println(t[f]);
	Scanner s= new Scanner(System.in);
	 i=s.nextInt();
	Scanner sce= new Scanner(System.in);
	 v=sce.nextInt();
	Scanner scmp= new Scanner(System.in);
	y=scmp.nextInt();
	Scanner ni= new Scanner(System.in);
	 x=ni.nextInt();
Position h=new Position(i,v);
Position a=new Position(y,x);
Deplacement m=new Deplacement(a,h);
if( e.getCase1(h.getLigne(), h.getColonne()).getPiece() instanceof Pion  )
{
if(e.getCase1(h.getLigne(), h.getColonne()).getPiece().estValide(m) && !(e.getCase1(h.getLigne(), h.getColonne()).getPiece().getCouleur().equals(e.getCase1(a.getLigne(), a.getColonne()).getPiece().getCouleur())) &&	e.getCase1(h.getLigne(), h.getColonne()).getPiece().getCouleur().equals(q[f])  )
{ 
{
	e.getCase1(a.getLigne(), a.getColonne()).setpiece(e.getCase1(h.getLigne(), h.getColonne()).getPiece());
	e.getCase1(h.getLigne(), h.getColonne()).setpiece(new X("Noir"));
	System.out.println("c est bon pion");
}
}
else
{
	System.out.println("non pion ");
}
}
else
{
	if(e.getCase1(h.getLigne(), h.getColonne()).getPiece().estValide(m) && !(e.getCase1(h.getLigne(), h.getColonne()).getPiece().getCouleur().equals(e.getCase1(a.getLigne(), a.getColonne()).getPiece().getCouleur())) &&	e.getCase1(h.getLigne(), h.getColonne()).getPiece().getCouleur().equals(q[f])   )
	{
		e.getCase1(a.getLigne(), a.getColonne()).setpiece(e.getCase1(h.getLigne(), h.getColonne()).getPiece());
		e.getCase1(h.getLigne(), h.getColonne()).setpiece(new X("Noir"));
		System.out.println("c est bon");
	}
	else
		System.out.println("non ");
}
		for(int i=0;i<8;i++)
		{
			
		for(int j=0;j<8;j++)
		{

			System.out.print(e.getCase1(i, j).getPiece().getNom());
		}
	
		System.out.println();
		}

	
for(int i=0;i<8;i++)
{
	
for(int j=0;j<8;j++)
{

	if(e.getCase1(i, j).getPiece().getNom().equals("Roi"))
	{
		if(e.getCase1(i, j).getPiece().getCouleur().equals("blanc"))
		{
			u++;
			
			
		}
		else			n++;
	}
}

}

	}
		
		
	k=u;
	r=n;
				
	}

	
	

	if(u==0)
	{
		System.out.print("le joueur 1 est perdu");	
		
	}
		
		if(n==0)
		{
			System.out.print("le 2 eme joueur a perdu");
			
			
		}

	}
}


