/* 
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.


Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 
 */

public class Sentence16 {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length() || ransomNote.length() < magazine.length())
            return false;
        
        String[] list = ransomNote.split("");
        for (int i = 0; i < list.length; i++) {
            if (magazine.contains(list[i])){
                magazine = magazine.replaceFirst(list[i], "");
            }
            else 
                return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Sentence16 run = new Sentence16();

        System.out.println(run.canConstruct("aa", "ab"));
        System.out.println(run.canConstruct("aba", "aab"));
        System.out.println(run.canConstruct("abc", "ab"));
        System.out.println(run.canConstruct("b", "a"));
        System.out.println(run.canConstruct("amod maha", "mdoamaa h"));
    }
}
