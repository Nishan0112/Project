import java.util.Scanner;
public class Conversion {
    public static void main(String[]args){

        System.out.println("1. Nepali RupeesTo Other Currency");
        System.out.println("2. Other Currency to Nepali Rupees\n");

        System.out.println("Enter The Choice");
        Scanner sc = new Scanner(System.in);
        int sc1 =sc.nextInt();

        switch (sc1) {
            case 1:
                Nep_to_Other(sc);
                break;

            case 2:
                Other_to_Nep(sc);
                break;

            default:
                System.out.println("Invalid Choice '_' ");

        }

}

public static void Nep_to_Other(Scanner sc){
        System.out.println("Enter the Amount of Rupees");
        double rupees=sc.nextDouble();
        double amt;

        System.out.println("1.TO US Dollor");
        System.out.println("2.TO Pound ");
        System.out.println("3.TO Yen");
        System.out.println("4.TO Yuan");
        System.out.println("5.TO Indian Currency\n");

        int ntosc = sc.nextInt();


        switch (ntosc) {
            case 1:
                amt=rupees/133.4097;
                System.out.println("Nepali Rs To US Doller is "+amt);
                break;

            case 2:
                amt=rupees/168.5217;
                System.out.println("Nepali Rs To Pound is "+amt);
                break;

            case 3:
                amt=rupees/0.88;
                System.out.println("Nepali Rs To Yen is "+amt);
                break;

            case 4:
                amt=rupees/18.44;
                System.out.println("Nepali Rs To Yuan is "+amt);
                break;

            case 5:
                amt=rupees/1.6;
                System.out.println("Nepali Rs To Indian Currency is "+amt);
                break;

            default:
                System.out.println("Invalid Choice '_' ");
        }


    }

    public static void Other_to_Nep(Scanner sc){
        double amt;

        System.out.println("1.From US Dollor");
        System.out.println("2.From Pound ");
        System.out.println("3.From Yen");
        System.out.println("4.From Yuan");
        System.out.println("5.From Indian Currency\n");

        System.out.println("Enter the CURRENCY to convert into Nepali Rupees");
        int ntosc = sc.nextInt();

        System.out.println("Enter the amount to convert into Nepali Rupees");
        double currency = sc.nextDouble();

        switch (ntosc){
            case 1:
                amt=currency*133.4097;
                System.out.println(" US Doller To Nepali Rs is "+amt);
                break;

            case 2:
                amt=currency*168.5217;
                System.out.println(" Pound To Nepali Rs is "+amt);
                break;

            case 3:
                amt=currency*0.88;
                System.out.println(" Yen To Nepali Rs is "+amt);
                break;

            case 4:
                amt=currency*18.44;
                System.out.println(" Yuan To Nepali Rs is "+amt);
                break;

            case 5:
                amt=currency*1.6;
                System.out.println(" Indian Currency To Nepali Rs is "+amt);
                break;

            default:
                System.out.println("Invalid Choice '_' ");

        }
    }
}
