/* Cho một cây nhị phân, hãy xác định xem nó có chiều cao cân đối.

Ví dụ 1:
    Đầu vào: root = [3,9,20,null,null,15,7]
    Đầu ra: true

Ví dụ 2:
    Đầu vào: root = [1,2,2,3,3,null,null,4,4]
    Đầu ra: false
    
Ví dụ 3:
    Đầu vào: root = []
    Đầu ra: true
 */

class Tree{
    Integer val;
    Tree left, right;
    
    Tree() {}
    Tree(Integer val) { this.val = val; }
    Tree(Integer val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Sentence12 {
  boolean isBalanced=true;
  public boolean isBalanced(Tree root) {
      if(root == null){
          return true;
      }
      depth(root);
      return isBalanced;
  }
  private int depth(Tree node){
      if(node == null){
          return 0;
      }
      int left = depth(node.left);
      int right = depth(node.right);
      
      if(Math.abs(left-right) > 1){
          isBalanced = false;
      }
      return Math.max(left,right)+1;
  }
  

    public static void main(String[] args) {
        Sentence12 run = new Sentence12();

        Tree root1 = new Tree(1, 
            new Tree(2, new Tree(3, new Tree(4), new Tree()), new Tree()), 
            new Tree(2, new Tree(), new Tree(3, new Tree(), new Tree(4)))
        );
        Tree root2 = new Tree(1, 
            new Tree(2, new Tree(3, new Tree(4), new Tree(4)), new Tree(3)), 
            new Tree(2, new Tree(), new Tree())
        );
        Tree root3 = new Tree(1, 
            new Tree(2, new Tree(3, new Tree(4), new Tree(4)), new Tree(3)), 
            new Tree(2)
        );
        System.out.println(run.isBalanced(root1));
        System.out.println(run.isBalanced(root2));
        System.out.println(run.isBalanced(root3));
    }
}
