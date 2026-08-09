package LeetCodes;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args){
       int[] nums1 = {1, 2, 3, 0, 0, 0,0};
       int[] nums2 = {1,2, 5, 6};
       int k=nums1.length-1;
       int i= 2,j=nums2.length-1;
       while(j>=0 && i>=0){
           if(nums1[i]<nums2[j]){
                nums1[k]=nums2[j];
                j--;
           }else{
               nums1[k]=nums1[i];
               i--;
           }
           k--;
       }
       System.out.println(Arrays.toString(nums1));
    }
}
