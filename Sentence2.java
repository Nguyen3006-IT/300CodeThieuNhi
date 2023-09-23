/* 
Cho một chuỗi s chỉ chứa các ký tự '(', ')', '{', '}'và '[', ']'hãy xác định xem 
chuỗi đầu vào có hợp lệ hay không.

Một chuỗi đầu vào hợp lệ nếu:
- Dấu ngoặc mở phải được đóng bằng dấu ngoặc cùng loại.
- Dấu ngoặc mở phải được đóng theo đúng thứ tự.
- Mỗi dấu ngoặc đóng có một dấu ngoặc mở tương ứng cùng loại.

Ví dụ 1:
    Đầu vào: s = "()"
    Đầu ra: true
Ví dụ 2:
    Đầu vào: s = "()[]{}"
    Đầu ra: true
Ví dụ 3:
    Đầu vào: s = "(]"
    Đầu ra: sai
*/
import java.util.Arrays;
import java.util.Scanner;

public class Sentence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean re = isValid(s);
        System.out.println(re);

    }
    public static boolean isValid(String s) {
        String[] str = s.split("");
        String[] chars = {"(", "[", "{"};
        String[] chars_closing = {")","]","}"};
        boolean result = true;
        for (int i = 0; i < str.length; i+=2){
            for (int j = i+1; j < str.length; j+=2){
                int index = Arrays.binarySearch(chars, str[i]);
                int index2 = Arrays.binarySearch(chars_closing, str[j]);
                if (index != index2){
                    result = false;
                } 
                break;
            }
        }
        return result;
    }
}