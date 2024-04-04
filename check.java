import java.util.Scanner;
public class check {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter The Alphabet to check: ");
        char ask = sc.next().charAt(0);


        if (ask =='a'|| ask =='e'|| ask =='i'|| ask =='o'|| ask=='u'|| ask=='A'|| ask=='E'|| ask=='I'|| ask=='O'|| ask=='U')
            System.out.println("It is Vowel");
        else{
            System.out.println("It is Cosonant");
        }
    }

}
