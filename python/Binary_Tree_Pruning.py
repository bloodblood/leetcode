# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def pruneTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        self.reprune(root)
        return root



    def reprune(self, root):
        if root is None:
            return True
        leftprune = True
        rightprune = True
        if root.left is not None:
            leftprune = self.reprune(root.left)
            if leftprune:
                root.left = None
        if root.right is not None:
            rightprune = self.reprune(root.right)
            if rightprune:
                root.right = None
        return root.val == 0 and leftprune and rightprune

