public class No_148_Sort_List {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = slow;
        slow = slow.next;
        fast.next = null;
        fast = sortList(head);
        slow = sortList(slow);
        return merge(fast,slow);
    }

    public static ListNode merge(ListNode head_1, ListNode head_2)
    {
        if(head_1 == null)
            return head_2;
        if(head_2 == null)
            return head_1;
        ListNode res, p;

        if(head_1.val < head_2.val)
        {
            res = head_1;
            head_1 = head_1.next;
        }
        else
        {
            res = head_2;
            head_2 = head_2.next;
        }
        p = res;

        while(head_1 != null && head_2 != null)
        {
            if(head_1.val < head_2.val)
            {
                p.next = head_1;
                head_1 = head_1.next;
            }
            else
            {
                p.next = head_2;
                head_2 = head_2.next;
            }
            p = p.next;

        }
        if(head_1 != null)
            p.next = head_1;
        else if(head_2 != null)
            p.next = head_2;
        return res;
    }
}
