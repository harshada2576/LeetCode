struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode *ptr1, *ptr2, *dup;
    ptr1 = head;

    // Pick nodes one by one
    while (ptr1 != NULL && ptr1->next != NULL) {
        ptr2 = ptr1;

        // Compare the picked node (ptr1) with the rest of the list
        while (ptr2->next != NULL) {
            if (ptr1->val == ptr2->next->val) {
                // Duplicate found! Save it to free memory later
                dup = ptr2->next;
                // Skip the duplicate node
                ptr2->next = ptr2->next->next;
                free(dup);
            } else {
                // No duplicate, just move to the next node
                ptr2 = ptr2->next;
            }
        }
        ptr1 = ptr1->next;
    }
    return head;
}
