class Solution(object):
    def uniqueMorseRepresentations(self, words):
        key = [".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
               ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."]
        codes = []
        n = 0
        for word in words:
            temp = []
            for i in word:
                s = ord(i) - 97
                temp.append(key[s])
            codes.append(''.join(temp))
        codes = list(set(codes))
        return len(codes)
