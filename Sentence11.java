/* 
Cho cây tìm kiếm nhị phân (BST), tìm nút tổ tiên chung (LCA) thấp nhất của hai nút đã cho trong BST.

Theo định nghĩa của LCA trên Wikipedia: “Tổ tiên chung thấp nhất được xác định giữa hai nút pvà qlà nút thấp nhất trong Tđó có cả hai p và q là con cháu (trong đó chúng tôi cho phép một nút là hậu duệ của chính nó )”.

VD1:
    Đầu vào: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
    Đầu ra: 6
    Giải thích: LCA của nút 2 và 8 là 6.

VD2:
    Đầu vào: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
    Đầu ra: 2
    Giải thích: LCA của nút 2 và 4 là 2, vì một nút có thể là hậu duệ của chính nó theo định nghĩa LCA.
*/

class Treenode{
    int val;
    Treenode left, right;
    Treenode() {}
    Treenode(int val) { this.val = val; }
}

public class Sentence11 {
    public Treenode lowestCommonAncestor(Treenode root, Treenode p, Treenode q) {
        if (p.val <= root.val && root.val <= q.val)
            return root;
        else if (p.val <= root.val && root.val >= q.val)
            return lowestCommonAncestor(root.left, p, q);
        else 
            return lowestCommonAncestor(root.right, p, q);

    }

    public static void main(String[] args) {
        Sentence11 run = new Sentence11();
        Treenode root = new Treenode(6);
        root.left = new Treenode(2);
        root.left.left = new Treenode(0);
        root.left.right = new Treenode(4);
        root.left.right.left = new Treenode(3);
        root.left.right.right = new Treenode(5);
        root.right = new Treenode(8);
        root.right.left = new Treenode(7);
        root.right.right = new Treenode(9);

        System.out.println(run.lowestCommonAncestor(root, new Treenode(2), new Treenode(8)).val);
        System.out.println(run.lowestCommonAncestor(root, new Treenode(2), new Treenode(4)).val);
        System.out.println(run.lowestCommonAncestor(root, new Treenode(3), new Treenode(5)).val);
    }
}
