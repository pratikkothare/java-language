public class Backtracking {
    
    public static void main(String[] args) {
        int arr[]=new int[5];
        //changeArr(arr, 0, 1);
        // printArr(arr);

        String str="abc";
        FindSubsets(str, "", 0);

        String strr="ab";
        //FindSubsetsusingSB(strr, new StringBuilder(""), 0);
    }
    public static void changeArr(int[] arr, int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;//kaam
        changeArr(arr, i+1, val+1);//fn call
        arr[i]=arr[i]-2; //backtracking

    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }


    public static void FindSubsets(String str, String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
        }
        //O(2^n(total subsets) * n(length of string))

        //yes choice
        FindSubsets(str, ans+str.charAt(i), i+1);
        
        //no choice
        FindSubsets(str,ans,i+1);
    }

    public static void FindSubsetsusingSB(String strr, StringBuilder ans,int i){
        //base case
        if(i==strr.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
        }
        //yes choice
        FindSubsetsusingSB(strr, ans.append(strr.charAt(i)), i+1);
        ans.deleteCharAt(ans.length()-1);   
        
        //no choice
        FindSubsetsusingSB(strr,ans,i+1);
    }
}
//in the case of strings, compaire to stringBuilder you're creating a new string with the expression
// ans + str.charAt(i). Since strings in Java are immutable,
// this concatenation does not change the original ans but rather
// creates a new string. Therefore, there's no need to "delete"
// the last character or backtrack manually