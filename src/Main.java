import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int enteredOtp = 0;
        int otp;

        otp = random.nextInt(1000, 9999);


        System.out.println("ENTER THE OTP: ");
        enteredOtp = scanner.nextInt();


        if (enteredOtp == otp) {
            System.out.println("THE OTP IS VERIFIED!");
        } else {
            System.out.println("THE OTP IS NOT VERIFIED!");
            System.out.printf("THE GENERATED OTP IS %d\n" ,otp);
        }

        scanner.close();


    }
}
