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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence3 {
    public static void main(String[] args) {
        ArrayList<Integer> int_list = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(int_list);

    }


    public List mergeTwoLists(List list1, List list2){
        for (int i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++){
                
            }
            
        }


        return null;
    }
}
