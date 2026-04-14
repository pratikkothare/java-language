public class Recursionbasics1 {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        // int fnm1=factorial(n-1);
        // int fn= n*fnm1;
        // return fn;

        return n*factorial(n-1);
    }

    public static int sumofno(int n){
        if(n==1){
            return 1;
        }
        int snm1= sumofno(n-1);
        int sm= n + snm1;
        return sm;
    }
    
    public static int fibonaci(int n){
        //base case
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        } // Tiling problems are same as fibonacci

        //f(N)=f(n-1) + f(n-2)... coz, 0,1,1,2,3,5,8= addition of prev 2 no.s is fibonacii
        int nm1= fibonaci(n-1);
        int nm2= fibonaci(n-2);
        int N= nm1 + nm2;
        return N;
    }

    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return issorted(arr,i+1);
    }


    public static int FirstOccurance(int array[], int key, int j){
        if(j==array.length-1){
            return -1;
        }
        if(array[j]==key){
            return j;
        }
        return FirstOccurance(array,key,j+1);
    }

    public static int LastOccurance(int array[], int key, int j){
        if(j==0){
            return -1;
        }
        if(array[j]==key){
            return j;
        }
        return LastOccurance(array,key,j-1);


        // if(j==array.length-1){
        //     return -1;
        // }
        // int isFound=LastOccurance(array,key,j+1);
        // if(isFound != -1 && array[j]==key){
        //     return j;
        // }
        //return isFound;

    }

    public static int power(int a, int b){ //x^n=x * x^n-1      //O(n)
        if(b==0){
            return 1;
        }
    //     int abm1= power(a,b-1);
    //     int ab=a*xnm1;
    //     return ab;
        return a*power(a,b-1);
    }

    public static int optimisedPower(int x, int n){ //log(n)

        int halfpower=optimisedPower(x,n/2);  // *optimisedPower(x,n/2) nahi liya kyu ki usko aur time lagta O(n)
        int halfpowersq= halfpower*halfpower; // varible mai store kiya aur multiply krdiya. 

        //if n is odd
        if(n%2 !=0){
            halfpowersq = x * halfpowersq; 
        }

        return halfpowersq;
    }

   
    public static void main(String[] args) {
        int n=5;
        int arr[]={1,2,3,4,5,6};
        int array[]={7,1,3,7,9,0,1,5,4};
        int key=4;
        // System.out.println(sumofno(n));
        // System.out.println(factorial(n));
        // System.out.println(fibonaci(n));
        // System.out.println(issorted(arr,0));
        System.out.println(FirstOccurance(array,key,0));
        System.out.println(LastOccurance(array,key,array.length-1));
        System.out.println(power(2,5));
       // System.out.println(optimisedPower(2,5));
    }
}
