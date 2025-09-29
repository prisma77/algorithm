package basic;

//연결리스트 ,add,disp,addAt
//LinkedList Node를 Data로 가지고 있다
public class LinkedList {
    private Node head;//기본은 null입니다

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        super();
    }
    public LinkedList(Node head) {
        super();
        this.head = head;
    }
    public void add(int data) {
        Node newNode=new Node(data);
        if(head==null) {//리스트가 비어있을때
            head=newNode;
        }else {//두번째 이상 노트가 추가될때..
            Node current=head;
            while(current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
        }
    }//add
    public void display() {
        //[HEAD(data(10)|next)]   [NODE (data(20)|next)]    [NODE(data(30)|next)]
        //1000주소                2000주소                   3000

        Node current=head;
//		System.out.println(current.data);//10
//		System.out.println(current.next.data);//20
//		System.out.println(current.next.next.data);//30
//		System.out.println(current.next.next.next.data);//40
        while(current!=null) {
            System.out.print(current.data+"\t");
            current=current.next;//연결리스트 순회
        }
        System.out.println();

    }
    public void addAt(int index,int data) {
        Node newNode=new Node(data);//새로운 노드
        if(index==0) {//첫번째 위치에 추가
            newNode.next=head;
            head=newNode;
        }
        else {//첫번째가 아닌 경우의 수
            //순회를 시작하면...
            Node current=head;
            for (int i = 0; i < index-1; i++) {
                if(current==null) {//
                    throw new IndexOutOfBoundsException();
                }//if
                current= current.next;//현재의 노드포인트에 다음노드의 포인터를 넣어준다...
            }//forEnd (순회)
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    //삭제
    public boolean isEmpty() {
        return head==null;
    }
    public void remove(int data) {
        //리스트 비어있는 경우 (head==null)
        //head=null head가 삭제되면 다음 노드가 head가 되도록 구현
        //연결리스를 순회하면서 삭제 작업
        if(isEmpty()) {
            System.out.println("List is Empty ");
            return;
        }
        if(head.data==data) {//head를 삭제
            head=head.next;
        }
        //다음 노드가 삭제 대상? 순회
        Node current=head;
        while(current.next!=null&& current.next.data!=data) {
            current=current.next;//순회가능
        }
        if(current.next==null) {
            System.out.println("Node Not Found~");
        }else {
            current.next=current.next.next;
        }

    }
    public int get(int index) {
        Node current=head;
        for (int i = 0; i < index; i++) {
            if(current==null) {
                throw new IndexOutOfBoundsException();
            }//if
            current=current.next;
        }//for
        return current.data;
    }
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
        list.addAt(1, 15);
        list.display();
        //System.out.println(list.get(1));


    }


}