/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;


public class HomeWork4v2 {

    public static void main(String[] Args) {
        int[] test1Array = {5, 6, 3, 1, 4};
        System.out.println("Sum elements of array " + SumVariablesOfArray(test1Array));
        System.out.println("first number remainder second number it's " + MethodDivisionNumbers(6, 2));
        System.out.println("These  are  pairty or odd numbers at the same time  - " + MethodParityOfTwoNumbers(4, 8));

        System.out.println("Symbol is a digit " + MethodParamDigit('3'));
        double[] koreniRivn = Dyskryminant(2.0, 5., 2);
        for (int i = 0; i < koreniRivn.length; i++) {
            System.out.println(koreniRivn[i]);
        }
    }

    //task 4.1
    public static int SumVariablesOfArray(int[] ArrayInt) {
        int sum = 0;
        for (int i = 0; i < ArrayInt.length; i++) {
            sum = sum + ArrayInt[i];
        }
        return sum;
    }

//task 4.2
    public static boolean MethodDivisionNumbers(int number1, int number2) {

        return ((number1 % number2) == 0) ? true : false;
    } // у меня вопрос по етой строке 
    // система подсказивает что можно ето сделать 
    // просто прописав в условие return (number1%number2)==0)- можно ли так делать

    /**
     * другой вариант решения задания public static MethodDivisionNumbers(int
     * number1, int number2){ if((number1%number2)==0){
     * System.out.println("first number remainder second number") }
     * System.out.println("first number no remainder second number"); }
     *
     * @param Pnumber1
     * @param Pnumber2
     * @return
     */
//task 4.3
    public static boolean MethodParityOfTwoNumbers(int Pnumber1, int Pnumber2) {
        return (((Pnumber1 % 2 == 0) & (Pnumber2 % 2 == 0)) || ((Pnumber1 % 2 == 0) & (Pnumber2 % 2 == 0)));

    }
    //task 4.4

    public static boolean MethodParamDigit(char strparam) {
        char[] numberArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        boolean bool = false;
        for (int i = 0; i < numberArray.length; i++) {
            if (strparam == numberArray[i]) {
                bool = true;
            }
        }
        return bool;
    }
    //task 4.5

    public static double[] Dyskryminant(double a, double b, double c) {
        double d;
        d = b * b - 4 * a * c;
        if (d < 0) {
            return new double[]{};
        } else if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            return new double[]{x1, x2};
        } else {
            return new double[]{(-b / (2 * a))};
        }
    }
}
