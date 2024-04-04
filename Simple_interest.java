import java.util.Scanner;
public class Simple_interest {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Principle amount: ");
    double p=sc.nextDouble();

    System.out.println("Enter The Time: ");
    double t=sc.nextDouble();

    System.out.println("Enter The Rate: ");
    double r=sc.nextDouble();

    double si=(p*t*r)/100;
        System.out.println(si+"is Simple interest");
    }

}
