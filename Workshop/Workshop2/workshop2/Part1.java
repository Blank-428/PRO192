package workshop2;
import java.util.Scanner;
public class Part1 {
    public static void main(String[] args) {
        boolean cont = false;
        int num;
        do {
            try {
                System.out.println("Enter the number: ");
                Scanner sc = new Scanner(System.in);
                num = sc.nextInt();
                if (num < 1) {
                    throw new Exception();
                }
                System.out.println("The number is " + num);
                cont = false;
            } catch (Exception ex) {
                System.out.println("The number is invalid");
                cont = true;
            }
        } while (cont);
    }
}