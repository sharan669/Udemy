public class TreeImplementation {

    public void treeImplementation(){

        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.print();

        System.out.println("\n----------");

        System.out.println("Pre order traversal") ;
        tree.preOrderTraverdal();
        System.out.println("\nPost order traversal") ;
        tree.postOrderTraverdal();
      //  tree.getMax();

        //tree.getMin();

        //System.out.println(tree.get(55));

       // tree.delete(8888);

       // tree.print();

    }

}
