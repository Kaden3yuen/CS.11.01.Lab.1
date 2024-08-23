import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        int ReadingAge = 100 - age;

        System.out.println(age + " year olds should read at least " + ReadingAge + " pages before giving up on a book.");

    }
}
