package line_comparison;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class LineComparison {
    static Logger logger = Logger.getLogger(LineComparison.class);
    public static void main(String [] args){
        BasicConfigurator.configure();
//        creating default constructor object
        LineComparison line = new LineComparison();
        logger.info("welcome to Line Comparison Computation on Master branch  ");
        logger.info("what you want to check equal or compare to enter choice 1 0r 2");

        Scanner sc1 = new Scanner(System.in);
        int choice = sc1.nextInt();

        switch (choice){
            case 1:
                logger.info("you have selected for equals");
                line.equals();
                break;
            case 2:
                logger.info("you have selected for compare to");
                line.compare_To();
                break;
            default:logger.info("enter valid choice ");
        }

  }

     double length_finder(){
        Scanner sc = new Scanner(System.in);
        logger.info("enter the x1");
        double x1 = sc.nextDouble();
        logger.info("enter y1");
        double y1 = sc.nextDouble();
        logger.info("enter the x2");
        double x2 = sc.nextDouble();
        logger.info("enter y2");
        double y2 = sc.nextDouble();
        double z1=x1-x2;
        double z2=y1-y2;
        double length = Math.sqrt(Math.pow(z1,2)+Math.pow(z2,2));
        logger.info("length of line = "+length);
        return length;
    }

    void equals(){
        String l1 = String.valueOf(length_finder());
         String l2 = String.valueOf(length_finder());
        logger.info("length of both the string are equals or not if equal(true) if not (false) will be printed = "+l1.equals(l2));
    }

    void  compare_To(){
        String l1 = String.valueOf(length_finder());
        String l2 = String.valueOf(length_finder());
        logger.info("length of both the string are equals or not if equal(0) if not (1) will be printed = "+(l1.compareTo(l2 )));


    }

}
