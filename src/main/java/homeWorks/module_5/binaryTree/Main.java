package homeWorks.module_5.binaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        System.out.println(bt.containsNode(3));
        System.out.println(bt.containsNode(9));

    }

}
