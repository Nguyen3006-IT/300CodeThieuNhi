/* 
Cho hai chuỗi svà t, trả về true nếu t là đảo chữ của s, và false ngược lại .

Đảo chữ là một từ hoặc cụm từ được hình thành bằng cách sắp xếp lại các chữ cái của một từ hoặc cụm từ khác, thường sử dụng tất cả các chữ cái gốc chính xác một lần.

Ví dụ 1:
    Đầu vào: s = "anagram", t = "nagaram"
    Đầu ra: true
 
 Ví dụ 2:
    Đầu vào: s = "rat", t = "car"
    Đầu ra: false 
*/
 
public class Sentence7 {

    public String remove_at_index(String str, int index){ // 
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(i == index) s = "";
            result += s;
        }
        return result;
    }

    public boolean isAnagram(String s, String t) { 
        for (int i = 0; i < t.length(); i++) {
            if (t.indexOf(t.charAt(i)) != -1)
                s = remove_at_index(s, s.indexOf(t.charAt(i))); 
            else return false;
        }
        if (s.isEmpty()) return true;
        return false;
    }

    public static void main(String[] args) {
        Sentence7 run = new Sentence7();
        String s = "anagram", t = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println(run.isAnagram(s, t));
        System.out.println(run.isAnagram(s2, t2));

    }
}
