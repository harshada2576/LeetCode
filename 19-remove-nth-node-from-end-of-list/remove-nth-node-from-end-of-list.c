/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if (!head) return NULL;

    // Step 1: Count length
    int length = 0;
    struct ListNode* temp = head;
    while (temp) {
        length++;
        temp = temp->next;
    }

    // Step 2: Find position to remove (from start)
    int pos = length - n;

    // Special case: remove head
    if (pos == 0) {
        struct ListNode* newHead = head->next;
        return newHead;
    }

    // Step 3: Traverse to node before the one to remove
    temp = head;
    for (int i = 1; i < pos; i++) {
        temp = temp->next;
    }

    // Step 4: Remove node
    if (temp->next) {
        temp->next = temp->next->next;
    }

    // Always return head (unless we removed it earlier)
    return head;
}