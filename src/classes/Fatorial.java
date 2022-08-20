/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author João P. Arquim
 */
public class Fatorial{
    
     private int valor;
     private int result = 0;
     private String formula = "";
     
     public void setValor(int num){
        valor = num;
        int f = 1;
        String s = "";
        for(int i=num; i>1; i--){
            f *= i;
            s += i + " x ";
        }
        s += "1 = ";
        result = f;
        formula = s;
    }
     
     
    public int getFatorial(){
        return result;
    }
    
    public String getFormula(){
        return formula;   
    }
    
    
}
