import java.util.*;
//remove duplicates from sortred array and return the no. of unique elements
public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDupUsingSets(nums));
        //System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int j=1;//to calculate the no. of unique elements
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){ //while loop laga diya tha insted of if comdition
                nums[j]=nums[i];
                j++;
            }
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]);
        }
        System.out.println("");
        return j;
    }

    public static int removeDupUsingSets(int[] nums){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
        return set.size();
    }
        
}

