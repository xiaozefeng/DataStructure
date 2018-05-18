package linked;


/**
 * 移除链表中的元素
 *
 * @author xiaozefeng
 * @date 2018/5/10 下午10:13
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            //ListNode delNode = head;
            //head = head.next;
            //delNode.next = null;
            // 相等于
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                //ListNode delNode = prev.next;
                //prev.next = delNode.next;
                //delNode.next = null;
                //相当于
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }
}
