import java.util.NoSuchElementException;

public class CircularArrayQueue {

    private Employee[] queue; //queue as an array
    private int front;
    private int back;

    public CircularArrayQueue(int capacity) {

        queue = new Employee[capacity]; // similar to int[] a=new int[size];
    }

    public void push_back(Employee employee) {  //O(1) complexity
        if (size() == queue.length - 1) { //When you are populating the last slot and also the front is still pointing to
            //index 0, then back cannot be wrapped, the array or the queue needs to be resized

            int numItems = size();
            Employee[] tempArray = new Employee[2 * queue.length];  //create an array of double the length
            System.arraycopy(queue, front, tempArray, 0, queue.length - front);  //copy the old queue to the new one
            //with double the length
            System.arraycopy(queue, 0, tempArray, queue.length - front, back);
            queue = tempArray; //copy the new array back to the queue
            front = 0;
            tempArray = null;
        }
        queue[back] = employee;
        if (back < queue.length - 1)
            back++;
        else
            back = 0;

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
        Employee removedElement = queue[front]; // extract the front
        queue[front] = null; // better to do it
        front++;
        if (size() == 0) {
            front = back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        removedElement = null;
        return removedElement;

    }

    public boolean isEmpty() {
        return (size() == 0);
    }

    public int size() {
        if (front <= back)
            return back - front;
        else
            return back - front + queue.length;
    }

    public void printQueue() {
        if (size() == 0) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Queue entries");

            if (front <= back) {
                for (int i = front; i < back; i++) {
                    System.out.println(queue[i]);
                }
            } else {  //when wrapped up
                for (int i = front; i < queue.length; i++) { // from front to end of the array
                    System.out.println(queue[i]);
                }
                for (int i = 0; i < back; i++) { //from start to back index of the array
                    System.out.println(queue[i]);
                }
            }

        }
    }


}
