import java.util.Scanner;
import java.util.Random;

public class Yudim {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        // Exercise 1
        System.out.println("Exercise 1");
        System.out.print("Enter 3 words: ");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        int num1 = word1.compareTo(word2);
        int num2 = word2.compareTo(word1);
        if (num1 > num2)
            System.out.println("The word " + word1 + " is after than " + word2);
        else
            System.out.println("The word " + word2 + " is after than " + word1);
        // Exercise 2
        System.out.println("Exercise 2");
        System.out.println("Enter a sentence");
        scan.nextLine();  // Consume the newline character left by previous next() call
        String sentence = scan.nextLine();
        int size = sentence.length();
        System.out.println("The size of the sentence is " + size);

        // Exercise 3
        System.out.println("Exercise 3");
        System.out.print("Enter a word: ");
        String word4 = scan.next();
        String check = (word4.charAt(2) + "" + word4.charAt(1) + word4.charAt(0));
        if (check.equals(word4))
            System.out.println("true");
        else
            System.out.println("false");

        // Exercise 4
        System.out.println("Exercise 4");
        System.out.print("Enter a word: ");
        String word5 = scan.next();
        System.out.println(word5.charAt(2) + "" + word5.charAt(1) + word5.charAt(0));

        // Exercise 5
        System.out.println("Exercise 5");
        String word6 = scan.next(); // You need to specify what to do with word6

        // Exercise 6
        System.out.println("Exercise 6");
        int num3 = r.nextInt(100);
        System.out.println(num3);
        if (num3 % 2 == 0)
            System.out.println("The number is divisible by 2");
        if (num3 % 3 == 0)
            System.out.println("The number is divisible by 3");

        // Exercise 7
        System.out.println("Exercise 7");
        System.out.println("enter x1 and y1");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("enter x2 and y2");  // Fixed typo in the prompt
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        double d = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println("The distance between the two points is " + d);

        // Exercise 8
        System.out.println("Exercise 8");
        System.out.println("Enter the radius of the circle");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + area + " and the circumference is " + circumference);
    }
}

