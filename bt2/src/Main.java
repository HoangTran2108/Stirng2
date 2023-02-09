import java.util.Scanner;

public class Main {
    private static String PhoneNumber = "^([0-9]{2})-0([0-9]{9})$";
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại ");
        String name = scanner.nextLine();
        if(name.matches(PhoneNumber)){
            System.out.print("Số điện thoại hợp lệ");
        }
        else{
            System.out.print("Số điện thoại không hợp lệ");
        }
    }
}