import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        boolean hooh = true;
        while(hooh){
            try{
                System.out.print("Njaluk: ");
                int angka = scanf.nextInt();
                hooh = false;
            }
            catch(InputMismatchException e){
                System.out.println("Mohon inputkan data yang valid: ");
            }
        }
    scanf.close();
    }
}
