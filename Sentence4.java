/* 
Bạn được cung cấp một mảng prices giá prices[i] của một cổ phiếu nhất định trong ngày .i(day)

Bạn muốn tối đa hóa lợi nhuận của mình bằng cách chọn một ngày để mua một cổ phiếu và chọn một ngày khác trong tương lai để bán cổ phiếu đó.

Trả lại lợi nhuận tối đa bạn có thể đạt được từ giao dịch này . Nếu bạn không thể đạt được bất kỳ lợi nhuận nào, hãy trả lại 0.

* Ví dụ 1:
    Đầu vào: giá = [7,1,5,3,6,4]
        Đầu ra: 5
    Giải thích: Mua ngày thứ 2 (giá = 1) và bán ngày thứ 5 (giá = 6), lợi nhuận = 6-1 = 5.
    Lưu ý rằng việc mua vào ngày thứ 2 và bán vào ngày thứ 1 là không được phép vì bạn phải mua trước khi bán.
    
* Ví dụ 2:
    Đầu vào: giá = [7,6,4,3,1]
    Đầu ra: 0
    Giải thích: Trong trường hợp này, không có giao dịch nào được thực hiện và lợi nhuận tối đa = 0.
*/
public class Sentence4 { 

    public int min(int[] arr){ //tìm số nhỏ nhất trong mảng
        int result_min = arr[0];
        for (int i = 1; i < arr.length; i++) 
            if (result_min > arr[i]) result_min = arr[i];

        return result_min;
    }

    public int maxProfit(int[] prices) {
        int min_num = min(prices);
        for (int i = 0; i < prices.length; i++) {   
            if (prices[i] == min_num){ // tạo 1 vòng lặp tại vị trí bán (hay là số nhỏ nhất)
                int index = i, max = min_num; 
                for (int j = i; j < prices.length; j++) {
                    if (max < prices[j]){
                        max = prices[j];
                        index = j; // lưu vị trí index bán (ngày bán)
                    }
                }
                if(index == i) return 0; // nếu không có ngày nào có lợi nhuận thì trả về 0
                else return index+1; // ngược lại in ra ngày bán. 
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Sentence4 prices = new Sentence4();
        int[] a = {7,6,4,3,1};

        System.out.println(prices.maxProfit(a));

    }
}
