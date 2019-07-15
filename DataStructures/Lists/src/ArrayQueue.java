import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue; //queue as an array
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity]; // similar to int[] a=new int[size];
    }

    public void push_back(Employee employee) {  //O(1) complexity
        if (back == queue.length) { //need to resize
            Employee[] tempArray = new Employee[2 * queue.length];  //create an array of double the length
            System.arraycopy(queue, 0, tempArray, 0, queue.length);  //copy the old queue to the new one
            //with double the length
            queue = tempArray; //copy the new array back to the queue
            tempArray = null;
        }
        queue[back++] = employee;

    }

    public Employee peek() { //O(1) complexity
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return queue[front];

    }


    public Employee removeFromFront() {  //O(1) Complexity
        if (isEmpty()) {
            throw new NoSuchElementException();//The caller needs to handle it
            // no element in stack to pop
        }
        Employee removedElement = queue[front]; // decrement
        queue[front] = null; // better
        front++;
        if (size() == 0) {
            front = back = 0;
        }
        removedElement = null;
        return removedElement;

    }

    public boolean isEmpty() {
        return (back == 0);
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        if (back == 0) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Queue entries");

            int count = front;
            while (count < back) {
                System.out.print(queue[count++] +" ");

            }

        }
    }


}
