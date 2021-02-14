/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //String m[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        //int d[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        //for(int c=0; c<m.length; c++){
        //    System.out.println("O mês de " + m[c]+" tem "+
        //            d[c] + " dias ao todo.");   
        //}
        //-----------------------------------------------------------------------
        //*Colocar Vetor em ordem
        //int num[]= {3,5,1,8,4};
        //Arrays.sort(num);
        //for(int valor:num){
        //    System.out.println(valor);
            
        //}
        //-----------------------------------------------------------------------
        // BUSCA
        //int num[]= {3,5,1,8,4};
        // int psd= Arrays.binarySearch(num, 9);
        // System.out.println(psd);
        
        //-----------------------------------------------------------------------
        //Preenchimento do Vetor automativo
        
        int num[]= new int[5];
        Arrays.fill(num, 8);
        for(int valor: num){
        
            System.out.println(valor);   }
        
    }
    
}
