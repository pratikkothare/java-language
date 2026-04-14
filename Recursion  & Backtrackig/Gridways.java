import java.util.*;
public class Gridways {
    public static void main(String[] args) {
        int n=3;
        int m=3;

        //System.out.println(GridWays(n,m,0,0));
        System.out.println(usingPermutation(n, m));
        
    }
    public static int GridWays(int n, int m, int i, int j){
        if(i==n-1 && j==m-1){
            return 1; // one way. condn for last case
        }else if(i==n || j==m){
            return 0;// boundry condn
        }
        int w1=GridWays(n,m,i+1,j);
        int w2=GridWays(n,m,i,j+1);

        return w1+w2;
    }


//bina backtracking 
    public static int factorial(int num){
        if(num==0){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static int usingPermutation(int n, int m){ 
       int totalways=(n-1) + (m-1);
       int extrawaysofn=(n-1);
       int extrawaysofm=(m-1);

       return (factorial(totalways))/(factorial(extrawaysofn) * factorial(extrawaysofm));
    }
}
