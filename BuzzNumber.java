import java.util.Scanner;

public class CURRENCY {
  public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the ammount");
        int ammount =sc.nextInt();


        int notes500notes = ammount/500;
        ammount = ammount % 500;

        int notes200notes = ammount/200;
        ammount = ammount % 200;

        int notes100notes = ammount/100;
        ammount = ammount % 100;

        int notes50notes  = ammount/50;
        ammount = ammount % 50;

        int notes20notes = ammount/20;
        ammount = ammount % 20;

        int notes10notes = ammount/10;
        ammount = ammount % 10;

        System.out.println("500s ; " +notes500notes);
        System.out.println("200s ; " +notes200notes);
        System.out.println("100s ; " +notes100notes);
        System.out.println("50s ; " +notes50notes);
        System.out.println("20s ; " +notes20notes);
        System.out.println("10s ; " +notes10notes);

        if (ammount > 0){
            System.out.println("remaning ammount :" +ammount);
        }

        sc.close();
    }  
}
