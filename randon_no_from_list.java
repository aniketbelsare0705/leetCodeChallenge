/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *Given a singly linked list, return a random node's value from the linked list. Each node must have the same probability of being chosen.
 *Implement the Solution class:
 *olution(ListNode head) Initializes the object with the integer array nums.
 *int getRandom() Chooses a node randomly from the list and returns its value. All the nodes of the list should be equally likely to be choosen.

 

* *Example 1:

*Input
*["Solution", "getRandom", "getRandom", "getRandom", "getRandom", "getRandom"]
*[[[1, 2, 3]], [], [], [], [], []]
*Output
*[null, 1, 3, 2, 2, 3]

*Explanation
*Solution solution = new Solution([1, 2, 3]);
*solution.getRandom(); // return 1
*solution.getRandom(); // return 3
*solution.getRandom(); // return 2
*solution.getRandom(); // return 2
*solution.getRandom(); // return 3
* getRandom() should return either 1, 2, or 3 randomly. Each element should have equal probability of returning.
 */
class Solution {

    public Solution(ListNode head) {
        while (head != null) {
            this.range.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
         int pick = (int)(Math.random() * this.range.size());
        return this.range.get(pick); 
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
