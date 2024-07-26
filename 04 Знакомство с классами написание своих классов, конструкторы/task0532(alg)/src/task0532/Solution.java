package task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.


Requirements:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить число на экран.
3. В классе должен быть метод public static void main.
4. Нельзя добавлять новые методы в класс Solution.
5. Программа должна выводить на экран максимальное из введенных N чисел.
6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        System.out.println("Введи число");
        int initNumber = Integer.parseInt(reader.readLine());
        if (initNumber <= 0) {
            return;
        }else {
            int inputNumber;
            maximum = initNumber;
            for (int i = 0; i < initNumber; i++) {
                System.out.println("Введи число еще " + (initNumber-i) + " раз");
                inputNumber = Integer.parseInt(reader.readLine());
                if (inputNumber > maximum) {
                    maximum = inputNumber;
                }
            }
        }

        System.out.println("Максимальное число введенных из " + initNumber + " раз равно: " + maximum );
    }
}
