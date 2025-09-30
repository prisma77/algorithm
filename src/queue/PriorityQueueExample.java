package queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(90);
        pq.add(4);
        pq.add(5);
        System.out.println("PriorityQueue contents:"+pq);

        while(!pq.isEmpty()){//절렬된 결과를 얻고자 하면... poll함수를 이용해서 꺼낸다
            System.out.println(pq.poll());
        }
        System.out.println("PriorityQueue contents:"+pq);



    }
}