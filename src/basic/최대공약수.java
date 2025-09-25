package basic;

import java.util.Scanner;

public class 최대공약수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1;
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                if (b % j == 0) {
                    c=j;
                }
            }

        }
        System.out.println(c);
    }
}
