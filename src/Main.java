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

    }
}