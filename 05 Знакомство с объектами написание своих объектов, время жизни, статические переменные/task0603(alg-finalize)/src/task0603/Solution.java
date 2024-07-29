package task0603;

/* 
Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).


Requirements:
1. В классе Cat должен быть void метод finalize.
2. В классе Dog должен быть void метод finalize.
3. Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
4. Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
5. Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Cat[] arrCat = new Cat[500000];
        Dog[] arrDog = new Dog[500000];

        for (int i = 0; i <500000; i++) {
            arrCat[i] = new Cat();
            arrDog[i] = new Dog();
        }
//        System.out.println(Arrays.toString(arrCat));
    }
}

class Cat {
    @Override
     protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
