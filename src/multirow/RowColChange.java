package multirow;

public class RowColChange {
    public void init(int [][]data){
        int cnt = 0; // 초기화에 사용할 카운터 변수
        // 배열의 각 행에 대해 반복
        for (int i = 0; i < data.length; i++) {//행의갯수
            // 현재 행의 각 열에 대해 반복
            for (int j = 0; j < data[i].length; j++) {//열의갯수
                // 배열에 카운터 값을 증가시키며 할당
                data[i][j] = ++cnt;
            }
        }

    }
    public void disp(int [][]data){
        // 배열의 각 행에 대해 반복
        for (int i = 0; i < data.length; i++) {
            // 현재 행의 각 열에 대해 반복
            for (int j = 0; j < data[i].length; j++) {
                // 각 요소를 5칸을 사용하여 오른쪽 정렬 형태로 출력
                System.out.printf("%5d", data[i][j]);
            }
            System.out.println();
        }
        // 배열 출력이 끝나면 줄바꿈 추가
        System.out.println();

    }
    //aa가 4행 3열을 bb(3행,4열)에 넣어주세요
    public void change(int [][]aa,int [][]bb){
        int h=0,y=0;//행 열 초기화
        for (int i = 0; i < bb.length; i++) {//행
            for (int j = 0; j < bb[i].length; j++) {//열
                bb[i][j] =aa[h][y];
                if(y<aa[i].length-1){
                    y++;
                }else{
                    y=0;
                    h++;
                }
            }
        }


    }
    public static void main(String[] args) {
        final int ROW=4;
        final int COL=3;
        int [][]aa=new int[ROW][COL];//4행3열
        int [][]bb=new int [COL][ROW];//3행4열
        RowColChange rowColChange=new RowColChange();
        rowColChange.init(aa);
        rowColChange.disp(aa);
        rowColChange.change(aa,bb);
        rowColChange.disp(bb);

    }
}