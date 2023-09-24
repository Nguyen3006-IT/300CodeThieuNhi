/* 
- Bạn được cấp phần đầu của hai danh sách liên kết được sắp xếp list1và list2.
- Hợp nhất hai danh sách thành một danh sách được sắp xếp . Danh sách phải được
tạo bằng cách ghép các nút của hai danh sách đầu tiên lại với nhau.

- Trả về phần đầu của danh sách liên kết đã hợp nhất .

Ví dụ 1:
    Đầu vào: list1 = [1,2,4], list2 = [1,3,4]
    Đầu ra: [1,1,2,3,4,4]
Ví dụ 2:
    Đầu vào: list1 = [], list2 = []
    Đầu ra: []
Ví dụ 3:
    Đầu vào: list1 = [], list2 = [0]
    Đầu ra: [0]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence3 {
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        // Tạo một danh sách kết quả để chứa kết quả
        List<Integer> result = new ArrayList<>();
    
        // Duyệt qua hai danh sách đầu tiên và ghép các phần tử của chúng lại với nhau
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }       
        // Thêm các phần tử còn lại của danh sách không trống vào danh sách kết quả
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        // Trả về danh sách kết quả
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> int_list = new ArrayList<>(Arrays.asList(1,3,4,6,7));
        ArrayList<Integer> int_list2 = new ArrayList<>(Arrays.asList(1,2,4,8,9));

        System.out.println(mergeSortedLists(int_list, int_list2));

    }
}
