public class Day2 {
    public static void main(String[] args) {
        int temperatureInCelsiusInt = 23;
        int temperatureInFahrenheitInt = (temperatureInCelsiusInt * 9 / 5) + 32;
        System.out.println("The temperature is " + temperatureInCelsiusInt + "°C, Fahrenheit: "
                + temperatureInFahrenheitInt + "°F"); // result does not consists the decimal part

        double temperatureInCelsius = 23.5;
        double temperatureInFahrenheit = (temperatureInCelsius * 9 / 5) + 32;
        System.out.println("The temperature is " + temperatureInCelsius + "°C, Fahrenheit: "
                + temperatureInFahrenheit + "°F"); // result does consist the decimal part

        String s1 = new String("Hey");
        String s2 = new String("Hey");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        String s3 = "Hey";
        String s4 = "Hey";
        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true
        s4 = "Hi";
        System.out.println(s3); // Hey
        System.out.println(s4); // Hi
        System.out.println(s3 == s4); // false

        String s5 = "Hey";
        System.out.println(s5.length());
        System.out.println(s5.toUpperCase());

        String s6 = "";

        for (int i = s5.length() - 1; i >= 0; i--) {
            s6 += s5.charAt(i);
        }
        System.out.println(s6);

        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        int[] numbers = { 1, -2, -3, -4, 0 };
        int sum = 0;
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Maximum number: " + max);
        System.out.println("Average: " + (double) sum / numbers.length);

        int a = 7;
        int b = 2;
        System.out.println("a / b = " + (a / b)); // Integer division, result is 3
        System.out.println("a % b = " + (a % b)); // Integer modulo, result is 1

        String s = null;
        System.out.println(s.length()); // This will throw a NullPointerException
    }
}