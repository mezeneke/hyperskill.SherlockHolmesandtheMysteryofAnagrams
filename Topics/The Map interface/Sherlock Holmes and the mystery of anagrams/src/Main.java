import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next().toLowerCase();
        String word2 = scan.next().toLowerCase();

        String answer = isAnagram(word1, word2) ? "yes" : "no";

        System.out.println(answer);
    }

    static Map<Character, Integer> mapChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
    }

    static boolean isAnagram(String word1, String word2) {
        return mapChars(word1).equals(mapChars(word2));
    }
}