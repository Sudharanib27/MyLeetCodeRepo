class Solution:
    def reorderLogFiles(self, logs: List[str]) -> List[str]:
        
        def sort_alpha(log):
            idx = log.index(' ') + 1
            if log[idx].isalpha():
                return (0, log[idx:], log[:idx])
            return (1,)

        return sorted(logs, key=sort_alpha)