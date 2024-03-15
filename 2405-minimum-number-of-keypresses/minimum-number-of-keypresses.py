class Solution:
    def minimumKeypresses(self, s: str) -> int:
        count = Counter(s)
        print(count)
        total = 0
        i = 0
        click = 1
        for l in sorted(count.values(), reverse = True):
            i += 1
            total += l * click
            print(l)
            if i%9 == 0:
                click += 1
        
        return total