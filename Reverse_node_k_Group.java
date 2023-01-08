import java.util.Stack;

public class Reverse_node_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode trav = dummy;
        ListNode rem = null;

        while (head != null) {
            if (stack.size() == 0)
                rem = head;

            stack.push(head);
            if (stack.size() == k) {
                while (!stack.isEmpty()) {
                    dummy.next = new ListNode(stack.pop().val);
                    dummy = dummy.next;
                }
            }

            head = head.next;
        }

        if (!stack.isEmpty())
            dummy.next = rem;

        return trav.next;
    }
}