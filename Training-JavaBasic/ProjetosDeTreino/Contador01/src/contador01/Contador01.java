/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author Admin
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Estrutura de repetição
        //int cc = 0;
        //while(cc<4){
        //    System.out.println("Pula" + cc);
        //    cc++;
        //}
        
        
        
        //Mudando fluxo de um laço (continue)
        
        int cc = 1;
        while(cc<=10){
            System.out.println("Pula" + cc);
            cc++;
            if (cc == 5 || cc == 8 || cc == 10){
               continue; 
            }
        }    
            
            
       
            
        
    }
    
}
