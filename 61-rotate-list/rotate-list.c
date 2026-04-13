/**
 * Definition for singly-linked list.
 */

struct ListNode* rotateRight(struct ListNode* head, int k) {
    
    // Edge cases
    if (head == NULL || head->next == NULL || k == 0)
        return head;

    // Step 1: Find length and last node
    int length = 1;
    struct ListNode* tail = head;

    while (tail->next != NULL) {
        tail = tail->next;
        length++;
    }

    // Step 2: Make circular
    tail->next = head;

    // Step 3: Reduce k
    k = k % length;

    // Step 4: Find new tail
    int steps = length - k;
    struct ListNode* newTail = head;

    for (int i = 1; i < steps; i++) {
        newTail = newTail->next;
    }

    // Step 5: Set new head
    struct ListNode* newHead = newTail->next;

    // Break the circle
    newTail->next = NULL;

    return newHead;
}