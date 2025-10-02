package multirow;

import java.util.Arrays;
import java.util.Iterator;

public class FourWaySearch { // 클래스 이름을 FourWaySearch로 변경
    public static void main(String[] args) {
        // 델타 배열 정의: 상하좌우 이동을 위한 행과 열의 변화값을 저장
        int[][] deltas = {
                { -1, 0 },  // 상: 행 -1, 열 변화 없음
                { 1, 0 },   // 하: 행 +1, 열 변화 없음
                { 0, -1 },  // 좌: 행 변화 없음, 열 -1
                { 0, 1 }    // 우: 행 변화 없음, 열 +1
        };

        // 4x4 문자형 이차원 배열 grid 정의
        char[][] grid = {
                { '2', '3', '1', '4' },
                { '1', 'X', '3', '2' },
                { '3', '4', 'X', 'X' },
                { 'X', '4', '1', '5' }
        };

        int sum = 0; // 합계를 저장할 변수 sum 초기화

        for(char c[]:grid) {
            System.out.println(Arrays.toString(c));
        }
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if(grid[r][c]=='X') {
                    for(int d=0;d<deltas.length;d++) {
                        int nr=r+deltas[d][0];//nr=0  // r=1,dsr=-1,
                        int nc=c+deltas[d][1];//nc=1  // c=1,dsc=0
                        //행과 열의 유효범위과 맞고 grid값이 X가 아니면....
                        if(nr>=0 && nr<grid.length && nc>=0 &&
                                nc<grid.length&& grid[nr][nc]!='X') {
                            sum+=grid[nr][nc]-'0';// 문자 0의 ascii값은 48입니다
                            grid[nr][nc]='0';//
                        }

                    }
                }
            }
        }//for
        System.out.println("---------------------------------------------");
        for(char c[]:grid) {
            System.out.println(Arrays.toString(c));
        }

        //System.out.println(grid[0][0]+9-48);
        // 최종 합계를 출력
        System.out.println(sum); // 합계 출력
    }
}
