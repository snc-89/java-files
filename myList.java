public class myList{
    public ListNode head;

    public myList(){
        head = null;
    }

    public void add(int val) {
		ListNode node = new Node(val);
		if(head.next == null) {
			head = node;
		}
		else {
			ListNode last = head;
			ListNode current = head;
			while(current!=null) {
				last = current; //backup copy
				current = current.next;
			}
			last.next = node;
		}
    }
    
    public ListNode addtwoNumbers(ListNode one, ListNode two){
        ListNode temp = one;
        int oneTotal = 0;
        int twoTotal = 0;
        int factor = 1;
        while(temp != null){
            oneTotal = (factor*temp.val);
            factor *= 10;
            temp = temp.next;
        }
        temp = two;
        factor = 1;
        while(temp != null){
            twoTotal = (factor*temp.val);
            factor *= 10;
            temp = temp.next;
        }
        total = oneTotal+twoTotal;
        ListNode head = null;
        while(true){
            myList.add(total%10, head);
            total = total%10;
            if(total < 10){
                break;
            }
        }

        return head;
    }
}