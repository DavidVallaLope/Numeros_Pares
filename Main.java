import java.util.Scanner;

public class Main {
    public final static Scanner in = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println(isEven(2));
    }

    public static boolean isEven(int num) {
        System.out.println("Divide the number by 2: ");
        while (in.nextInt() != num / 2) System.out.println("I dont believe you :/");
        System.out.println("Mmm, I don't remember... Was it decimal?\n1. Yes \t2. No");
        return (in.next().equals("Yes"));
    }
}
