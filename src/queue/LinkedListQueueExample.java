package queue;

class Node{// new Node()  data|next
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}//Node
class LinkedListQueue{
    private Node front;//삭제
    private Node rear;//삽입
    public LinkedListQueue() {
        front = null;
        rear = null;
    }
    public void enqueue(int value) {//삽입
        Node newNode = new Node(value);
        if (rear == null) {// Queue가 비어 있으면...
            front=rear = newNode;//비어있는 상태에서 newNode가 만들어 진다면 front==rear 같은 곳을 가르친다
            return;
        }
        rear.next = newNode;// 기존에 node를 가지고 있다
        rear=newNode;

    }
    public int dequeue() {//삭제
        if(front==null) {
            System.out.println("queue is empty");
            return -1;
        }
        int value=front.data;
        front = front.next;//front를 다음 노드로 변경
        if(front==null){
            rear=null;
        }
        return value;
    }
    // isEmpty 연산
    public boolean isEmpty() {
        return front == null;
    }
    public int peek(){
        if(front==null) {
            System.out.println("queue is empty");
            return -1;
        }
        return front.data;
    }

}
public class LinkedListQueueExample {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(20);
        System.out.println("peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue()); // 출력: 5
        System.out.println("Peek: " + queue.peek()); // 출력: 15

        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        System.out.println("Dequeue on empty queue: " + queue.dequeue()); // 큐 비었을 때



    }
}