package shanchuchongfu;

public class shanchuchongfu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
lass Solution {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head ==null) {
    		return null;
    	}else if(heaf.next==null) {
    	    return head;
    	}else if(head.val==head.next.val) {
    		head =deleteDuplicates(head.next);
    	}else {
    		head.next=deleteDuplicates(head.next);
    	}
    	return head;
    }
}