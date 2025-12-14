import java.util.*;

public class Max_Consecutiive_Ones {

    public static int findmaxconsecutiveones(int[] nums){
        int count=0,max=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }else{
                max=Math.max(max,count);
                count=0;
            }
        }
        return Math.max(max, count);
    }
    public static void main(String[] args){

        int[] nums1 = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};

        System.out.println("output 1: " + findmaxconsecutiveones(nums1));
        System.out.println("output 2: " + findmaxconsecutiveones(nums2));
    }
}
