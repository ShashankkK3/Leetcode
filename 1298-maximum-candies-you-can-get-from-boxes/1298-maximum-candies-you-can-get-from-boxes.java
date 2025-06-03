class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < initialBoxes.length; i++) {
            if (status[initialBoxes[i]] == 1)
                dq.addFirst(initialBoxes[i]);
            else
                dq.addLast(initialBoxes[i]);
        }

        int sum = 0;
        while (!dq.isEmpty()) {
            int currBox = dq.removeFirst();
            if (status[currBox] == 0)
                break;

            sum += candies[currBox];

            for (int key : keys[currBox])
                status[key] = 1;

            for (int box : containedBoxes[currBox]) {
                if (status[box] == 1)
                    dq.addFirst(box);
                else
                    dq.addLast(box);
            }
        }

        return sum;
    }
}