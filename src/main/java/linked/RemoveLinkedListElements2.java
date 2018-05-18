package linked;


/**
 * 移除链表中的元素
 *
 * @author xiaozefeng
 * @date 2018/5/10 下午10:13
 */
public class RemoveLinkedListElements2 {

    public ListNode removeElements(ListNode head, int val) {
        // 虚拟头节点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }
}
