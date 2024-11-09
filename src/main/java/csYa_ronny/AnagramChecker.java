package csYa_ronny;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // TODO: Implement the logic to check if str1 and str2 are anagrams
        int sum1=0,sum2=0;
        for (int i = 0; i < str1.length(); i++) {
            sum1+=str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            sum2+=str2.charAt(i);
        }
        if (sum1==sum2)
            return true;
        return false; //אני בטוח שזה לא עובד
    }

    public static void main(String[] args) {
        // דוגמאות לשימוש בשיטה areAnagrams
        String word1 = "listen";
        String word2 = "silent";
        String word3 = "apple";
        String word4 = "pale";

        System.out.println("Are \"" + word1 + "\" and \"" + word2 + "\" anagrams? " + areAnagrams(word1, word2));
        System.out.println("Are \"" + word3 + "\" and \"" + word4 + "\" anagrams? " + areAnagrams(word3, word4));
    }
}
