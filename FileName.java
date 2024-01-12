import java.util.Scanner;

public class FileName {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String fileName = scanner.nextLine();

       
        int count = 0;  // Count of consecutive 'x' characters
        int removals = 0;  // Number of characters to be removed

       
        for (char c : fileName.toCharArray()) {
            if (c == 'x') {
                count++;
                if (count >= 3) {
                    removals++;
                }
            } else {
                count = 0;  // Reset the count when a non-'x' character is encountered
            }
        }

        // Print the result
        System.out.println(removals);

        // Close the scanner
        scanner.close();
    }
}

