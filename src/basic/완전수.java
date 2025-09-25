package basic;

import java.util.Scanner;

public class 완전수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int sum= 0;

        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                sum = sum + j;
            }
        }
        sum=sum+1;
        if (a == sum) {
            System.out.println(a+"은(는) 완전수");
        }
    }
}
