import java.util.Queue;

public class QueueImplementation {

public void queueImplementaion(){

    ArrayQueue queue = new ArrayQueue(2);

    Employee jane = (new Employee("Queue:Jane","Jones ",123));
    Employee sharan = (new Employee("Queue:Sharan","Surendra",546));
    Employee shreya = (new Employee("Queue:Shreya","Sure",693));
    Employee sure = (new Employee("Queue:Sure","sda", 968));

    queue.push_back(jane);
    queue.push_back(sharan);

    queue.printQueue();

    System.out.println("The size "  + queue.size());

    System.out.println ("Queue Empty "+ queue.isEmpty());

    System.out.println ("Peek "+ queue.peek());


    queue.removeFromFront();

    queue.printQueue();

    queue.removeFromFront();

    System.out.println("The size "  + queue.size());

    System.out.println ("Queue Empty "+ queue.isEmpty());

    queue.push_back(sure);
    queue.printQueue();


}
}
