public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int ageAdult = 18;

        if (ageAdult >= 18) {

            System.out.println("Если возраст человека равен " + ageAdult + " ,то он совершеннолетний");
        } else {

            System.out.println("Если возраст человека равен " + ageAdult + " ,то он не достиг совершеннолетия," +
                    "нужно немного подождать");
        }

        System.out.println("\nЗадание 2");

        int temperature = 4;

        if (temperature < 5) {

            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {

            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("\nЗадание 3");

        int speed = 50;

        if (speed <= 60) {

            System.out.println("Если скорость " + speed + " км/ч ,то можно ездить спокойно");
        } else {

            System.out.println("Если скорость " + speed + " км/ч ,то придется заплатить штраф");
        }

        System.out.println("\nЗадание 4");

        int age = 18;

        if (age > 2 && age <= 6) {

            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18) {

            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {

            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в университет");
        } else {

            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить на работу");
        }

        System.out.println("\nЗадание 5");

        int childAge = 13;

        if (childAge < 5) {

            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14) {

            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на " +
                    "аттракционе в сопровождении взрослого");
        } else {

            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на " +
                    "аттракционе без сопровождения взрослого");
        }

        System.out.println("\nЗадание 6");

        int placeSeat = 61;
        int placeStanding = 40;
        int person = placeSeat + placeStanding;

        if (person >= 102) {

            System.out.println("Мест в вагоне больше нет !");
        } else {

            if (placeSeat < 60 && placeStanding < 42) {

                System.out.println("Сидячих мест осталось: " + (60 - placeSeat) + "\nСтоячих мест осталось: " +
                        (42 - placeStanding));
            }
            if (placeSeat >= 60 && placeStanding < 42) {

                System.out.println("Сидячие места заняты, осталось стоячих: " + (42 - placeStanding) + " мест");
            }
            if (placeSeat < 60 && placeStanding >= 42) {

                System.out.println("Стоячие места заняты, осталось сидячих: " + (60 - placeSeat) + " мест");
            }
        }

        System.out.println("\nЗадание 7");

        int one = 100;
        int two = 101;
        int three = 200;

        if (one > two && one > three) {

            System.out.println("One, большее число");
        } else {
            if (two > one && two > three) {

                System.out.println("Two, большее число");
            } else {

                System.out.println("Three, большее число");
            }
        }
    }
}