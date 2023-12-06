/* 
Bạn là người quản lý sản phẩm và hiện đang lãnh đạo một nhóm phát triển một sản phẩm mới. Thật không may, phiên bản mới nhất của sản phẩm của bạn không vượt qua được quá trình kiểm tra chất lượng. Vì mỗi phiên bản đều được phát triển dựa trên phiên bản trước nên tất cả các phiên bản sau một phiên bản xấu cũng tệ.

Giả sử bạn có ncác phiên bản [1, 2, ..., n]và bạn muốn tìm ra phiên bản xấu đầu tiên, điều này khiến tất cả các phiên bản sau đều xấu.

Bạn được cấp một API bool isBadVersion(version)trả về liệu versioncó tệ hay không. Thực hiện một chức năng để tìm phiên bản xấu đầu tiên. Bạn nên giảm thiểu số lượng lệnh gọi tới API.

Ví dụ 1:
    Đầu vào: n = 5, bad = 4
    Đầu ra: 4
    Giải thích: 
    gọi isBadVersion(3) -> false
    isBadVersion(5) -> true
    isBadVersion(4) -> true 
    ==> Thì 4 là phiên bản xấu đầu tiên.

Ví dụ 2:
    Đầu vào: n = 1, xấu = 1
    Đầu ra: 1
 */

public class Sentence15{
    public boolean isBadVersion(int version){return version % 2 == 0;}

    public int firstBadVersion(int n) {
        int left = 1, right = n; 
        while (left < right){
            int mid = left + (right - left)/2;
            if (isBadVersion(mid))
                right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
    public static void main(String[] args) {
        Sentence15 run = new Sentence15();

        System.out.println(run.firstBadVersion(5));
        System.out.println(run.firstBadVersion(1));
    }
}