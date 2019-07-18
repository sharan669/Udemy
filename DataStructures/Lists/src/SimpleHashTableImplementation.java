import com.sun.net.httpserver.Filter;

public class SimpleHashTableImplementation {

    public void hashTableImplementation(){

        //SimpleHashTable simpleHashTable=new SimpleHashTable();

        ChainedHashTable chainedHashTable = new ChainedHashTable();

        Employee jane = (new Employee("Hashtable:Jane","Jones",123));
        Employee sharan = (new Employee("Hashtable:Sharan","Surendra",546));
        Employee shreya = (new Employee("Hashtable:Shreya","Sure",693));
        Employee sure = (new Employee("Hashtable:Sure","sdass", 968));

       // simpleHashTable.put(jane.getLastName(),jane);

        // index 5 - jane

       // simpleHashTable.printHashTable();
        //jane

       // simpleHashTable.put(sure.getLastName(),sure);
        //no error
      //  simpleHashTable.put(sure.getLastName(),sure);
       // simpleHashTable.printHashTable();
        // sure, sharan

        //simpleHashTable.remove(jane.getLastName());
        //simpleHashTable.printHashTable();

        //System.out.println("Getting the key for sharan " + simpleHashTable.get(sure.getLastName()));

        //simpleHashTable.printHashTable();

        chainedHashTable.put(jane.getLastName(),jane);
        chainedHashTable.put(sure.getLastName(),sure);

        //jane, sure - index 5

        chainedHashTable.printHastable();

        System.out.println(" ---------------");

        System.out.println("Retrive key sure: " + chainedHashTable.get(sure.getLastName()));

        chainedHashTable.remove(sure.getLastName());

        chainedHashTable.printHastable();

    }


}
