public class No_234_Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Stack st = new Stack();

        ListNode p_1 = head;
        ListNode p_2 = slow.next;
        int count = 0;
        while(p_1 != slow)
        {
            st.push(p_1.val);
            p_1 = p_1.next;
            count++;
        }
        if(fast.next != null)
            st.push(slow.val);
        while(p_2 != null)
        {
            if(st.pop() != p_2.val)
                return false;
            p_2 = p_2.next;
        }
        if(st.N != 0)
            return false;
        return true;
    }
    public class Stack
    {
        private ListNode first;
        private int N;

        private void push(int item)
        {
            ListNode oldfirst = first;
            first = new ListNode(item);
            first.next = oldfirst;
            N++;
        }

        private int pop()
        {
            int ans = first.val;
            first = first.next;
            N--;
            return ans;
        }
    }
}
