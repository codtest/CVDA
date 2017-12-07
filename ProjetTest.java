/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;
import java.util.Scanner;
/**
 *
 * @author Florian Perreaut
 */
public class ProjetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5, y = 5;
        int tab[][]=new int[x][y];
        
        saisirvaleur(tab);
        affichertab(tab, x, y);
    }
    
    public static void saisirvaleur(int tab[][])
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez la valeur à insérer dans le tabelau:");
        int val = sc.nextInt();
        System.out.println("Saisissez l'indice x puis l'indice y pour votre valeur:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        tab[x][y]=val; 
    }
    
    public static void affichertab(int tab[][], int x, int y)
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
    
}

