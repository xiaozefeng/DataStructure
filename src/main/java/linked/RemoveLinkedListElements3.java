package linked;


/**
 * 移除链表中的元素
 *
 * @author xiaozefeng
 * @date 2018/5/10 下午10:13
 */
public class RemoveLinkedListElements3 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
