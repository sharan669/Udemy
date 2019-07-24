public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;

    public void insert(int value) {

        if (value == data) {
            return;
        } else if (value < data) {
            if (left == null) {
                left = new TreeNode(value);
                System.out.println("inserted at left");

            } else {
                System.out.println("Traverse left");

                left.insert(value);
            }
        } else {

            if (right == null) {
                System.out.println("inserted at right");
                right = new TreeNode(value);
            } else {
                System.out.println("Traverse right");
                right.insert(value);
            }
        }
    }

    public void Traversal(TreeNode node) {  //this is an in order traversal
        // System.out.println("The value of the current node is " + node);
        if (node == null) {
            return;
        }
        Traversal(node.left);
        if (node != null) {
            System.out.print(node.data + " ");
        }
        Traversal(node.right);
    }

    public void PreOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        PreOrderTraversal(node.left);
        PreOrderTraversal(node.right);
    }

    public void PostOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        PostOrderTraversal(node.right);
        PostOrderTraversal(node.left);
    }


    public int getMax() {
        if (right != null) {
            right.getMax();
        }
        return (data);
    }

    public int getMin() {
        if (left != null) {
            left.getMin();
        }
        return (data);
    }

    public TreeNode get(int value) {

        if (value == data) {
            return this;
        } else if (value > data && right != null) {
            return (right.get(value));
        } else if (left != null) {
            return (left.get(value));
        }

        System.out.println("The given value is not found");
        return null;
    }

    public void deleteNode(int value) {

        if (value < data) {

            if (left.data == value && left.left == null && left.right == null) {
                TreeNode deltedNode = left;
                left = null;
                deltedNode = null;
            } else {
                left.deleteNode(value);
            }

        } else {

            if (right.data == value && right.left == null && right.right == null) {
                TreeNode deltedNode = right;
                right = null;
                deltedNode = null;
            } else {
                right.deleteNode(value);
            }

        }

    }


    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
