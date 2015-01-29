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
public class Thing {
    
    public int numOne;
    public long numTwo;
    
    public void doSomething(){
        
        numOne = numOne + 10;
        this.numOne = this.numOne + 10; //exactement la même chose que dessus //this même téférence que l'objet Thing dans le main qui appelle la méthode
        
        //this = new Thing(); // this est uen variable final, donc fixe
        
        long numTwo = 10;
        this.numTwo = numTwo; // Deux variable différente distingué par this.
    }
}
