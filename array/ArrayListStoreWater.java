import java.util.*;
public class ArrayListStoreWater {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(8);
        nums.add(6);
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(8);
        nums.add(3);
        nums.add(7);
        

        System.out.println(StoreWater(nums));
    }

    public static int StoreWater(ArrayList<Integer> nums){
        int left=0, right=nums.size()-1;
        int maxwater=0;
        while(left<right){
            int height=Math.min(nums.get(left),nums.get(right));
            int width=right-left;
            int currwater= (height*width);
            maxwater=Math.max(maxwater,currwater);

            if(nums.get(left)<nums.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;
    }
}
