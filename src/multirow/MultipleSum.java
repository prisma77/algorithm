package multirow;

import java.util.Scanner;

public class MultipleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N 입력: ");
        int N = sc.nextInt();

        int sum = 0;
        StringBuilder expression = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                if (expression.length() > 0) {
                    expression.append(" + ");
                }
                expression.append(i);
            }
        }

        System.out.println(expression.toString() + " = " + sum);
    }
}