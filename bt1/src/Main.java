import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static ClassNameExample classNameExample = new ClassNameExample();
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên lớp ");
        String name = scanner.nextLine();
        boolean isvalid = classNameExample.validate(name);
        System.out.println("tên lớp " + name + " is valid: " + isvalid);
    }
}