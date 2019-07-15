import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorImplementation {

    public void vectorImplementation(){

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Vector:Jane","Jones ",123));
        employeeList.add(new Employee("Vector:Sharan","Surendra",546));
        employeeList.add(new Employee("Vector:Shreya","Sure",693));
        employeeList.add(new Employee("Vectore:Sure","sda", 968));


       employeeList.forEach(employee->System.out.println("Vector:"+employee));
    }

}
