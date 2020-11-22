/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer;

/**
 *
 * @author aleic
 */
public class Primer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num = 29;//per exemple
       boolean esPrimer = true;
       for (int i = 2; i <= num / 2; i++){
           
           if (num % i == 0) {
               esPrimer = false;
               break;
           }
       }
    if (esPrimer) {
        System.out.println(num + "es un numero primer.");
    
    }else {
        System.out.println(num + "no es un numero primer.");
        System.out.println("Otra version");
    }
    
    }
    
}
