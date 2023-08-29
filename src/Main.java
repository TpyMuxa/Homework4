public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int ageAdult = 18;
        int ageMinor = 17;

        if (ageAdult >= 18) {

            System.out.println("Если возраст человека равен " + ageAdult + " ,то он совершеннолетний");
        }
        if (ageMinor < 18) {

            System.out.println("Если возраст человека равен " + ageMinor + " ,то он не достиг совершеннолетия," +
                    "нужно немного подождать");
        }

        System.out.println("\nЗадание 2");

        int temperatureLow = 4;
        int temperatureHigh = 6;

        if (temperatureLow < 5) {

            System.out.println("На улице " + temperatureLow + " градусов, нужно надеть шапку");
        }

        if (temperatureHigh > 5) {

            System.out.println("На улице " + temperatureHigh + " градусов, можно идти без шапки");
        }

        System.out.println("\nЗадание 3");

        int speedLow = 50;
        int speedHigh = 70;

        if (speedLow < 60) {

            System.out.println("Если скорость " + speedLow + " км/ч ,то можно ездить спокойно");
        }

        if (speedHigh > 60) {

            System.out.println("Если скорость " + speedHigh + " км/ч ,то придется заплатить штраф");
        }

        System.out.println("\nЗадание 4");

        int age = 6;

        if (age > 2 && age <= 6) {

            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");
        }
        else {
            if (age >=7 && age < 18) {

                System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
            }
        else {
            if (age >= 18 && age < 24) {

                System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить в университет");
            }
            if (age >= 24) {

                System.out.println("Если возраст человека равен " + age + " то, ему нужно ходить на работу");
            }
            }
        }

        System.out.println("\nЗадание 5");

        int childAge = 14;

        if (childAge < 5) {

            System.out.println("Если возраст ребенка равен " + childAge + " ,то ему нельзя кататься на аттракционе");
        }
        else {
            if (childAge >= 5 && childAge < 14) {

                System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на " +
                        "аттракционе в сопровождении взрослого");
            }
            else {
                if (childAge >= 14) {

                    System.out.println("Если возраст ребенка равен " + childAge + " ,то ему можно кататься на " +
                            "аттракционе без сопровождения взрослого");
                }
            }
        }

        }
    }