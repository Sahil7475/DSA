package strings;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagrams("silent","listen"));
    }

    public static boolean areAnagrams(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }

        int[] charCount = new int[256];

        // Count the frequency of each character in str1
        for(int i=0;i<str1.length();i++){
            charCount[str1.charAt(i)]++;
        }

        // Decrease the frequency of each character in str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }



        return true;
    }
}
