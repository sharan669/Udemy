import java.util.EmptyStackException;

public class Stack {

    private Employee[] stack;
    private int top;

    public Stack(int capacity) {
        stack = new Employee[capacity]; // similar to int[] a=new int[size];
    }

    public void push_back(Employee employee) {  //O(N) complexity
        if (top == stack.length) { //need to resize
            Employee[] tempArray = new Employee[2 * stack.length];  //create an array of double the length
            System.arraycopy(stack, 0, tempArray, 0, stack.length);  //copy the old stack to the new one
            //with double the length
            stack = tempArray; //copy the new array back to the stack
            tempArray = null;
        }
        stack[top++] = employee;

    }

    public Employee peek(){ //O(1) complexity
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top-1];

    }


    public Employee pop_back() {  //O(1) Complexity
        if (isEmpty()) {
            throw new EmptyStackException();//The caller needs to handle it
            // no element in stack to pop
        }
        else {
            Employee poppedElement= stack[--top]; // decrement top
            stack[top]=null; // better
            return poppedElement;
        }

    }

    public boolean isEmpty(){
        return (top==0);
    }

    public int size(){
        return top;
    }

    public void printStack(){
        if(top==0){
            System.out.println("Empty stack");
        }
        else{
            System.out.println("Stack entries");

            int count=top;
            while(count>0){
                System.out.println(stack[--count]);

            }

        }}




}
