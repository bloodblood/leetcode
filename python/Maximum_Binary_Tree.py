# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):

    def constructMaximumBinaryTree(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        if not nums:
            return None
        maxnum, index = self.findMax(nums)
        node = TreeNode(maxnum)
        node.left = self.constructMaximumBinaryTree(nums[:index])
        node.right = self.constructMaximumBinaryTree(nums[index + 1:])
        return node

    def findMax(self, num):
        index = 0
        maxnum = num[0]
        for i, e in enumerate(num):
            if e > maxnum:
                maxnum = e
                index = i
        return maxnum, index
