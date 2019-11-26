import java.util.*;

 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

 class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length; i++){
            int area = maxSubArea(height, i);
            if(area > max){
                max = area;
            }
        }
        return max;
    }

    public static int maxSubArea(int[] height, int idx){
        int max = 0;
        for(int i = idx; i < height.length; i++){
            int x = 0;
            if(height[i] > height[idx]){
                x = height[idx];
            } else {
                x = height[i];
            }
            int y = i - idx;
            int area = x*y;
            if(area > max){
                max = area;
            }
        }
        return max;
    }
}