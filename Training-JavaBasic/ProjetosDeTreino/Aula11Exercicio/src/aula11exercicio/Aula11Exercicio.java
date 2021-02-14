/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11exercicio;

import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Aula11Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int n, s=0, i=0; 
        do{
          n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
          s+=n;
          if (n % 2 ==0){
              i+= n;
          }else break;
        }while(n != 0);
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>Somatoria Total: "+s
        +"<hr> <br>Soma dos pares: </html>"+i);
    
     
    
    
    }
    
    }
    
