package basic;

import java.util.Scanner;

public class 소수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean b = true;

        if (a>=1) {
            switch (a) {
                case 1:
                    System.out.print("1은 소수임");
                    break;
                case 2:
                    System.out.println("2는 소수임");
                    break;
                default:
                    for (int j = 2; j < a; j++) {
                        if (a % j == 0) {
                            System.out.println(j+"은(는) "+a+"의 약수임. "+a+ "은(는) 소수가 아님.");
                            b = false;
                        }

                    }
                    if (b = true) {
                        System.out.println(a+"은(는) 소수임");
                    }
            }
        }
        else System.out.println("자연수를 입력하시오");
    }
}
