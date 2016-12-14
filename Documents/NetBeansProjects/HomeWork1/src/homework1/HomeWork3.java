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
public class HomeWork3 {

    public static void main(String[] Args) {
        //variables 
        // test1
        float first = 3.2f, second = 6.3f, third = 2.8f;
        System.out.println("This is isosceles triangle - " + isIsoscelesTriangle(first, second, third));

        long number;
        number = -6L;
        CheckNegative(number);

        double znach = -5.4;
        System.out.println("Add operation = " + AddMeth(znach));

        // test 2 
        double znCos, znSin;  // переменние
        znCos = 0.5;
        znSin = 9.3;
        String str1, str2;
        str1 = "rezult>5";
        str2 = "rezult<=5";
        double test = Test2(znCos, znSin);
        System.out.println(VyvidCons(str1, str2, test));
         System.out.println(VyvidConsYmova(str1, str2, test));
         
    }

// Methods for test1 
    private static double AddMeth(double znach) {
        return (znach > 0) ? 1 + znach : 1 - znach;
    }

    private static void CheckNegative(long number) {
        if (number < 0) {
            System.out.println("your number is negative");
        } else {
            System.out.println("your number isn't negative");
        }
    }

    private static boolean isIsoscelesTriangle(float first, float second, float third) {
        return (first == second || first == third || third == second);
    }

    //Metods test 2
    public static double Test2(double znCos, double znSin) {

        return ((25 * Math.cos(znCos)) / Math.sin(znSin));
    }

    public static String VyvidCons(String str, String str1, double test) {
        return (test > 5 ? str : str1);
    }
     public static String VyvidConsYmova(String str3, String str4, double test) {
        if(test > 5 ){
         return str3;
        } 
        else {
            return str4;
        }
        
    }
}

