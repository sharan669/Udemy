import java.util.PriorityQueue;

public class PriorityQueue1 {

    public void priorityQueue(){

        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(429);

      /*  System.out.println("Peek" + pq.peek());

        System.out.println(pq.remove());

        System.out.println("Peek  " + pq.peek());

        System.out.println(pq.poll());

        System.out.println("Peek" + pq.peek()); */

        System.out.println(pq.remove(54));

        Object[] ints = pq.toArray();
        for(Object num: ints){
            System.out.println(num);
        }




    }
}
