public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int age = 25;
        int age2 = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " лет , то он совершеннолетний.");

        }
        if(age2 < 18){
            System.out.println("Если возраст человека " + age2 + " лет , то он не достиг совершеннолетия , надо немного подождать.");
        }

        System.out.println("Задача 2");

        int weather = 6;
        if(weather < 5){
            System.out.println("На улице " + weather + " градуса нужно надеть шапку");
        }
        else {
            System.out.println("На улице " + weather + " градусов можно идти без шапки");
        }

        System.out.println("Задача 3");

        int speed = 65;
        if(speed > 60){
            System.out.println("Скорость состовляет " + speed + " км/ч , нужно заплатить штраф.");
        }
        else {
            System.out.println("Скорость состовляет " + speed + " км/ч , можно ехать спокойно.");
        }

        System.out.println("Задача 4");

        int yers = 6;
        if(yers >= 2 && yers <= 6){
            System.out.println("Если возраст человека равен " + yers + " , то он идет в детский сад.");
        }
        if (yers >= 7 && yers <= 17){
            System.out.println("Если возраст человека равен " + yers + " , то он идет в школу.");
        }
        if (yers >= 18 && yers <= 24) {
            System.out.println("Если возраст человека равен " + yers + " , то он идет в университет;.");
        }
        if (yers > 24){
            System.out.println("Если возраст человека равен " + yers + " , то ему пора на работу.");
        }

        System.out.println("Задача 5");

        int year = 15;
        if (year < 5) {
            System.out.println("Если возраст ребенка равен " + year + " , то он не может кататься на атракционе.");
        }
        else if (year <= 14) {
            System.out.println("Если возраст ребенка равен " + year + " , то можно кататься в сопровождении.Если сопровождения нет кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + year + " , то можно кататься без сопровождения.");
        }

        System.out.println("Задача 6");

        int trainCar = 102;
        int seats =60;


        if (seats < 60) {
            System.out.println("Есть сидячие места.");
        } else if (trainCar < 102) {
            System.out.println("Есть стоячие места.");
        } else {
            System.out.println("Вагон полностью забит.");
        }

        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three){
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }












    }
}

