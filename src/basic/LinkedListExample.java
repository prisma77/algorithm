package basic;

class Node {
    int data; // 노드의 데이터
    Node next; // 다음 노드를 가리키는 포인터

    // 생성자
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    private Node head; // 연결 리스트의 첫 번째 노드(Head)

    // 생성자
    public LinkedList1() {
        this.head = null; // 초기에는 리스트가 비어 있음
    }

    // 리스트의 끝에 요소 추가
    public void add(int data) {
        Node newNode = new Node(data); // 새로운 노드 생성
        if (head == null) { // 리스트가 비어 있는 경우
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) { // 마지막 노드로 이동
                current = current.next;
            }
            current.next = newNode; // 마지막 노드에 새 노드 연결
        }
    }

    // 특정 위치에 요소 추가
    public void addAt(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) { // 첫 번째 위치에 추가
            newNode.next = head;
            head = newNode;
            //[newNode(data)] -> [head의 기존 노드] -> ...
            //head = newNode

        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {//(current를 인덱스 이전 노드까지 이동)
                if (current == null) {
                    throw new IndexOutOfBoundsException("Index out of range");
                }
                //head -> [노드1] -> [노드2] -> [노드3] -> null
                //current = head
                //한 단계 진행 시:
                //head -> [노드1] -> [노드2] -> [노드3] -> null
                //current
                //최종적으로 인덱스 전 위치 노드로 이동
                //head -> [노드1] -> [노드2] -> [노드3] -> null
                //current

                current = current.next;
            }
            //새 노드를 현재 위치에 연결
            newNode.next = current.next;
            //현재 노드의 다음 포인터 변경
            current.next = newNode;
        }
    }

    // 요소 삭제
    public void remove(int data) {
        if (head == null) { // 리스트가 비어 있는 경우
            System.out.println("List is empty");
            return;
        }
        // 삭제할 데이터가 첫 번째 노드에 있는 경우, 헤드를 다음 노드로 이동
        if (head.data == data) {
            head = head.next;
            return;
        }

        // 다음 노드가 삭제 대상인지 확인하며 리스트를 순회
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        // 다음 노드가 null이면 데이터가 없음을 알림
        if (current.next == null) {
            System.out.println("Element not found");
        } else {
            // 삭제 대상 노드를 건너뛰어 연결 갱신
            current.next = current.next.next; // 요소 제거
        }
    }

    // 특정 인덱스의 요소 가져오기
    public int get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of range");
            }
            current = current.next;
        }
        return current.data;
    }

    // 리스트 출력
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        // 요소 추가
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // 출력: 10 20 30

        // 특정 위치에 요소 추가
        list.addAt(1, 15);
        list.display(); // 출력: 10 15 20 30

        // 요소 삭제
        list.remove(20);
        list.display(); // 출력: 10 15 30

        // 특정 인덱스의 요소 가져오기
        System.out.println("Element at index 1: " + list.get(1)); // 출력: 15
    }
}

