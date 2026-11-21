class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        for (int h : heights) freq[h]++;

        int count = 0, cur = 1;
        for (int h : heights) {
            while (freq[cur] == 0) cur++;   // следующий рост в отсортированном порядке
            if (h != cur) count++;
            freq[cur]--;
        }
        return count;
    }
}