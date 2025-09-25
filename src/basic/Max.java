package basic;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("write a: ");
        int a = sc.nextInt();
        System.out.print("write b: ");
        int b = sc.nextInt();
        System.out.print("write c: ");
        int c = sc.nextInt();

        System.out.print("basic.Max: ");
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }
        else {
            if (b > c) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }
    }
    //메인 브랜치 주석
    //1번 브랜치 수정
}
