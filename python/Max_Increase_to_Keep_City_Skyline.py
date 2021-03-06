class Solution(object):
    def maxIncreaseKeepingSkyline(self, grid):
        max_h = []
        max_v = []
        sum_plus = 0
        for i in range(len(grid)):
             max_h.append(max(grid[i]))
        for i in range(len(grid[0])):
            max_v.append(max(x[i] for x in grid))

        for i in range(len(grid)):
            for j in range(len(grid)):
                sum_plus = sum_plus + min(max_h[i], max_v[j]) - grid[i][j]
        return sum_plus


if __name__ == '__main__':
    grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    print(Solution().maxIncreaseKeepingSkyline(grid))