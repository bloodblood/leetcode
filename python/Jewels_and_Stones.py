class Solution(object):
    numJewelsInStones = lambda self, J, S: sum(s in J for s in S)


if __name__ == '__main__':
    J = 'aA'
    S = 'ABb'
    print(Solution.numJewelsInStones(0, J, S))
