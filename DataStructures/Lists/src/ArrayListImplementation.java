import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {

    public void arrayListImplementation(){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane","Jones ",123));
        employeeList.add(new Employee("Sharan","Surendra",546));
        employeeList.add(new Employee("Shreya","Sure",693));
        employeeList.add(new Employee("Sure","sda", 968));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1,new Employee("Sharada","suren",693));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.size());

        employeeList.add(3,new Employee("adarsh","surya",321));

        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        System.out.println("The array used for the arrayList is");

        for(Employee employee: employeeArray)
            System.out.println(employee);


        System.out.println(employeeList.contains(new Employee("adarsh","surya",321)));
        //here since we are creating new instance, so the list contains vrious other instances

        System.out.println(employeeList.indexOf(new Employee("adarsh","surya",321)));

        employeeList.remove(2);

        employeeList.forEach(employee -> System.out.println(employee)); //costly as it requires moving the elemets back in the list



    }

}
