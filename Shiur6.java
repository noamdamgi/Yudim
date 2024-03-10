import java.util.Scanner;

public class Shiur {

    public static void ex1() {
        Scanner scan = new Scanner(System.in);
        int ave, grade, sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter a number: ");
            grade = scan.nextInt();
            sum = sum + grade;
        }
        ave = sum / 5;
        System.out.println(ave);
    }

    public static void ex2() {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        String str;
        do {
            System.out.println("enter String: ");
            str = scan.next();
            count++;
        } while (!(str.equals("enter")));
        System.out.println(count);
    }

    public static void ex3(int code) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a secret code: ");
        int trying = scan.nextInt();
        if (trying == code) {
            System.out.println("How much money? ");
        } else {
            for (int i = 1; i <= 2; i++) {
                System.out.println("enter a secret code: ");
                trying = scan.nextInt();
                if (trying == code) {
                    System.out.println("how much money? ");
                    break;
                }
            }
        }
        if (trying != code) {
            System.out.println("Error");
        }
    }

    public static void ex4(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }

    public static void ex5(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }

    public static void ex6(String str1) {
        int i;
        int pal = 1;
        int len = str1.length();
        for (i = 0; i < len / 2; i++) {
            int x = len - i - 1;
            char a = str1.charAt(x);
            char b = str1.charAt(i);
            if (a != b) {
                pal = 0;
                break;
            }
        }
        if (pal == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void ex7(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static void ex8() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.print(i * j + " ");
            System.out.println();
        }
    }

    public static void ex9() {
        Scanner scan = new Scanner(System.in);
        int i;
        for (i = 1; i < 1; i++) {
            int num = scan.nextInt();
        }
    }

    public static boolean ex10(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0;
        int b = 1;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return n == b;
    }

    public static void ex11(int num, int num2) {
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            cnt += num2;
        }
        System.out.println(cnt);
    }

    public static void ex12(int h) {
    	  for (int i = 0; i < h; i++) {
              for (int j = 0; j < h - i - 1; j++) {
                  System.out.print(" ");
              }
              for (int j = 0; j < 2 * i + 1; j++) {
                  System.out.print("*");
              }
              System.out.println();
        }
    }

    public static void ex13(int a, int n) {
        if (a > n) {
            for (n = n; n <= a; n++) {
                System.out.print(n + " ");
            }
        } else {
            for (a = a; a <= n; a++) {
                System.out.print(a + " ");
            }
            System.out.println(" ");
        }
    }

    public static void ex14(int start, int end) {
        int a = 0, b = 1;

        while (b < end) {
            if (b >= start) {
                System.out.print(b + ", ");
            }
            int temp = b;
            b = a + b;
            a = temp;
        }
    }

    public static void ex15(int h) {
    	  for (int i = 1; i < h; i++) {
              for (int j = 0; j < h - i - 1; j++) {
                  System.out.print(" ");
              }
              for (int j = 1; j < 2 * i + 1; j++) {
                  System.out.print("*");
              }
              System.out.println();
        }
        
    }
    

    public static void main(String[] args) {
    	ex1();
    	ex2();
    	ex3(43);
    	ex4(1234);
    	ex5(46);
    	ex6("aba");
    	ex7(27);
    	ex8();
    	ex9();
    	ex10(4);
    	ex11(3,5);
    	ex12(4);
    	ex13(5, 6);
    	ex14(2,4);
        ex15(7);
    }
}
