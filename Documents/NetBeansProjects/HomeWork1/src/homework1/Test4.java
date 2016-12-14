/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author Kate
 */
public class Test4 {
     public static void main(String[] args) {
        // TODO code application logic here
        int percent=100;
        double happines=0.99;
        boolean znach = true;
        String str;
         str ="Hello U-Rise!"; 
         Task4(percent, happines, znach, str);
   
     }
     private static void Task4(int percent,double happines, boolean znach,  String str){
    System.out.println(str+"There is "+znach+",that there are "+ percent+" percent sucess"
            + "with "+happines+" happines" );
    
}
    
}
