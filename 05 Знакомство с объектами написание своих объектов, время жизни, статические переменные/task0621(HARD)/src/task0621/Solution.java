package task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


Requirements:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);

        String grandFatherName = reader.readLine();
        String grandMotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String dauhterName = reader.readLine();



        Cat grandFather = new Cat (grandFatherName,null,null);
        Cat grandMother = new Cat (grandMotherName,null,null);
        Cat father = new Cat (fatherName,null,grandFather);
        Cat mother = new Cat (motherName,grandMother,null);
        Cat son = new Cat (sonName,mother,father);
        Cat dauhter = new Cat (dauhterName,mother,father);

        System.out.println("дедушка " + grandFather.name);
        System.out.println("бабушка " + grandMother.name);
        System.out.println("папа " + father.name);
        System.out.println("мама " + mother.name);
        System.out.println("Cын " + son.name);
        System.out.println("дочь " + dauhter.name);

        System.out.println("-------------------------------------------");

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(dauhter);



    }

    public static class Cat {
        private String name;
        private Cat mather;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        public Cat (String name, Cat mather, Cat father) {
            this.name = name;
            this.mather = mather;
            this.father = father;
        }

        @Override
        public String toString() {
            String str = "The cat's name is " + name;

            if (this.mather != null){
                str += ", mother is " + mather.name;
            }else {
                str += " no mother";
            }

            if (this.father != null){
                str += ", father is " + father.name;
            }else {
                str += " no father";
            }
            return str;
        }
    }

}
