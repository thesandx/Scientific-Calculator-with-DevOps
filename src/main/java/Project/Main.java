package Project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(Main.class);
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
                    logger.info("Root calculation initiated"); //others are error/warn/fatal
                    System.out.print("Enter value of x\n");
                    double d = s.nextDouble();
                    logger.info("value entered for root calculation is "+d);
                    System.out.println();
                    String ans  = calculator.calculateRoot(d);
                    logger.info("answer is  "+ans);
                    System.out.println("Answer is " + ans);
                    System.out.println();
                    break;
                case 2:
                    logger.info("factorial calculation initiated");
                    System.out.print("Enter value of x\n");
                    int d1 = s.nextInt();
                    logger.info("value entered for factorial calculation is "+d1);
                    System.out.println();
                    String ans1  = calculator.calculateFactorial(d1);
                    logger.info("answer is  "+ans1);
                    System.out.println("Answer is " + ans1);
                    System.out.println();
                    break;
                case 3:
                    logger.info("Log calculation initiated");
                    System.out.print("Enter value of x\n");
                    double d2 = s.nextDouble();
                    logger.info("value entered for log calculation is "+d2);
                    System.out.println();
                    String ans2 = calculator.calculateLog(d2);
                    logger.info("answer is  "+ans2);
                    System.out.println("Answer is " + ans2);
                    System.out.println();
                    break;
                case 4:
                    logger.info("Power calculation initiated");
                    System.out.print("Enter value of x\n");
                    double x = s.nextDouble();
                    System.out.println();
                    System.out.print("Enter value of b\n");
                    double b = s.nextDouble();
                    logger.info("value entered for power calculation is "+x+" and "+b);
                    System.out.println();
                    String ans3 = calculator.calculatePower(x,b);
                    logger.info("answer is  "+ans3);
                    System.out.println("Answer is " + calculator.calculatePower(x,b));
                    System.out.println();
                    break;

                default:
                    System.out.print("Invalid choice\n");
                    logger.error("Invalid choice entered");

            }
        }

    }
}
