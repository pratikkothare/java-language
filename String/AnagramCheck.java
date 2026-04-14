import java.util.*;
public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any whitespace and convert to lowercase (optional, based on problem constraints)
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false; 
        }
        
        // Convert strings to char arrays
        char charArray1[] = str1.toCharArray();
        //System.out.print(Arrays.toString(charArray1));
        char charArray2[] = str2.toCharArray();
        

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";        
        
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
