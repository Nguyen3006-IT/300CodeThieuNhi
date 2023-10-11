/* Cho một mảng các số nguyên numsđược sắp xếp theo thứ tự tăng dần và một số nguyên target, hãy viết hàm để tìm kiếm targettrong nums. Nếu targettồn tại thì trả về chỉ mục của nó. Nếu không, hãy quay lại -1.

Bạn phải viết một thuật toán có O(log n)độ phức tạp khi chạy.

Ví dụ 1:
    Đầu vào: nums = [-1,0,3,5,9,12], target = 9
    Đầu ra: 4
    Giải thích: 9 tồn tại dưới dạng nums và chỉ số của nó là 4
 
Ví dụ 2:
    Đầu vào: nums = [-1,0,3,5,9,12], target = 2
    Đầu ra: -1
    Giải thích: 2 không tồn tại trong nums nên trả về -1
*/

import java.util.Arrays;
import java.util.Scanner;

public class Sentence8{
    // bài này có thể dùng object.IndexOf("object cần tìm", "đây là nơi bạn cần tìm chữ đó, nếu không có đối số này thì mặc định là 0") 
    public int Search(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] == target) return i; 
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sentence8 run = new Sentence8();
        System.out.println(
            run.Search(Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray(), 
            sc.nextInt())
        );
    }
    /* Lệnh Arrays.stream(String).mapToInt(Integer::parseInt).toArray() dùng để chuyển Array String sang ArrayInt được xem dưới dạng int[] có thể dùng mapToDouble và lưu dưới dạng Double[]*/
}