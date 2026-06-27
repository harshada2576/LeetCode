class Solution {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // Base case: If list is empty or has only one node, no pairs exist
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        // Traverse the list and look at adjacent pairs
        while (current != null && current.next != null) {
            // 1. Calculate GCD of current node and the next node
            int gcdValue = gcd(current.val, current.next.val);

            // 2. Create the new node with the GCD value
            ListNode gcdNode = new ListNode(gcdValue);

            // 3. Insert gcdNode between current and current.next
            gcdNode.next = current.next;
            current.next = gcdNode;

            // 4. Move current forward by TWO steps (skip the newly inserted node)
            current = gcdNode.next;
        }

        return head;
    }

    // Helper function to calculate GCD using the Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
