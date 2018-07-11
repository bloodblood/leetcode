class Solution(object):
    numJewelsInStones = lambda self, J, S: sum(s in J for s in S)
