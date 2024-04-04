import java.util.Scanner;
import java.util.*;

public class Reverse {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String ss = sc.nextLine();

        StringBuilder reversed = new StringBuilder(ss);
        reversed.reverse();

        System.out.println("The reversed string is " + reversed.toString());
    }
}
