import java.util.Scanner;

public class FirstJava01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Hay Mr." + name);
    }
}
