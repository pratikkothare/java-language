public class RemoveConsegativeChar {
    public static void main(String[] args) {
      String S="aabbacccaaab";
      System.out.println(removeConsecutiveCharacter(S));
    }

    public static String removeConsecutiveCharacter(String S){
        StringBuilder sb=new StringBuilder("");
        sb.append(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                sb.append(S.charAt(i));
            }else{
                continue;
            }
        }
        return sb.toString();
    }
}
