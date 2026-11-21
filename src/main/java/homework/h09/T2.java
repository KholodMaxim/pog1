class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 1. Знаходимо найбільше число цукерок
        int max = 0;
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }

        // 2. Перевіряємо кожну дитину
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            if (c + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}