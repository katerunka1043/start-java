/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

public class HomeWork6 {

    public static void main(String[] Args) {

        System.out.println(CheckOfShooterPosition(12, 0, 0));
        System.out.println(Fibonachi(9));
        System.out.println(Fibonachi(4));
        System.out.println(Factorial(3));
        System.out.println(FactorialNumber(1.6));
        System.out.println(CheckStringOfNumber("56456"));
        String str = StringDigit("Some1234 Digit5");
        System.out.println(str);
    }
//test 8;

    // розрахунок часу перетину
    public static double MomentsOfAccros(int hour) {
        double time;
        if (hour > 11) {
            time = (hour - 12) * 12 * 3600 / 11;
            return time;
        }
        time = hour * 12 * 3600 / 11;
        return time;
    }
// перевірка введених даних

    public static boolean CheckData(int hour, int minutes, int second) {
        return (hour >= 0 & minutes >= 0 & second >= 0 & hour < 24 & minutes < 60 & second < 60);
    }

    private static boolean CheckOfShooterPosition(int hour, int minutes, int second) {
        if (CheckData(hour, minutes, second) == false) {
            return false;
        }
        int rezhour, rezminutes, rezsecond;
        rezhour = (int) (MomentsOfAccros(hour) / 3600);
        rezminutes = (int) (MomentsOfAccros(hour) / 60 % 60);
        rezsecond = (int) (MomentsOfAccros(hour) % 60);
        return (rezhour == hour || rezhour == (hour - 12)) & rezminutes == minutes & rezsecond == second;
    }

    // тест 9
    public static int Fibonachi(int number) {

        if (number == 0 || number == 1) {
            return number;
        }
        if (number >= 2) {
            return Fibonachi(number - 2) + Fibonachi(number - 1);
        }
        return -1;
    }

    // test 10
    public static int Factorial(int numberf) {
        if (numberf < 0) {
            return 0;
        }
        if ((numberf == 0) || (numberf == 1)) {
            return 1;
        }
        return numberf * Factorial(numberf - 1);
    }
    // test11
    // якщо число типу double

    public static int FactorialNumber(double number) {
        if (number < 0) {
            return 1;
        }
        if ((number % (int) number) > 0.5) {
            return Factorial((int) number + 1);
        }
        return Factorial((int) number);
    }

    // test12
    public static boolean CheckStringOfNumber(String str) {
        //int strLength=str.length();
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (MethodParamDigit(a) == false) {
                return false;
            }
        }
        return true;
    }

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

    //test13
    public static int StringToDigit(char Data) {
        return Character.getNumericValue(Data);
    }

    // test 14
    public static String StringDigit(String strData) {
        String strNumbers;
        strNumbers = new String();
        for (int i = 0; i < strData.length(); i++) {
            if (MethodParamDigit(strData.charAt(i)) == true) {
                strNumbers = strNumbers + strData.charAt(i);
            }
        }
        return strNumbers;
    }

}
