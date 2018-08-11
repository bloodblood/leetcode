class Solution(object):
    def matrixScore(self, A):
        """
        :type A: List[List[int]]
        :rtype: int
        """
        m = len(A[0])
        n = len(A)
        i = 0
        while i < n:
            if A[i][0] == 0:
                j = 0
                while j < m:
                    A[i][j] = 1 - A[i][j]
                    j = j + 1
            i = i + 1
        i = 1
        while i < m:
            sumcolumn = 0
            for t in range(n):
                sumcolumn = sumcolumn + A[t][i]
            if sumcolumn < n / 2:
                j = 0
                while j < n:
                    A[j][i] = 1 - A[j][i]
                    j = j + 1
            i = i + 1

        totalsum = 0
        for z in range(n):
            for x in range(m):
                totalsum = totalsum + A[z][x] * self.compute(m - x - 1)
        return totalsum

    def compute(self, i):
        j = 0
        a = 1
        while j < i:
            a = a * 2
            j = j + 1
        return a


if __name__ == '__main__':
    A = [[0,1],[0,0]]
    print(Solution().matrixScore(A))

