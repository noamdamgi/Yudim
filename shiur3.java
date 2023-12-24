import java.util.Scanner;
public class Yudim {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	// 1
	System.out.println("exercise1");
	System.out.println("enter a number");
    int num=scan.nextInt();
    if (num>=0) 
    	System.out.println("the number is positive");
    else
        	System.out.println("the number is negative");
    
    // 2
	System.out.println("exercise2");
    System.out.println("enter 2 numbers");
    int num2=scan.nextInt();
    int num3=scan.nextInt();
    if (num2>num3)
    	System.out.println("the biggest number is: "+num2);
    else
    	System.out.println("the biggest number is: "+num3);
    
    // 3
	System.out.println("exercise3");
	System.out.println("Enter the 1 rider's initial:");
    char initial1 = scan.next().charAt(0);
    System.out.println("Enter the distance traveled by the 1 rider:");
    double distance1 = scan.nextDouble();
    System.out.println("Enter the speed of the 1 rider:");
    double speed1 = scan.nextDouble();
    System.out.println("Enter the 2 rider's initial:");
    char initial2 = scan.next().charAt(0);
    System.out.println("Enter the distance traveled by the 2 rider:");
    double distance2 = scan.nextDouble();
    System.out.println("Enter the speed of the 2 rider:");
    double speed2 = scan.nextDouble();
    double time1 = distance1 / speed1;
    double time2 = distance2 / speed2;
    char firstRider = (time1 < time2) ? initial1 : initial2;
    System.out.println("The rider who arrived first is: " + firstRider);
    
	// 4
	System.out.println("exercise4");
	System.out.println("enter 3 scores");
	 int score=scan.nextInt();
	 int score2=scan.nextInt();
	 int score3=scan.nextInt();
	 int average=(score+score2+score3)/3;
	 System.out.println("the average is: "+average);
	 
	 // 5
	 System.out.println("exercise5");
	 System.out.println("enter 3 numbers: ");
	 int num4=scan.nextInt();
	 int num6=scan.nextInt();
	 int num5=scan.nextInt();
	 if (num4>num5)
		 if (num4>num6)
			 System.out.println("the biggest number is: "+ num4);
	 if (num5>num4)
		 if (num5>num6)
			 System.out.println("the biggest number is: "+ num5);
	 if (num6>num5)
		 if (num6>num4)
			 System.out.println("the biggest number is: "+ num6);
	 
	 //7
	 System.out.println("exercise7");
	 System.out.println("Enter the first term:");
     int firstTerm = scan.nextInt();
     System.out.println("Enter the difference:");
     int commonDifference = scan.nextInt();
     int fifth_term = firstTerm + 4 * commonDifference;
     int tenth_term = firstTerm + 9 * commonDifference;
     System.out.println("The fifth term of the arithmetic sequence is: " + fifth_term);
     System.out.println("The tenth term of the arithmetic sequence is: " + tenth_term);
     
     //8
     System.out.println("exercise8");
     
     //9
     System.out.println("exercise9");
     System.out.println("Enter your first name and last name:");
     String name = scan.nextLine();
     System.out.println("Enter your school:");
     int subjects = scan.nextInt();
     System.out.println("Enter the name of your school:");
     String school = scan.nextLine();
     System.out.println("My name is: " + name );
     System.out.println("My school is: " + school);
     System.out.println("The number of subjects I study is: " + subjects);
     
     //10
     System.out.println("exercise10");
     System.out.println("Enter a three-digit number:");
     int number = scan.nextInt();
     int digit1 = number % 10;
     int digit2 = (number / 10) % 10;
     int digit3 = number / 100;
     int sum = digit1 + digit2 + digit3;
     System.out.println("The sum of the digits is: " + sum);


	}
	}
