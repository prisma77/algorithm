package structures;

import java.util.Scanner;

public class 최대소배열 {

    public static int maxHeight(int []h) {
        int max = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] > max) {
                max = h[i];
            }
        }
        return max;
    }

    public static int minHeight(int []h) {
        int min = h[0];
        for (int i = 1; i < h.length; i++) {
            if (h[i] < min) {
                min = h[i];
            }
        }
        return min;
    }

    public static double avgHeight(int []h) {
        int avg = 0;
        for (int i = 0; i < h.length; i++) {
            avg = avg + h[i];
        }
        avg = avg/h.length;
        return avg;
    }

    public static int avgCount(int[] h) {
        float avg = 0;
        int high = 0;
        for (int i = 0; i < h.length; i++) {
            avg = avg + h[i];
        }
        avg = avg/h.length;
        for (int i = 0; i < h.length; i++) {
            if (h[i]>avg) {
                high++;
            }
        }
        return high;
    }

    public static int createArray(int []h) {
        float avg = 0;
        int high = 0;
        for (int i = 0; i < h.length; i++) {
            avg = avg + h[i];
        }
        avg = avg/h.length;
        for (int i = 0; i < h.length; i++) {
            if (h[i]<avg) {
                high++;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("사람수: ");
        int num = sc.nextInt();
        int[] h =new int[num];//[][][][][]
        int a=1;
        for(int i=0;i<num;i++){
            System.out.print(a+"번째: ");
            h[i]=sc.nextInt();
            a++;
        }
        boolean run = true;

        while (run) {
            System.out.println("1:max  2:min  3:avg  4:high  5:low  6:종료");
            int state=sc.nextInt();
            switch (state){
                case 1:
                    System.out.println("최댓값은: "+maxHeight(h));
                    break;
                case 2:
                    System.out.println("최솟값은: "+minHeight(h));
                    break;
                case 3:
                    System.out.println("평균은: "+avgHeight(h));
                    break;
                case 4:
                    System.out.println("평균은 "+avgHeight(h)+"이고 이보다 큰 사람의 수는: "+avgCount(h));
                    break;
                case  5:
                    System.out.println("평균은 "+avgHeight(h)+"이고 이보다 작은 사람의 수는: "+createArray(h));
                    break;
                case  6:
                    System.out.println("종료");
                    run=false;
                    break;
                default:
                    System.out.println("☝️🤓");
                    break;
            }
        }
    }
}
