import java.util.*;
public class pairsum{
    public static void main(String[] args) {
        int list[]={11,15,6,8,9,10};//sorted roteted array
        int target=16;
        System.out.println(Pairsum(list,target));
        }

    public static Boolean Pairsum(int list[],int target){
        int rr=-1;
        int n=list.length;
        for(int i=0;i<n;i++){
            if(list[i]>list[i+1]){
                rr=i;
                break;
            }
        }    
        int rp=rr;
        int lp=rr+1;
        while(lp!=rp){
        if(list[lp]+list[rp]==target){
            return true;
        }
        if(list[lp]+list[rp]<target) {
            lp=(lp+1)%n;
        }else{
            rp=(n+rp-1)%n;
        }
        }

    return false;
}
}
