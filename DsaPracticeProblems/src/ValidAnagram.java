import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "madam";
        String t = "madams";
        System.out.println(anagramCheck2(s,t));
    }

    public static boolean anagramCheck(String s, String t) {

        if(s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()) {
            if(!map.containsKey(ch)) return false;
            map.put(ch, map.get(ch)-1);
            if(map.get(ch) < 0) return false;
        }
        return true;
    }

    public static boolean anagramCheck2(String s, String t) {

        int[] ss = new int[26];
        int[] tt = new int[26];

        for(char c: s.toCharArray()) {
            ss[c - 'a']++;
        }
        for(char c: t.toCharArray()) {
            tt[c - 'a']++;
        }
        for(int i=0;i<26;i++) {
            if(ss[i] != tt[i])
                return false;
        }
        return true;
    }
}
