//TC O(1) && Double Linked List
public class QueueWithLinkedList {
    private ListNode head;
    private ListNode tail;

    public Integer poll(){
        if (head == null){
            return null;
        }
        else {
            int result = head.value;
            head = head.next;
            return result;
        }
    }

    public Integer peek(){
        return head.value;
    }

    public void offer(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }
}


class ListNode{
    int value;
    ListNode next;
    public ListNode(int value){
        this.value = value;
    }
}
