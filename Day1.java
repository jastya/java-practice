public class Day1 {
    public static void main(String[] args) {
        String name = "Jon";
        int year = 2026;
        int age = 25;
        String city = "New York";
        double weight = 70.5;
        boolean isStudent = true;
        char grade = 'A';

        System.out.println("Hello, " + name + "! It's " + year);
        System.out.println("I live in " + city);
        System.out.println("I am " + age + " years old");
        System.out.println("I weigh " + weight + "kg");
        if (isStudent) {
            System.out.println("I am a student.");
        } else {
            System.out.println("I am not a student.");
        }
        System.out.println("My grade is " + grade);

        double temperatureInCelsius = 25;
        double temperatureInFahrenheit = (temperatureInCelsius * 9.0 / 5.0) + 32.0;
        System.out.println("The temperature is " + temperatureInCelsius + "°C, Fahrenheit: "
                + temperatureInFahrenheit + "°F");

    }
}