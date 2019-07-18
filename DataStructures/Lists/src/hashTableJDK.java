import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashTableJDK {

public void hashtTableJDKImplementation() {
    Employee jane = (new Employee("Hashtable:Jane", "Jones", 123));
    Employee sharan = (new Employee("Hashtable:Sharan", "Surendra", 546));
    Employee shreya = (new Employee("Hashtable:Shreya", "Sure", 693));
    Employee sure = (new Employee("Hashtable:Sure", "sdass", 968));


    Map<String, Employee> hashMap = new HashMap<String, Employee>();
    hashMap.put(sure.getLastName(), sure);
    hashMap.put(shreya.getLastName(), shreya);
    hashMap.putIfAbsent(shreya.getLastName(), sharan);

    System.out.println(hashMap.getOrDefault("Shrada",sure));

    System.out.println(hashMap.containsKey(sure.getLastName())); //faster as it has the index
    System.out.println(hashMap.containsValue(sure)); //slower as it has to find from start of the hashtabke

   /* Iterator<Employee> iterator = hashMap.values().iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }*/

   hashMap.forEach( (k,v) -> System.out.println("Key = " + k + "Employee = " + v));

   //shreya, sure

    hashMap.remove(sure.getLastName());

    hashMap.forEach( (k,v) -> System.out.println("Key = " + k + "Employee = " + v));

}
}
