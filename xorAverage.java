import java.util.Scanner;

public class xorAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = sc.nextInt();
        while (tt-- > 0) {
            // Knockcat
            int n = sc.nextInt();
            int ok = 1, two = 2;
            if (n == 1) {
                System.out.println(1);
            } else if ((n & 1) == 1) {
                for (int i = 0; i < n; ++i) {
                    System.out.print(ok + " ");
                }
                System.out.println();
            } else if ((n & 1) == 0) {
                for (int i = 0; i < n - 1; ++i) {
                    System.out.print(two + " ");
                }
                System.out.println(two - 1);
            }
        }
    }
}