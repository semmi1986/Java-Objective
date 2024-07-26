package task0526;

/* 
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address


Requirements:
1. В классе Solution создай public static класс Man.
2. В классе Solution создай public static класс Woman.
3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
6. Конструкторы должны инициализировать переменные класса.
7. В методе main необходимо создать по два объекта каждого типа.
8. Метод main должен выводить созданные объекты на экран в указанном формате.*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Man man1 = new Man("John", 35, "China");
        Man man2 = new Man("Bob", 36, "Cuba");
        System.out.println(man1.getInfoMan());
        System.out.println(man2.getInfoMan());
        System.out.println("---------------------------------------");
        Woman woman1 = new Woman("Tom", 30, "Thailand");
        Woman woman2 = new Woman("Make", 32, "Thailand");
        System.out.println(woman1.getInfoWomen());
        System.out.println(woman2.getInfoWomen());


    }

    //напишите тут ваш код



    public static class Person{
        private  String name;
        private int age;
        private String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getInfoPerson(){
            return name + " " + age + " " + address;
        }
    }


    public static class Man extends Person{
        public Man(String name, int age, String address) {
            super(name, age, address);
        }

        public String getInfoMan(){
            return "I strong Man " + getInfoPerson();
        }
    }

    public static class Woman extends Person {
        public Woman(String name, int age, String address) {
            super(name, age, address);
            }

            public String getInfoWomen(){
                return "I small Man " + getInfoPerson();
            }
        }
    }

