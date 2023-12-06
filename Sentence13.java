class Listnode {
    int val;
    Listnode next;
    Listnode(int value) {
        this.val = value;
        this.next = null;
    }
}

public class Sentence13 {
    
    public boolean hasCycle(Listnode head, int pos) {
        Listnode tail = TailList(head);
        boolean result = false;

        if (!(pos == tail.val) && pos >= 0){
            result = true;
        }
        
        return result;
    }

    public Listnode TailList(Listnode head){
        Listnode tail = null;
        while (head != null){
            if (head.next == null){
                tail = head;
            }
            head = head.next;
        }
        return tail;
    }

    public static void main(String[] args) {
        Sentence13 run = new Sentence13();
        int pos = -1;
        Listnode n1 = new Listnode(3);
        Listnode n2 = new Listnode(2);
        Listnode n3 = new Listnode(0);
        Listnode n4 = new Listnode(-4);

        Listnode head = n1;
        
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println(run.hasCycle(head, pos));
    }
}
