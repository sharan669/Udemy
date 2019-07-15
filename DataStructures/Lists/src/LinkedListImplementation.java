import java.util.List;
import java.util.Vector;

public class LinkedListImplementation {

    public void linkedListImplementation(){

        Employee jane = (new Employee("LinkedList:Jane","Jones ",123));
        Employee sharan = (new Employee("LinkedList:Sharan","Surendra",546));
        Employee shreya = (new Employee("LinkedList:Shreya","Sure",693));
        Employee sure = (new Employee("LinkedList:Sure","sda", 968));

        EmployeeLinkedList employeeLinkedList=new EmployeeLinkedList();

        System.out.println("Is the list empty "+ employeeLinkedList.isListEmpty());

        employeeLinkedList.addToFront(jane);
        employeeLinkedList.addToFront(sharan);
        employeeLinkedList.addToFront(shreya);
        employeeLinkedList.addToFront(sure);

        employeeLinkedList.printList();

        System.out.println("The size of the list is " + employeeLinkedList.sizeOfTheList());

        System.out.println("Is the list empty "+ employeeLinkedList.isListEmpty());

        employeeLinkedList.removeFrontElementFromList();

        employeeLinkedList.printList();
    }


}
