/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cours9;

/**
 *
 * @author Dreux
 */
public class MainCours9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thing t = new Thing(); //t est uen référence vers un objet de type Thing
        t.numOne = 10;
        int value = t.numOne; //t.numOne est une expression qui de type int à la compilation et de valeur 10 à l'exécution 
        Box b = new Box();
        b.getOneThing(); //ref vers un objet Thing
        t.numOne = b.getOneThing().numOne; //ref vers un objet Thing, puis ref vers un int
        
        
        
        Thing t1 = new Thing(); //t1 pointe vers une adresse mémoire
        Thing t2 = new Thing(); //t2 pointe vers uen autre adresse mémoire
        t1.numOne = 10;
        t2.numOne = 5;
        t1.doSomething(); // valeur à 30
        t2.doSomething(); // Valeur à 25
        t1 = t2; // la valeur de t1 est modifiable ici.
                
    }
    
}
