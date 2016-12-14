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
public class HomeWork2T2 {

    public static void main(String[] Args) {
        //математические опрации
        double b, d;
        boolean h;
        b = 7.3 * 2.8;
        d = b / 3;
        System.out.println("addititve 7.3*2.8=" + b);
        System.out.println("subtraction b/3=" + b);
        h = (15 < 3);
        System.out.println("15<3 " + h);
        System.out.println("inverts value 15<3 " + !h);

        int a = 7;

        System.out.println(a--);
        System.out.println(++a);
        int rem;
        rem = a % 3;
        System.out.println("remainder a%3=" + rem);
        // тест 2
        double znCos, znSin; double rez; // переменние
                znCos = 34.5;
                znSin = 89.3;
            rez = (25 * Math.cos(znCos)) / Math.sin(znSin); // formula
       Test2( rez);
    // 3 тест
            String StrMain;
            StrMain = "My task 3"; // значение строки
        Test3(StrMain);
     // 4 тест 
        int percent = 100;
        double happines = 0.99;
        boolean znach = true;
        String str;
        str = "Hello U-Rise!";
        Task4(percent, happines, znach, str);
    }
public static void Test2(double rez){
        System.out.println("Результат заданой формулы =" + rez);
}
    public static void Test3(String str) {

        System.out.println(str);
    }

    private static void Task4(int percent, double happines, boolean znach, String str) {
        System.out.println(str + "There is " + znach + ",that there are " + percent + " percent sucess"
                + "with " + happines + " happines");

    }
}
