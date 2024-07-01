public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int age = 25;
        int age2 = 17;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age2 < 18) {
            System.out.println("Если возраст человека " + age2 + " он не достиг совершеннолетия, нужно немного подождать");

        }

        System.out.println("Задача 2");

        int weather = 4;
        if (weather < 5){
            System.out.println("На улице " + weather + " градуса нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + weather + " можно идти без шапки");
        }

        System.out.println("Задача 3");

        int speed = 65;
        if (speed > 60) {
            System.out.println("Скорость состовляет " + speed + " км/ч, нужно заплатить штраф");
        }
            else {
                System.out.println("Скорость состовляет " + speed + " км/ч можно ехать спокойно");
            }

        System.out.println("Задача 4");

        int years = 25;
        if(years >= 2 && years <= 6){
            System.out.println("Если возраст человека " + years + " то он идет в детский сад");
        }
        if(years >= 7 && years <= 17){
            System.out.println("Если возраст человека " + years + " то он идет в школу");
        }
        if(years >= 18 && years <= 24){
            System.out.println("Если возраст человека " + years + " то его место в университете");
        }
        if(years > 24){
            System.out.println("Если возраст человека " + years + " то ему пора идти на работу");
        }

        System.out.println("Задача 5");

        int year = 13;
        if(year <= 5){
            System.out.println("Если ребенку меньше " + year + " лет то он не может кататься на атракционе");
        }
        if (year >= 5 && year <= 14){
            System.out.println("Если ребенку " + year + " лет то он может кататься только в сопровождении взрослого.Если взрослого нет то кататься нельзя");
        }
        if(year >= 14){
            System.out.println("Если ребенок старше " + year + " лет то он может кататься без взрослого");
        }

        System.out.println("Задача 6");

        int trainCar = 102;
        int seats = 60;
        if(seats < 60){
            System.out.println("Есть сидячие места");
        }
        if(seats > 60 || trainCar < 102){
            System.out.println("Есть стоячие места");
        }
        if(trainCar == 102 && seats == 60){
            System.out.println("Мест нет");

        }

        System.out.println("Задача 7");

       int one = 10;
       int two = 20;
       int three = 30;
       if(one < two && two < three){
           System.out.println(three + " Наибольшее число");
       }






































    }
}