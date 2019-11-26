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
        while(tempOne!=null || tempTwo!=null){
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




        ArrayList<Long> first = new ArrayList<>();
        ArrayList<Long> second = new ArrayList<>();



        while(temp != null){
            first.add(temp.val);
            temp = temp.next;
        }
        temp = two;
        while(temp != null){
            second.add(temp.val);
            temp = temp.next;
        }

        System.out.println(first);
        System.out.println(second);

        long firstTotal = 0;
        long factor = 1;
        for(long item: first){
            firstTotal += (item*factor);
            factor *= 10;
        }
        long secondTotal = 0;
        factor = 1;
        for(long item: second){
            secondTotal += (item*factor);
            factor *= 10;
        }

        System.out.println(firstTotal);
        System.out.println(secondTotal);

        long total = firstTotal + secondTotal;
        
        System.out.println(total);
        ArrayList<Long> foo = new ArrayList<>();
        while(total != 0){
            foo.add(total%10);
            total = total/10;
        }
        ListNode head = null;
        for(long item: foo){
            head = add(item,head);
        }
        return head;
    
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