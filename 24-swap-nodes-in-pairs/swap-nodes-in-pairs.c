/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 
struct ListNode* swapPairs(struct ListNode* head) {
    struct ListNode* temp = head;

    while (temp != NULL && temp->next != NULL) {
        int k = temp->val;
        temp->val = temp->next->val;
        temp->next->val = k;

        temp = temp->next->next;
    }
    
    return head;
}