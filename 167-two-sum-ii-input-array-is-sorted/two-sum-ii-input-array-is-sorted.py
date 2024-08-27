class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        low, high = 1, len(numbers)

        while low < high:
            total = numbers[low-1] + numbers[high-1]

            if total == target:
                return [low, high]
            
            elif total > target:
                high -= 1
            
            else:
                low += 1
        