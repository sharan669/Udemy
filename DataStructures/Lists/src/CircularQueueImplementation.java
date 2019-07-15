public class CircularQueueImplementation {

    public void circularQueueImplementation(){

        Employee jane = (new Employee("CircularQueue:Jane","Jones ",123));
        Employee sharan = (new Employee("CircularQueue:Sharan","Surendra",546));
        Employee shreya = (new Employee("CircularQueue:Shreya","Sure",693));
        Employee sure = (new Employee("CircularQueue:Sure","sda", 968));


        CircularArrayQueue circularArrayQueue=new CircularArrayQueue(3);

   /*     circularArrayQueue.push_back(jane);
        circularArrayQueue.push_back(sharan);
        circularArrayQueue.push_back(shreya);

        //jane, sharan, shreya'

        System.out.println("Circular queue entries");
        circularArrayQueue.printQueue();

        System.out.println("Circular queue entries");
        circularArrayQueue.printQueue();

        circularArrayQueue.removeFromFront();

        System.out.println("Circular queue entries after removing from front");
        circularArrayQueue.printQueue();
        //  ___, sharan, shreya

        System.out.println("Circular queue entries after removing from front");
        circularArrayQueue.push_back(sure);
        //  sure | sharan, shreya

        System.out.println("Circular queue entries after adding sure element");
        circularArrayQueue.printQueue();
        //so should be sharan , shreya and sure

        circularArrayQueue.removeFromFront();
        circularArrayQueue.removeFromFront();
        circularArrayQueue.removeFromFront();

        //queue should be empty

        circularArrayQueue.printQueue();

        System.out.println("The size of the queue is "+ circularArrayQueue.size());

        System.out.println("The size " + circularArrayQueue.isEmpty()); */

        circularArrayQueue.push_back(jane);
        circularArrayQueue.push_back(sharan);
        //jane, sharan, __

        System.out.println("\nCircular queue entries after adding jane and sharan");
        circularArrayQueue.printQueue();

        circularArrayQueue.removeFromFront();
        //__, sharan, ___


        System.out.println("\nCircular queue entries after removing jane");
        circularArrayQueue.printQueue();

        circularArrayQueue.push_back(jane);
        //__, sharan, Jane

        System.out.println("Circular queue entries");
        circularArrayQueue.printQueue();



    }

}
