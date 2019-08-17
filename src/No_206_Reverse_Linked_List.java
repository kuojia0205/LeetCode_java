public class No_206_Reverse_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        Stack st = new Stack();
        ListNode pointer = head;
        while(pointer != null)
        {
            st.push(pointer.val);
            pointer = pointer.next;
        }
        ListNode new_head = new ListNode(0);
        pointer = new_head;
        int num = st.N;
        for(int i=0; i<num; i++)
        {
            pointer.val = st.pop();
            if(i!=num-1)
            {
                pointer.next = new ListNode(0);
                pointer = pointer.next;
            }
        }
        return new_head;
    }

    public class Stack
    {
        private Node first;
        private int N;
        private class Node
        {
            Integer item;
            Node next;
        }
        private void push(int x)
        {
            Node oldfirst = first;
            first = new Node();
            first.item = x;
            first.next = oldfirst;
            N++;
        }
        private int pop()
        {
            int ans = first.item;
            first = first.next;
            N--;
            return ans;
        }
    }
}
