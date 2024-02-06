import java.util.Scanner;
import java.util.Random;

public class Test {
	 public static void ex1() {
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Please enter the student's name: ");
	 String Name = scan.nextLine();
	 System.out.println("Hello " + Name);
	    }
	 public static void ex2() {
	 Scanner scan = new Scanner(System.in);
	 System.out.print("enter a number: ");
	 int num = scan.nextInt();
	 System.out.println("your number / 5 = " + num/5);
		    }
	 public static void ex3() {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter a 2 number: ");
	 int num = scan.nextInt();
	 int num2 = scan.nextInt();
	 System.out.println("the double of the 2 numbers is: "+num*num2);
			    }
	 public static void ex4() {
	 Scanner scan = new Scanner(System.in);
     System.out.print("enter a 2 number: ");
	 int num = scan.nextInt();
	 int num2 = scan.nextInt();
	 int num3 = scan.nextInt();
	 System.out.println("the sum of the 3 numbers is: "+num+num2+num3);
	 System.out.println("the average of the 3 numbers is: "+(num+num2+num3)/3);
				    }
	 public static void ex5() {
	 Scanner scan = new Scanner(System.in);
     System.out.print("enter the radios of the circle: ");
	 int r = scan.nextInt();
	 System.out.println("the area is: "+r*r*3.14+" and the scope is: "+r*2*3.14);
					    }
	 public static void ex6() {
	 Scanner scan = new Scanner(System.in);
     System.out.print("enter the 2 size of the triangle: ");
	 int A = scan.nextInt();
	 int B = scan.nextInt();
	 double C=(A^2+B^2);
     C = Math.sqrt(C);
	 System.out.println("The rest is: "+C);
	 }
	 public static int ex7() {
		    Scanner scan = new Scanner(System.in);
		    System.out.print("enter a word: ");
		    String word = scan.next();
		    char dig1 = word.charAt(0);
		    char dig2 = word.charAt(1);
		    char dig3 = word.charAt(2);
		    return (int)(dig3 + dig2 + dig1);
		}
	 public static void ex8() {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter numbers");
	        int num1 = scan.nextInt();
	        int num2 = scan.nextInt();
	        int num3 = scan.nextInt();
	        System.out.println(num1 + (num2 - 1) * num3);
	    }
	 public static void ex9() {
	        Scanner scan = new Scanner(System.in);
	        String word = scan.nextLine();
	        int num = word.length();
	        num=num*num;
	        System.out.println(num);
	    }
	 public static void ex10() {
	        Scanner scan = new Scanner(System.in);
	        String word1 = scan.nextLine();
	        String word2 = scan.nextLine();
	        int num1 = word1.length();
	        int num2 = word2.length();
	        if (num1>num2) {
	        	System.out.println("the biggest word is: "+word1);
	        }
	        else {
	        	System.out.println("the biggest word is: "+word2);
	        }
	    }
	 public static void ex11() {
	        Scanner scan = new Scanner(System.in);
	        String word = scan.nextLine();
	        int num = scan.nextInt();
	        int num2 = word.length();
	        if(num==num2) {
	        	System.out.println("they are equals");
	        }
	    }
	 public static void ex12() {
	        Random scan = new Random();
	        Random d = new Random();
	   	 	int num1 = d.nextInt (6)+1;
	   	 	int num2 = d.nextInt (6)+1;
	        if(num1==num2) {
	        	System.out.println(true);
	        }
	    }
	  public static String ex13 (char char1 , String str4)
      {
          int index=str4.indexOf(char1);
          if (index>1)
              return ("true");
          else
              return ("false");
      }

    public static void main(String[] args) {

        }
    }
