class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l = 0, r = nums.size() - 1, count = 0;
        while (l < r) {
            if (nums.get(l) + nums.get(r) < target) {
                count += r - l;
                l++;
            } else {
                r--;
            }
        }
        return count;
    }
}