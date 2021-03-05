package Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Menu menu = new Menu();
            menu.showMenu();
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();
            if(i==5){
                break;
            }

            Calculator calculator = new Calculator();

            switch (i) {
                case 1:
                    System.out.print("Enter value of x\n");
                    double d = s.nextDouble();
                    System.out.println("Answer is " + calculator.calculateRoot(d));
                    break;
                case 2:
                    System.out.print("Enter value of x\n");
                    int d1 = s.nextInt();
                    System.out.println("Answer is " + calculator.calculateFactorial(d1));
                    break;
                case 3:
                    System.out.print("Enter value of x\n");
                    double d2 = s.nextDouble();
                    System.out.println("Answer is " + calculator.calculateLog(d2));
                    break;
                case 4:
                    System.out.print("Enter value of x\n");
                    double x = s.nextDouble();
                    System.out.print("Enter value of b\n");
                    double b = s.nextDouble();
                    System.out.println("Answer is " + calculator.calculatePower(x,b));
                    break;

                default:
                    System.out.print("kuch bhi\n");

            }
        }

    }
}
