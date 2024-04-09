import java.util.Scanner;
import java.util.Random;

public class Shiur10 {
    public static void ex1(int i, int a) {
        System.out.println("ex1______________________");
        int[] arr = new int[a];
        int x = arr.length;
        if (i > x) {
            System.out.println("Error!");
        }
        if (a % 2 != 0) {
            a = a - 1;
        }
        System.out.println(a);
    }

    public static void ex2(int[] arr) {
        System.out.println("ex2______________________");
        int sum = 0;
        int x = arr.length;
        for (int i = 0; i < x; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / x;
        System.out.println("the avg is: " + avg);
    }

    public static void ex3(int[] arr2) {
        System.out.println("ex3______________________");
        int max = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > max) {
                max = arr2[i];
            }
        }
        int min = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < min) {
                min = arr2[i];
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }

    public static void ex4(int[] arr3) {
        System.out.println("ex4______________________");
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(" ");
    }

    public static boolean ex5(int num) {
        System.out.println("ex5______________________");
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) ;
            System.out.print(arr[i]+", ");
        }
        for (int j = 0; j < 10; j++) {
            if (num == arr[j]) {
                return true;
            }
        }

        return false;
    }
    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ex6______________________");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number: " );
            arr[i] = scanner.nextInt();
        }
        for(int j=0; j<10; j=j+2){
            for(int k=1; k<10; k=k+2){
                if(arr[j]+arr[k]%2==0){
                    System.out.println(arr[j]+arr[k]+"zugi");
                }
            }
        }
    }
    public static void ex7() {
        Random r = new Random();
        System.out.println("ex7______________________");
        int[] arr = new int[10];
        int i;
        for (i = 0; i <arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        int num=0;
        for(i=0; i<10; i++){
            if(num<arr[i]) {
            num=arr[i];
            }
        }
        arr[9]=num;
        System.out.println(arr);
    }
    public static int ex9(String[] arr4, char x) {
        int count = 0;
        for (String str : arr4) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == x) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void ex10(int[] arr5, int num){
        int cnt=0;
        int i=0;
        for(i=0; i< arr5.length; i++){
           if (arr5[i]>num){
               cnt=cnt+1;
           }
        }
        System.out.println(cnt);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ex1(7, 8);
        int[] arr = {88, 97, 89, 95, 94, 85, 100};
        ex2(arr);
        int[] arr2 = {99, 89, 76, 84, 82, 100, 94};
        ex3(arr2);
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ex4(arr3);
        boolean found = ex5(88);
        System.out.println("Number found: " + found);
        ex6();
        ex7();
        String[] arr4 = {"hello", "world", "Java"};
        char x = 'a';
        int occurrences = ex9(arr4, x);
        System.out.println("Occurrences of '" + x + "': " + occurrences);
        int[] arr5 = {29,11,78,54,9,6,1,3};
        ex10(arr5,10);
    }
}

