package binarytree;

public class TestBST {
    public static void main(String[] args) {
        BTS<String> tree = new BTS<>();
        tree.insert("George");
        tree.insert("Michel");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: "+tree.getSize());
    }
}
