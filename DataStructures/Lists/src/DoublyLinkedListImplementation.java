public class DoublyLinkedListImplementation {

    public void doublyLinkedListImplementation(){

        Employee jane = (new Employee("DoubLinkedList:Jane","Jones ",123));
        Employee sharan = (new Employee("DoubLinkedList:Sharan","Surendra",546));
        Employee shreya = (new Employee("DoubLinkedList:Shreya","Sure",693));
        Employee sure = (new Employee("DoubLinkedList:Sure","sda", 968));

        EmployeeDoublyLinkedList employeeDoublyLinkedList=new EmployeeDoublyLinkedList();

        System.out.println("Is the list empty "+ employeeDoublyLinkedList.isListEmpty());

        employeeDoublyLinkedList.addToFront(jane);
        employeeDoublyLinkedList.addToFront(sharan);
        employeeDoublyLinkedList.addToFront(shreya);
        employeeDoublyLinkedList.addToFront(sure);

        employeeDoublyLinkedList.printList();

        System.out.println("The size of the list is " + employeeDoublyLinkedList.sizeOfTheList());

        employeeDoublyLinkedList.addToTail(new Employee("rahul","sharma",896));

        employeeDoublyLinkedList.printList();

        System.out.println("The size of the list is " + employeeDoublyLinkedList.sizeOfTheList());

        //System.out.println("Is the list empty "+ employeeLinkedList.isListEmpty());

        employeeDoublyLinkedList.removeFrontElementFromList();

        employeeDoublyLinkedList.printList();

        System.out.println("The size of the list is " + employeeDoublyLinkedList.sizeOfTheList());

        employeeDoublyLinkedList.removeElementFromEnd();

        employeeDoublyLinkedList.printList();

        System.out.println("The size of the list is " + employeeDoublyLinkedList.sizeOfTheList());


    }




}


