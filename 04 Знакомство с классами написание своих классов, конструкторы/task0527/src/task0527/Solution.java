package task0527;

/* 
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.

Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.


Requirements:
1. Создай класс Dog.
2. Создай класс Cat.
3. В классе Dog должно быть три переменные.
4. В классе Cat должно быть три переменные.
5. Должен быть создан хотя бы один объект типа Mouse.
6. Должен быть создан хотя бы один объект типа Dog.
7. Должен быть создан хотя бы один объект типа Cat.*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", "blue", 5);
        Dog pupsDog = new Dog("Papi", true, 4);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код

    public static class Dog{
        String name;
        boolean wicked;
        int teeth;

        public Dog(String name, boolean wicked, int teeth) {
            this.name = name;
            this.wicked = wicked;
            this.teeth = teeth;
        }
    }

    public static class Cat {
        String name;
        String color;
        int weight;

        public Cat(String name, String color, int weight) {
            this.name = name;
            this.color = color;
            this.weight = weight;
        }
    }
}
