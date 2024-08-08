public class singleLinkList {

    private ListNode head;
    
    
    private static class ListNode
    {
        private int data; //generic type
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        singleLinkList sll = new singleLinkList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode four = new ListNode(11);

        // connect 4 list nodes to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third; //10 --> 1 --> 8
        third.next = four; //10 --> 1 --> 8 --> 11 --> null
        
    }

}