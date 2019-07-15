public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }

    public boolean isListEmpty(){
        return (head==null);
    }

    public void removeFrontElementFromList(){
        if(!isListEmpty()) {
            EmployeeNode nodeToBeDeleted = head;
            head = head.getNext();
            nodeToBeDeleted = null;
            size --;
        }
    }


    public int sizeOfTheList(){
        return size;
    }

    public void printList(){
        EmployeeNode current=head;
        while(current!=null){
            System.out.println(current.getEmployee().toString());
            current=current.getNext();
        }
    }
}
