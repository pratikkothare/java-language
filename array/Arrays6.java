import java.util.*;
public class Arrays6 {
    public static void main(String[] args) {
        int n = 8;
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int left[] = new int[n]; 
        int right[] = new int[n]; 
        int a = 0,
            b = 0;
        for(int i=0;i<n;i++){
            if(arr[i] >= 0){
                left[a++] = arr[i];
            }else{
                right[b++] = arr[i];
            }
        }

        for(int i=0;i<a;i++){
            arr[i] = left[i];
        }

        for(int i=0;i<b;i++){
            arr[i+a] = right[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
