package basic;

public class ArrayQueue {
    private int []queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;
    public ArrayQueue() {
        super();
    }
    public ArrayQueue(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if(isFull()){
            System.out.println("full");
            return;
        }
        queue[++rear] = item;
        count++;
    }

    public int dequeue() {
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        int item = queue[front++];
        count--;
        return item;
    }

    boolean isFull() {
        return count == capacity || (rear==capacity);
    }

    boolean isEmpty() {
        return count == 0 || (front==0&&rear==-1);
    }

    public void display() {
        if(isEmpty()){
            System.out.println("empty");
        }else {
            int i = front;
            for(int c=0;c<count;c++){
                System.out.print(queue[i]+" ");
                i=(i+1)%capacity;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}
