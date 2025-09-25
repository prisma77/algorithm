package basic;

import java.util.Scanner;

public class 뒤집개 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int n = sc.nextInt();//1234
        int reversed = 0;
        while(n!=0) {//1
            int digit=n%10;//12%10  (1)
            reversed=reversed*10+digit;//4321
            n/=10;
        }//while

        System.out.println("reversed="+reversed);
    }
}
