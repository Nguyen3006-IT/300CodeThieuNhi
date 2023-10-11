
class Treenode{
    int val;
    Treenode left;
    Treenode right;
    Treenode() {}
    Treenode(int val) { this.val = val; }
    Treenode(int val, Treenode left, Treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Sentence6{    
    public static Treenode InvertBinaryTree(Treenode root) {
        if (root.left == null || root.right == null ) return root;

        Treenode left = InvertBinaryTree(root.left);
        Treenode right = InvertBinaryTree(root.right);
        
        root.left = right;
        root.right = left;

        return root;
    }	

    public static void main(String[] args) {
        Treenode root = new Treenode(4);
        root.left = new Treenode(2);
        root.right = new Treenode(7);
        root.left.left = new Treenode(1);
        root.left.right = new Treenode(3);
        root.right.left = new Treenode(6);
        root.right.right = new Treenode(9);

        InvertBinaryTree(root);

        System.out.print(root.val + " ");
        System.out.print(root.left.val + " ");
        System.out.print(root.right.val + " ");
        System.out.print(root.left.left.val + " ");
        System.out.print(root.left.right.val + " ");
        System.out.print(root.right.left.val + " ");
        System.out.print(root.right.right.val + " ");


    }
}