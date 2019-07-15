public class StackImplementation {

    public void stackImplementaion(){

    Stack stack=new Stack(4);

        Employee jane = (new Employee("Stack:Jane","Jones ",123));
        Employee sharan = (new Employee("Stack:Sharan","Surendra",546));
        Employee shreya = (new Employee("Stack:Shreya","Sure",693));
        Employee sure = (new Employee("Stack:Sure","sda", 968));

        stack.push_back(jane);
        stack.push_back(sharan);
        stack.push_back(shreya);
        stack.push_back(sure);

        System.out.println(stack.size());

        stack.printStack();

        stack.pop_back();

        System.out.println(stack.isEmpty());

        stack.printStack();


        System.out.println("peek \n "+stack.peek().toString());



    }
}
