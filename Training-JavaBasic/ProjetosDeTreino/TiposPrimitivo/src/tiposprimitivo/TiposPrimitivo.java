/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TiposPrimitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do aluno?");
        String nome = teclado.nextLine();
        System.out.println("Qual é sua nota?");
        float nota = teclado.nextFloat();
        System.out.format ("A nota de %s é %.2f \n ", nome, nota); 
         
    }
    
}
