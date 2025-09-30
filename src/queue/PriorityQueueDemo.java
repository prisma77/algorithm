package queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // 1. 우선순위 큐 생성 (기본: 최소 힙)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        System.out.println("== PriorityQueue (최소 힙) 기능 테스트 ==");

        // 2. 요소 삽입
        System.out.println("\n[요소 삽입]");//50 -> 10 -> 30 -> 20-> 40
        minHeap.add(50);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(40);
        System.out.println("큐 상태 (삽입 후): " + minHeap);
        // 3. 가장 작은 값 조회 (peek)
        System.out.println("\n[가장 작은 값 조회]");
        System.out.println("현재 최솟값 (peek): " + minHeap.peek());//10


        // 4. 가장 작은 값 제거 (poll)
        System.out.println("\n[가장 작은 값 제거]");
        System.out.println("제거된 값 (poll): " + minHeap.poll());
        System.out.println("큐 상태 (제거 후): " + minHeap);

        // 5. 요소 제거 (remove)
        System.out.println("\n[특정 요소 제거]");
        minHeap.remove(30); // 값 30 제거
        System.out.println("큐 상태 (30 제거 후): " + minHeap);

        // 6. 큐 크기 확인
        System.out.println("\n[큐 크기 확인]");
        System.out.println("현재 큐 크기: " + minHeap.size());

        // 7. 큐가 비어있는지 확인
        System.out.println("\n[큐 비어있는지 확인]");
        System.out.println("큐가 비어있는가? " + minHeap.isEmpty());

        // 8. 큐의 모든 요소 제거
        System.out.println("\n[큐의 모든 요소 제거]");
        minHeap.clear();
        System.out.println("큐 상태 (모두 제거 후): " + minHeap);
        System.out.println("큐가 비어있는가? " + minHeap.isEmpty());



    }
}