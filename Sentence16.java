public class Sentence16 {
    public String letter(String s){
        String result = "";
        if (s == "")
            return "";
        else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (result.isEmpty()) result += c;
                else{
                    for (int j = i -1; j < result.length(); j++) {
                        if (c == result.charAt(j))
                            break;
                        else
                            result += c;
                            
                    } 
                }
            }
        }
        return result;
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        return ransomNote.equals(magazine);
    }
    public static void main(String[] args) {
        Sentence16 run = new Sentence16();

        System.out.println(run.letter("aaaaabbbbbbbbb"));
    }
}
