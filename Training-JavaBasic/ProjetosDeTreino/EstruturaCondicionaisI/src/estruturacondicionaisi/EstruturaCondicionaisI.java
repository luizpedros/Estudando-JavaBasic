/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondicionaisi;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class EstruturaCondicionaisI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Scanner teclado = new Scanner(System.in);
        // CONDICIONAL "if"(SE)!!!!
        //System.out.print("Primeira Nota: ");
        //float n1 = teclado.nextFloat();
        //System.out.print("Segunda Nota: ");
        //float n2 = teclado.nextFloat();
        //float m = (n1+n2)/2;
        //System.out.println("A média foi : " + m);
        
        //if (m>9) {
        //    System.out.println("Parabens");/*
        //}
        
        
        //CONDICIONAL COMPOSTA "if/else"(SeNão)
        System.out.print("Ano de nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2015 - nasc;
        
        if (idade >=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    
    
    
    }
    
}
