//Задан отсортированный список который состоит из ListNode.
//Написать метод deleteDuplicates, который вернет список без дубликатов.

package chrvk.javaelementary.hw15.task2;

public class Main {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null) {
            ListNode tmp = curr;
            while (tmp != null && tmp.val == curr.val) {
                tmp = tmp.next;
            }
            curr.next = tmp;
            curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println(head);
        System.out.println(deleteDuplicates(head));
    }
}
