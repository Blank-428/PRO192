
package workshop2;
import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        boolean cont = false;
        String st, pattern;
        pattern = "SE(.*)";
        do {
            try {
                System.out.println("Input the string 1: ");
                Scanner sc = new Scanner(System.in);
                st = sc.nextLine();
                if (!(st.matches(pattern))) {
                    throw new Exception();
                }
                System.out.println("the string is " + st);
                cont = false;
            } catch (Exception e) {
                System.out.println("the string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
