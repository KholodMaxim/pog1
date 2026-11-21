class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101]; // за умовою 1 <= nums[i] <= 100
        int result = 0;

        for (int num : nums) {
            result += count[num]; // скільки таких самих чисел уже було раніше
            count[num]++;
        }

        return result;
    }
}