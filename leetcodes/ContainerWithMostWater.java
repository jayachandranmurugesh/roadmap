package LeetCodes;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] container ={1, 8, 6, 2, 5, 4, 8, 3, 9};
     /* L                       R
↓                       ↓
        1  8  6  2  5  4  8  3  7   */
        int area =  0;
        int leftPointer=0;
        int rightPointer=container.length-1;
        int maxArea=0;
        while(leftPointer<=rightPointer){
            area=(rightPointer-leftPointer)*min(container[leftPointer],container[rightPointer]);
            maxArea=Math.max(maxArea,area);
            if(container[leftPointer]<container[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;
            }
        }
        System.out.println(maxArea);
    }
    }

