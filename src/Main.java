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

    }
}