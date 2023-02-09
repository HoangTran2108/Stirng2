import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static String nameExample = "^[CAP]([0-9]{4})*[GHIKLM]$";
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên lớp ");
        String name = scanner.nextLine();
        if(name.matches(nameExample)){
            System.out.print("Tên lớp hợp lệ");
        }
        else{
            System.out.print("Tên lớp không hợp lệ");
        }
    }
}