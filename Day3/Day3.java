package Day3;

public class Day3 {
    public static void main(String[] args) {
        System.out.println("Is 5 even? " + isEven(5));
        System.out.println("Max of 100 and 20: " + max(100, 20));
        System.out.println("Reversed string of 'Just': " + reverseString("Just"));

        BankAccount account1 = new BankAccount(1000.0);
        BankAccount account2 = new BankAccount(500.50);
        BankAccount account3 = new BankAccount(200.08);
        System.out.println("Number of accounts created: " + BankAccount.getAccountCounter());

        int num = 5;
        System.out.println("Original value of num: " + num);
        increment(num);
        System.out.println("Now value of num: " + num); // Original value of num is not changed because Java
                                                        // follows pass-by-value for primitive types.

        Person person = new Person("Alice", 30);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        person.birthday();
        System.out.println(person.getName() + " is now " + person.getAge() + " years old."); // The age is incremented
                                                                                             // for the
        // person objet as Java passed the
        // value of the reference to the
        // object, allowing the method to
        // modify the object's state.

        System.out.println("Area of circle with radius 5: " + area(5));
        System.out.println("Area of rectangle with length 4 and width 6: " + area(4, 6));
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static void increment(int number) {
        System.out.println("Incremented value of 5: " + (++number));
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

}
