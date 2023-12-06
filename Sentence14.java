/* 
Triển khai hàng đợi vào trước ra trước (FIFO) chỉ bằng hai ngăn xếp. Hàng đợi được triển khai sẽ hỗ trợ tất cả các chức năng của hàng đợi thông thường ( push, peek, popvà empty).

Thực hiện MyQueuelớp:
void push(int x): Đẩy phần tử x về phía sau hàng đợi.
int pop(): Xóa phần tử khỏi đầu hàng đợi và trả về phần tử đó.
int peek(): Trả về phần tử ở đầu hàng đợi.
boolean empty(): Trả về truenếu hàng đợi trống, falsengược lại.
Ghi chú:

Bạn chỉ được sử dụng các thao tác tiêu chuẩn của ngăn xếp, có nghĩa là chỉ các thao tác push to top, peek/pop from top, size và is empty là hợp lệ.
Tùy thuộc vào ngôn ngữ của bạn, ngăn xếp có thể không được hỗ trợ nguyên bản. Bạn có thể mô phỏng ngăn xếp bằng cách sử dụng danh sách hoặc deque (hàng đợi hai đầu) miễn là bạn chỉ sử dụng các thao tác tiêu chuẩn của ngăn xếp.
 
Ví dụ 1:
    Đầu vào: 
    ["MyQueue", "đẩy", "đẩy", "nhìn", "pop", "trống"] 
    [[], [1], [2], [], [], []] Đầu ra 
    [null , null, null, 1, 1, false] Giải thích 
    MyQueue myQueue = new MyQueue(); 
    myQueue.push(1); // hàng đợi là: [1] 
    myQueue.push(2); // hàng đợi là: [1, 2] (ngoài cùng bên trái là phía trước hàng đợi) 
    myQueue.peek(); // return 1 
    myQueue.pop(); // return 1, queue là [2] 
    myQueue.empty(); // trả về sai
 */
import java.util.ArrayList;
import java.util.Arrays;
class MyQueue {
    ArrayList<Integer> queue = new ArrayList<Integer>();

    public MyQueue() {}

    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        queue.remove(queue.size()-1);
        return queue.size();
    }
    
    public int peek() {
        return queue.get(0);
    }
    
    public boolean empty() {
        if (queue.isEmpty()) return true;
        return false;
    }
    
}
public class Sentence14 {

    void result(String[] list1, int[][] list2){
        MyQueue obj = new MyQueue();
        ArrayList result = new ArrayList<>(Arrays.asList(null, null, null));
        for (int i = 1; i < list1.length; i++) {
            if (list1[i] == "push"){
                obj.push(list2[i][0]);
            } else if (list1[i] == "peek"){
                result.add(obj.peek());
            } else if (list1[i] == "pop"){
                result.add(obj.pop());
            } else if (list1[i] == "empty"){
                result.add(obj.empty());
            } 
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Sentence14 run = new Sentence14();
        String[] list1 = {"MyQueue", "push", "push", "peek", "pop", "empty"};
        int[][] list2 = {{}, {1}, {2}, {}, {}, {}};

        run.result(list1, list2);        
    }
}
