import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int rows = sc.nextInt();

        // printing pattern through printFloydTriangle() method of FloydTriangle class
        FloydTriangle.printFloydTriangle(rows);

        // closing resource
        sc.close();
    }
}