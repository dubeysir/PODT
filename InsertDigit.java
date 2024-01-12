import java.util.Scanner;

public class InsertDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int d = scanner.nextInt();
            String s = scanner.next();

            StringBuilder ans = new StringBuilder();
            int f = 0;

            for (int i = 0; i < n; ++i) {
                if (f != 0) {
                    ans.append(s.charAt(i));
                } else {
                    if (Character.getNumericValue(s.charAt(i)) < d) {
                        ans.append(d).append(s.charAt(i));
                        f = 1;
                    } else {
                        ans.append(s.charAt(i));
                    }
                }
            }

            if (f == 0) {
                ans.append(d);
            }
            System.out.println(ans.toString());
        }
    }
}
