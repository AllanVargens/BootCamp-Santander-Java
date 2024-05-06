import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your wheight?");
        double weight = scanner.nextDouble();

        // print the results

        System.out.println("My name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("I weigh " + weight + " kilograms");

        scanner.close();
    }

}
