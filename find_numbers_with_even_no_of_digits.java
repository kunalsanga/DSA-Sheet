import java.util.*;

public class find_numbers_with_even_no_of_digits {

    public boolean numberhasevendigits(int num){
        int digitcount = 0;

        while(num!=0){
            num=num/10;
            digitcount++;
        }
        return digitcount % 2 ==0;
    }

    public int findnumbers(int[] nums){
        int evencount = 0;
        for(int i=0;i<nums.length;i++){
            if(numberhasevendigits(nums[i])){
                evencount++;
            }
        }
        return evencount;
    }
    public static void main(String[] args){
        find_numbers_with_even_no_of_digits obj = new find_numbers_with_even_no_of_digits();

        int[] nums1 = {12,345,2,6,7896};
        System.out.println("output 1: " +obj.findnumbers(nums1));

        int[] nums2 = {55,901,482,1771};
        System.out.println("output 2: " +obj.findnumbers(nums2));

    }
}