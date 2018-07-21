class Solution(object):
    def toLowerCase(self, str):
        res = ''
        for i,c in enumerate(str):
            if ( c >= 'A' and c <= 'Z'):
                res += chr(ord(c) - ord('A') + ord('a'))
            else:
                res += c
        return res


if __name__ == '__main__':
    str = "AAc"
    print(Solution.toLowerCase(0, str))
