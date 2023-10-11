/* 
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.


Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.

Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.
*/


import java.util.regex.Pattern;

public class Sentence5 {
    /* 
    bỏ các kí tự (ví dụ: ",", ".", ":", "(", "[", "{", ")", "]", "}", "_", "-", "=", "+", "/", "?") và chuyển các chữ về dạng chữ thường. 
    */
    public String split_chars(String str){ 
        Pattern regex = Pattern.compile("[^a-zA-Z0-9]"); 
        String result = regex.matcher(str).replaceAll("");
        return result.toLowerCase();
    }

    public boolean isPalindrome(String s) {
        String result = "", s_to_split_char = split_chars(s);
        for (int i = s_to_split_char.length()-1; i >= 0 ; i--) {
            result += s_to_split_char.charAt(i);
        }
        if (result.equals(s_to_split_char)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Sentence5 run = new Sentence5();
        String str = "race a car";
        System.out.println(run.isPalindrome(str));
    }
}
