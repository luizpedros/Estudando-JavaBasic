/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metado;

/**
 *
 * @author Admin
 */
public class Metado {
    //metado Procedimento
    //static void soma(int a,int b){
    //    int s =a+b;
    //    System.out.println("A soma é "+s);
    //}
    //--------------------------------------------------------------
    
    //Metado Função
    static int soma(int a, int b){
      int s = a+b;
      return s;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Chamando Procedimento 
    //    System.out.println("O programa começou");
    // soma(2,1);
    //-----------------------------------------------------------------
    
    //Chamar Função
        System.out.println("Começou o Programa");
    int sm = soma(2,5);
        System.out.println("A soma vale = "+sm);
    
    }
    
}
