package az.mycompany.javalessons.lesson5;

import java.util.Scanner;

public class DoWhileStm1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 0, j = 0, k = 0;
        String exit;

        do {
            System.out.print("ededi daxil edin :");
            int num = scn.nextInt();
            if (num > 0) i = i + 1;
            else if (num < 0) j = j + 1;
            else k = k + 1;
            System.out.print("Programdan ayrilmaq iseyirsiz mi? : (y/n)");
            exit = scn.next();

        } while (!(exit.equals("y")));
        System.out.println("Positive : " + i + "\n" + "Negative : " + j + "\n" + "zero : " + k);
    }
}






