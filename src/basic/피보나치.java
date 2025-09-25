package basic;

import java.util.Scanner;

public class 피보나치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int q = 0, w = 1;

        if (a>=0) {
            switch (a) {
                case 0:
                    System.out.println(q);
                    break;
                case 1:
                    System.out.println(q+","+w);
                    break;
                default:
                    System.out.print(q+","+w);
                    for (int i = 2; i < a; i++) {
                        int b = q + w;
                        System.out.print(","+b);
                        q = w;
                        w = b;
                    }
            }
        }else System.out.println("0이상의 항을 입력해라");

    }
}
