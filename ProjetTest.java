package projettest;
import java.util.Scanner;
/**
 * augustin.chateauricherd@gmail.com
 * @author Florian Perreaut
 */
public class ProjetTest 
{

    public static void main(String[] args) 
    {
        String tab[][] = créertab();
        

        
        int val=0;
        while(val!=4)
        {
        System.out.println("\n");
        System.out.println("1-Remplir le tableau entier avec un caractere");
        System.out.println("2-Saisir un caractere dans le tableau");
        System.out.println("3-Afficher le tableau");
        System.out.println("4-Arété le programme");

        Scanner sc = new Scanner(System.in);
        val=sc.nextInt();
        switch(val)
        {
            case 1:
                RemplirTab(tab,tab.length,tab.length);
                break;  
            case 2:
                saisirvaleur(tab);
                break;
            case 3:
                affichertab(tab, tab.length,tab.length );
                break;
                  
            default:
                System.out.println("Fin du Programme");
                
        }
        }
        

    }
    
    public static String[][] créertab()
    {
        
        System.out.println("Bienvenue dans cette fonction pour créer un tableau 2D de nombres entiers:");
        System.out.println("Tapez la taille de votre tableau : en absisse puis en ordonnée");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        String tab[][] = new String[x][y];
        
        return tab;
        
    }
    
    public static void saisirvaleur(String tab[][])
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez la valeur à insérer dans le tabelau:");
        String val = sc.next();
        System.out.println("Saisissez l'indice x puis l'indice y pour votre valeur:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        tab[x][y]=val; 
    }
    
    public static void affichertab(String tab[][], int x, int y)
    {
        int i,j;
        System.out.print("\n");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                    System.out.print(tab[i][j]);
            }
            System.out.print("\n");
        }
        
    }
    
    public static void RemplirTab(String tab[][], int x, int y)
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("Saisissez la valeur à insérer partout dans le tabelau:");
        String val = sc.next();
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                    tab[i][j]=val;
            }
        }
        
    }
    
    
    
}
