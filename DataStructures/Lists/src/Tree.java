public class Tree {

    private TreeNode root;

    public void insert(int value) {
        System.out.println("The current value is " + value);
        if (root == null) {
            root = new TreeNode(value);
            System.out.println("inserted as root");
        } else
            root.insert(value);
    }

    public void print() {
        if (root == null) {
            System.out.println("The tree is empty");
        } else {
            root.Traversal(root);
        }
    }

    public void preOrderTraverdal() {
        if (root == null)
            System.out.println("The tree is empty");
        else
            root.PreOrderTraversal(root);
    }

    public void postOrderTraverdal() {
        if (root == null)
            System.out.println("The tree is empty");
        else
            root.PostOrderTraversal(root);
    }


    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private TreeNode deleteNode(TreeNode SubTreeRoot, int value) {
        if (SubTreeRoot == null) {
            return null;
        } else if (value < SubTreeRoot.getData()) {   //CASE 1 and 2 - deleting nodes with 0 pr 1 child
            SubTreeRoot.setLeft(deleteNode(SubTreeRoot.getLeft(), value)); //set the root to its correct values after deleting
        } else if (value > SubTreeRoot.getData()) {
            SubTreeRoot.setRight(deleteNode(SubTreeRoot.getRight(), value)); //set the root to its correct right value after delting
        } else if (value == SubTreeRoot.getData()) {
            if (SubTreeRoot.getLeft() == null)
                return SubTreeRoot.getRight(); //if the node to be deleted is found and if its left is null, then assign its right
            else if (SubTreeRoot.getRight() == null)
                return SubTreeRoot.getLeft();  //if the node to be deleted is found and if its right is null, then assign its left

            //set the root of the sub tree to the min value from the right subtree
            SubTreeRoot.setData(SubTreeRoot.getRight().getMin());

            //delte the min value in the right subtree
            SubTreeRoot.setRight(deleteNode(SubTreeRoot.getRight(), SubTreeRoot.getData()));
        }

        return SubTreeRoot;
    }


    public void getMax() {
        root.getMax();
    }

    public void getMin() {

        root.getMin();
    }

    public TreeNode get(int value) {
        if (root == null) {
            System.out.println("There is no elements in the tree");
            return null;
        } else {
            return (root.get(value));
        }
    }


}
