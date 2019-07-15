public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if(head==null)
            tail=node;
        else
            head.setPrevious(node);
        head=node;
        size++;
    }

    public void addToTail(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        if(head==null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail=node;
        size ++;
    }

    public boolean isListEmpty(){
        return (head==null);
    }

    public void removeFrontElementFromList(){
        if(!isListEmpty()) {
            EmployeeNode nodeToBeDeleted = head;
            head = head.getNext();
            if(head==null)
                tail=null;
            else
                head.setPrevious(null);

            nodeToBeDeleted = null;
            size --;
        }
    }

    public void removeElementFromEnd(){
        if(!isListEmpty()){
        EmployeeNode node = tail;
        tail = tail.getPrevious();

        if(tail == null)
            head=null;
        else
            tail.setNext(null);

        node=null;
        size --;
    }}


    public int sizeOfTheList(){
        return size;
    }

    public void printList(){
        EmployeeNode current  =head;
        while(current!=null){
            System.out.println(current.getEmployee().toString());
            current=current.getNext();
        }
    }
}
