import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        int DatingAge = 7 + (age / 2);

        System.out.println(age + "should date somebody who is at least " + DatingAge + " old");


    }
}
