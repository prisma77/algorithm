package multirow;

public class MultiRowCrud {
    int [][]m=new int [2][3];//
    int row=0,col=-1;//현재위치의 row와 col을 초기화
    public void add(int data) {
        //isFull 공간체크
        //col 열 공간이 있으면
        if(isFull()) {
            increment();//공간을 늘려주는
        }
        if(col<m[0].length-1) {
            col++;
        }else {//열이 가득차 있다
            col=0;
            row++;
        }
        m[row][col]=data;

    }
    public void increment() {
        int [][]imsi=new int[m.length+2][3];
        System.arraycopy(m, 0, imsi, 0, m.length);
        m=imsi;

    }
    public void delete(int data) {
        //Search는 해당 data에 행열 index 반환
        int []rs=search(data);
        if(rs==null)return;//데이터가 없으면 돌아가세요..
        for (int i = rs[0]; i < m.length; i++) {//삭제할 데이터의 행 반복
            for (int j = rs[1]; j < m[i].length; j++) {//삭제할 데이터의 열 반복

                if(i==m.length-1&&j==m[i].length-1) {//마지막 위치를 0으로 설정
                    m[i][j]=0;
                    break;
                }
                //현재 행의 마지막 위치인 경우 (그행의 열이 마지막 열인가)
                if(j==m[i].length-1) {
                    m[i][j]=m[i+1][0];//현재위치에 다음행의 첫번째 값 대입
                    rs[1]=0;//다음 열로 이동
                }//if
                else {
                    m[i][j]=m[i][j+1];
                }//else

            }//for
        }//for


        //데이터 삭제후
        if(col==0) {
            row--;
            col=m[0].length-1;
        }else {
            col--;//열감소
        }

    }
    public boolean isEmpty() {
        return row==0&& col==-1;
    }
    //행과열의 끝인가?
    public boolean isFull() {
        return row==m.length-1&& col==m[0].length-1;
    }
    public void disp() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j]==0)continue;
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public int[] search(int data) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j]==data) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
    public void modify(int orgin,int change) {
        int []rs=search(orgin);
        if(rs==null)return;//데이터를 못찾으면 return
        System.out.println(rs[0]);
        System.out.println(rs[1]);
        m[rs[0]][rs[1]]=change;
    }
    public static void main(String[] args) {
        MultiRowCrud crud=new MultiRowCrud();
        crud.add(10);
        crud.add(20);
        crud.add(30);
        crud.add(40);
        crud.add(50);
        crud.add(60);

        crud.disp();
        crud.delete(50);
        crud.disp();
    }

}
