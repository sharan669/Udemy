import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable; //array of LinkedLists that will hold StroedEmployee - i:e key + value

    public ChainedHashTable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++)
            hashtable[i] = new LinkedList<StoredEmployee>();
    }


    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                return employee.employee;
            }

        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                break;
            }

        }
        if (employee == null || !employee.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }
    }


    public void printHastable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {  //is the linked list not present in the index, then print it as empty
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.println("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator(); //get an iterator to print the list
                while (iterator.hasNext()) { //if it has an element in the next position
                    System.out.print(iterator.next().employee);
                    System.out.print("-->");
                }
                System.out.println("null");
            }


        }

    }


    private int hashKey(String key) {
        return Math.abs(key.hashCode() % hashtable.length);
    }

}
