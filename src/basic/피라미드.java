package basic;

import java.util.Scanner;

public class 피라미드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int blank = a-1;

        for (int i = 1; i <= a; i++) {
            int b = i * 2 - 1;
            for (int j=1; j<=b; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
