import java.util.Scanner;

public class twoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (1 <= t && t <= 100) {
            for (int i = 0; i < t; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                int ans = 0;
                if (1 <= a && a <= Math.pow(10, 9) && 1 <= b && b <= Math.pow(10, 9) && 1 <= n
                        && n <= Math.pow(10, 9)) {
                    if (n % 2 == 1) {
                        ans = Math.max(2 * a, b) / Math.min(2 * a, b);
                    } else {
                        ans = Math.max(a, b) / Math.min(a, b);
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
