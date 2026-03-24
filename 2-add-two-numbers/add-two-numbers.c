/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *head = NULL;
    struct ListNode *p, *q = NULL; 
    int carry = 0;

    while (l1 || l2 || carry != 0) {
        p = malloc(sizeof(struct ListNode)); // Allocate memory for a new node
        p->next = NULL;

        if (l1) {
            carry += l1->val;
            l1 = l1->next;
        }
        if (l2) {
            carry += l2->val;
            l2 = l2->next;
        }

        p->val = carry % 10;
        carry = carry / 10;

        if (!head) {
            head = p;
        } else {
            q->next = p;
        }
        q = p;
    }
    return head;
}
