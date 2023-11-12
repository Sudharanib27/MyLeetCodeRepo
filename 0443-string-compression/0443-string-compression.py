class Solution:
    def compress(self, chars: List[str]) -> int:
        chars.append("temp")
        s = ""
        i = 0
        count = 1
        print((chars))
        while i < len(chars)-1:
            if chars[i] == chars[i+1]:
                count +=1

            elif chars[i] != chars[i+1]:
                s +=chars[i]

                if count>1:
                    s +=str(count)
                    count = 1

            i+=1

        chars.clear()

        for x in s:
            chars.append(x)

        return len(chars)