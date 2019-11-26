import java.util.*;

public class ListNode{
    long val;
    ListNode next;
    ListNode(long x){
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode one, ListNode two) {
        if(one.val == 0 && two.val == 0){
            if(one.next==null && two.next==null){
                return new ListNode(0);
            }
        }
        ListNode current = null;
        ListNode tempOne = one;
        ListNode tempTwo = two;
        int carry = 0;
        while(tempOne!=null && tempTwo!=null){
            int sum = carry + tempOne.val + tempTwo.val;
            carry = sum/10;
            current = add(sum%10, current);

            tempOne = tempOne.next;
            tempTwo = tempTwo.next;
        }

        if(tempOne != null){
            current.next = tempOne.next;
        }
        if(tempTwo != null){
            current.next = tempTwo.next;
        }

        return current;
    
}
    public static ListNode add(long val, ListNode head) {
		ListNode node = new ListNode((int)val);
		if(head == null) {
			head = node;
		}
		else {
			ListNode current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = node;
		}
        return head;
    }
}