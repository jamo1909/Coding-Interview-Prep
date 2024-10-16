/**
 * @Author James Murphy (Jmurph08)
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 *
 * Example 2:
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 **/

public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode MergeList = new ListNode(0); //Declare Single linked list that will be used to merge the two lists
        ListNode tail = MergeList; //Point to tail

        while(list1 != null && list2 != null){ //While the two inputted lists are not null
            if (list1.val < list2.val) { //If the node at the start of list 1 is smaller that the node at the start of list 2
                tail.next = list1; //let the tail of our merge list point to the node of list 1 because it is smaller
                list1 = list1.next;//Point list 1 to the next node
            } else {//If the node at the start of list 2 is smaller that the node at the start of list 1
                tail.next = list2;//let the tail of our merge list point to the node of list 2 because it is smaller
                list2 = list2.next;//Point list 2 to the next node
            }
            tail = tail.next;//Move to the next node
        }

        // If one of the lists is not empty, append the remaining elements
        if (list1 != null) {
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        // Return the merged list, starting from dummy.next (skip the dummy node)
        return MergeList.next;
    }
}
