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

        int age = 16;

        if (age > 2 && age <= 6) {

            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age < 18) {

            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        }
        if (age >= 18 && age < 24) {

            System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в университет");
        } else {
            if (age >= 24) {
                System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить на работу");
            }
        }

        System.out.println("\nЗадание 5");

        int childAge = 14;

        if (childAge < 5) {

            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14) {

            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на " +
                    "аттракционе в сопровождении взрослого");
        } else {
            if (childAge >= 14) {
                System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на " +
                        "аттракционе без сопровождения взрослого");
            }
        }

        System.out.println("\nЗадание 6");

        int placeSeat = 61;
        int placeStanding = 40;
        int person = placeSeat + placeStanding;
        int totalWagon = 102;
        int totalSeat = 60;
        int totalStanding = totalWagon - totalSeat;

        if (person >= totalWagon) {

            System.out.println("Мест в вагоне больше нет !");
        } else {

            if (placeSeat < totalSeat && placeStanding < totalStanding) {

                System.out.println("Сидячих мест осталось: " + (totalSeat - placeSeat) + "\nСтоячих мест осталось: " +
                        (totalStanding - placeStanding));
            }
            if (placeSeat >= totalSeat && placeStanding < totalStanding) {

                System.out.println("Сидячие места заняты, осталось стоячих: " + (totalStanding - placeStanding) + " мест");
            }
            if (placeSeat < totalSeat && placeStanding >= totalStanding) {

                System.out.println("Стоячие места заняты, осталось сидячих: " + (totalSeat - placeSeat) + " мест");
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
