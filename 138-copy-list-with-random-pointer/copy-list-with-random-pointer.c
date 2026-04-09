struct Node* copyRandomList(struct Node* head) {
    if (head == NULL) return NULL;

    struct Node* curr = head;

    // Step 1: Insert copied nodes in between
    while (curr != NULL) {
        struct Node* copy = (struct Node*)malloc(sizeof(struct Node));
        copy->val = curr->val;
        copy->next = curr->next;
        copy->random = NULL;

        curr->next = copy;
        curr = copy->next;
    }

    // Step 2: Assign random pointers
    curr = head;
    while (curr != NULL) {
        if (curr->random != NULL) {
            curr->next->random = curr->random->next;
        }
        curr = curr->next->next;
    }

    // Step 3: Separate the copied list
    curr = head;
    struct Node* copyHead = head->next;

    while (curr != NULL) {
        struct Node* copy = curr->next;
        curr->next = copy->next;

        if (copy->next != NULL) {
            copy->next = copy->next->next;
        }

        curr = curr->next;
    }

    return copyHead;
}