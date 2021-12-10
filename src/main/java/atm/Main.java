package atm;

import java.util.Scanner;

public class Main {

    private static Scanner new_scan = new Scanner(System.in);

    public static void main(String[] arg){

        int amount = new_scan.nextInt();
        System.out.println(amount);
        ATM atm = new ATM();
        System.out.println(atm);
        System.out.println(atm.process(amount));

    }
}
