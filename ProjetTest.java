/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projettest;

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
        int tab[][]=new int[5][5];
        
        saisirvaleur(5,0,2,tab);
        affichertab(tab);
        
    }
    
    public static void saisirvaleur(int val,int x,int y,int tab[][])
    {
        tab[x][y]=val;
    }
    
    public static void affichertab(int tab[][])
    {
        int x,y;
        
        for(x=0;x<tab.length;x++)
        {
            for(y=0;y<tab.length;y++)
            {
                if(y%5==0)
                {
                    System.out.println(tab[x][y]);
                }
                else
                {
                    System.out.print(tab[x][y]);
                }
            }
        }
        
    }
    
}

