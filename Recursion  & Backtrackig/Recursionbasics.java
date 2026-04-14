//steps:
  //1.base case
  //2.kaam
  //3.function call

public class Recursionbasics {
    

    public static void decreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        decreasing(n-1);
    }

    public static void increasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        increasing(n-1);
        System.out.println(n +" ");
        
    }
    
    public static void main(String[] args) {
        int n=10;
       decreasing(n);
        increasing(n);
    }
}
