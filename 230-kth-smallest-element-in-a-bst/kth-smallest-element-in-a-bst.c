/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 int result;
int count;

void traverse(struct TreeNode* root, int k) {
    if (root == NULL || count >= k) return;

    traverse(root->left, k);

    count++;
    if (count == k) {
        result = root->val;
        return;
    }

    traverse(root->right, k);
}

int kthSmallest(struct TreeNode* root, int k) {
    count = 0;
    traverse(root, k);
    return result;
}
