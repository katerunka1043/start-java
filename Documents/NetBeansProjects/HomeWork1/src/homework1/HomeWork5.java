/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Arrays;

public class HomeWork5 {

    public static void main(String[] Args) {

        System.out.println(TriangleIsRight(4., 3., 5.));
        System.out.println(isIsoscelesTriangle(4, 3, 5));
        System.out.println(EquilateralTriangles(4., 3., 3., 3., 4., 4.));
 System.out.println("сума цифр - " + SumaDigit(15231010));
        System.out.println("сума цифр парна - " + SummDigit(125));
        System.out.println(" число поліндром - " + Polindrom(315513));
        System.out.println("сума однієєї половины цифр цго числа рівна сумі другої половины цифр -" + SummHalfDigit(3997));
    
    System.out.println("кожна наступна цифра не менша за попередню в заданому числі - " + SravnenieCHisel(5311));
    }

// Task 1
    public static boolean TriangleIsRight(double a, double b, double c) {
        return (Math.sqrt(a * a + b * b) == c);
    }
    //Task 2

    private static boolean isIsoscelesTriangle(float first, float second, float third) {
        return (first == second || first == third || third == second);
    }
    //Task 3

    private static boolean EquilateralTriangles(double a1, double a2, double a3, double a4, double a5, double a6) {
        boolean rezult;
        rezult = ((((a1 == a2) & (a2 == a3)) & ((a4 == a5) & (a5 == a6))) || (((a1 == a2) & (a2 == a4)) & ((a3 == a5) & (a5 == a6))) || (((a1 == a2) & (a2 == a5)) & ((a3 == a4) & (a4 == a6))) || (((a1 == a2) & (a2 == a6)) & ((a3 == a4) & (a4 == a5))) || (((a2 == a3) & (a3 == a4)) & ((a1 == a5) & (a5 == a6))) || (((a2 == a3) & (a3 == a5)) & ((a1 == a4) & (a4 == a6))) || (((a2 == a3) & (a3 == a6)) & ((a1 == a4) & (a4 == a5))));

        return rezult;
    }

    // task 4 
    public static int[] Digit4(int number) {
        int i = 0;
        int vyzn = number;
        do {                    // знаходимо ількість цифр в числі
            vyzn = vyzn / 10;
            i++;
        } while (vyzn > 10);
        int[] rozkladChysla = new int[i + 1]; // створюємо масив довжиною в кількість цифр
        int[] rozkladChyslaOb = new int[i + 1];
        for (int j = 0; j < i + 1; j++) {
            rozkladChysla[j] = number % 10;
            number = number / 10;
        }    // виводимо масив у зворотньому порядку
        for (int j = 0, k = rozkladChysla.length - 1; j < rozkladChysla.length; j++, k--) {
            rozkladChyslaOb[j] = rozkladChysla[k];
        }

        return rozkladChyslaOb;

    }
     public static int SumaDigit(int number) {
        int sum = 0;
        int vyzn = number;
        do {  
           sum=sum+vyzn%10;
            vyzn = vyzn / 10;
            
        } while (vyzn >= 10);
     return sum+vyzn;}
      

    public static boolean SummDigit(int number) {
        int[] massTask4;
        massTask4 = Digit4(number);
        int summ = 0;
        for (int i = 0; i < massTask4.length; i++) {
            summ = summ + massTask4[i];
        }
        return ((summ % 2) == 0);
    }
// task 5

    public static boolean Polindrom(int number) {
        int[] massTask5;
        massTask5 = Digit4(number);
        for (int j = 0, k = massTask5.length - 1; j < k; j++, k--) {
            if (massTask5[j] != massTask5[k]) {
                return false;
            }
        }

        return true;
    }

    // task 6
    public static boolean SummHalfDigit(int number) {
        int[] massTask6;
        int summ1 = 0;
        int summ2 = 0;
        massTask6 = Digit4(number);
        for (int j = 0, k = massTask6.length - 1; j < k; j++, k--) {
            summ1 = summ1 + massTask6[j];
            summ2 = summ2 + massTask6[k];
        }

        return (summ1 == summ2);
    }

    // task 7
    public static boolean SravnenieCHisel(int number) {
        int[] massTask7;
        int summ1 = 0;
        int summ2 = 0;
        massTask7 = Digit4(number);
        for (int j = 0, k = massTask7.length - 1; j < k; j++) {
            if (massTask7[j] < massTask7[j + 1]) {
                return false;
            }
        }

        return true;
    }
    /* private static boolean EquilateralTriangles1(double mas[]) {
    
    
    int count=0; int index=0;
    int count1=0;
    for(int i=1; i<mas.length;i++){
    if(mas[0]==mas[i]){
    count=count+1;}
    else{index=i;}
    }
    if(index!=0){
    for(int i=1; i<mas.length;i++){
    if((mas[index]==mas[i])&(index!=i)){
    count1=count1+1;}
    }
    boolean bool=false;
    bool=((count==6)||((count==3)&(count1==3)));
    return bool;}*/
}
