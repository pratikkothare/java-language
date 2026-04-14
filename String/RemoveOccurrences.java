public class RemoveOccurrences {
    public static String removeOccurrences(String s, String part) {
        while(s.contains(part)){
           //replace the first occurance
           s=s.replaceFirst(part, "");
        }
        return s;
    }
    public static void main(String[] args) {
        //String s = "daabcbaabcbc", part = "abc";
        System.out.println(removeOccurrences("daabcbaabcbc","abc"));
    }
}
