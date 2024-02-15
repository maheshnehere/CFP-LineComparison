import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 Co-ordinate = ");
        double x1 = sc.nextDouble();
        System.out.println("Enter x2 Co-ordinate = ");
        double x2 = sc.nextDouble();
        System.out.println("Enter y1 Co-ordinate = ");
        double y1 = sc.nextDouble();
        System.out.println("Enter y2 Co-ordinate = ");
        double y2 = sc.nextDouble();

        // double length = Math.sqrt((x2 - x1)*(x2-x1) + (y2 - y1)*(y2-y1));
        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length of a Line = " + length1);
    }
    }

