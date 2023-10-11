/* Cho một mảng số nguyên nums, tìm mảng con
với tổng lớn nhất và trả về tổng của nó .

Ví dụ 1:
    Đầu vào: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Đầu ra: 6
    Giải thích: Dãy con [4,-1,2,1] có tổng lớn nhất là 6.

Ví dụ 2:
    Đầu vào: nums = [1]
    Đầu ra: 1
    Giải thích: Phân mảng [1] có tổng lớn nhất là 1.
 
Ví dụ 3:
    Đầu vào: nums = [5,4,-1,7,8]
    Đầu ra: 23
    Giải thích: Dãy con [5,4,-1,7,8] có tổng lớn nhất là 23.
*/


public class Sentence10 {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            max = Math.max(max, currentMax);
        }
        return max;
    }
    
    public static void main(String[] args) {
        Sentence10 run = new Sentence10();
        System.out.println(run.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
