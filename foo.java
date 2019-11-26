import java.util.*;

class foo{


  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2) return true;
    //rise/run
        float rise = coordinates[0][0] - coordinates[1][0];
        float run = coordinates[0][1] - coordinates[1][1];
        float riseOverRun = rise/run;
        for(int i = 0; i < coordinates.length-1; i++){
            float xDist = coordinates[i][0] - coordinates[i+1][0];
            float yDist = coordinates[i][1] - coordinates[i+1][0];
            float tempRatio = xDist/yDist;
            if(tempRatio != riseOverRun){
                return false;
            }
        }
        return true;
}
public static void main(String[] args) {
}

}