
import java.io.*;
import java.util.*;



class Solution {
  
      public int peakIndexInMountainArray(int[] arr) {
        for (int i = 0 ; i < arr.length - 1 ; i++){
          if (arr[i] > arr[i + 1]){
            return i;
          }
        }
        return 404;
      }
  
  public static void main(String[] args) {

     int[] Array = new int[]{ 24,69,100,99,79,78,67,36,26,19}; 
    Solution r = new Solution();
    System.out.println(r.peakIndexInMountainArray(Array));
  }
}
