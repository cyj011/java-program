package huiwenlianbiao;

public class huiwenlianbiao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode p = head;
        ListNode q = head;
        while(q != null && q.next != null) {
            if(q.next.next != null) {
                p = p.next;
                q = q.next.next;
            }
            else 
                q = q.next;
        }
        q = reverse(p);
        p.next = null;
        while(head != null) {
            if(head.val != q.val)
                return false;
            head = head.next;
            q = q.next;
        }
        return true;
    }
    public ListNode reverse(ListNode node) {
        ListNode head = new ListNode();
        head.next = null;
        ListNode p = node;
        ListNode q = p.next;
        while(p != null) {
            p.next = head.next;
            head.next = p;
            p = q;
            if(q != null)
                q = q.next;
        }
        return head.next;
    }
}