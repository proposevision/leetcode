package binary_search;

import java.util.Arrays;

public class FindRightInterval436 {
    /*
       The main idea is to keep the reference of minOf(interval[0])
       1.for example, we have [[5,7],[2,5],[1,2]], result is [-1,0,1]
       the minOfStartPoint is 1,
       the maxOfEndPoint is 7
       2.now we keep an array size (7-1+1) with default value [-1,-1,-1,-1,-1,-1,-1]
       3.calculate the diff then set the index [2,1,-1,-1,0,-1,-1]
       4.fill the array [2,1,0,0,0,-1,-1]
       5. return the result,
       for [5,7], result is array[7-1] = -1
       for [2,5], result is array[5-1] =  0
       for [1,2], result is array[2-1] =  1
     */
    public int[] findRightInterval(int[][] intervals) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // O(n) find the smallest start point and the max of end point
        for (int[] ints : intervals) {
            max = Math.max(max, ints[1]);
            min = Math.min(min, ints[0]);
        }
        final int minOfStartPoint = min;
        // S(max-min+1)
        final int[] rangeArrayOfIndex = new int[max - minOfStartPoint + 1];
        Arrays.fill(rangeArrayOfIndex, -1);
        // O(n)
        for (int index = 0; index < intervals.length; index++) {
            rangeArrayOfIndex[intervals[index][0] - minOfStartPoint] = index;
        }
        // O(max-min) to fill the range with index
        for (int index = rangeArrayOfIndex.length - 2; index >= 0; index--) {
            if (rangeArrayOfIndex[index] == -1) {
                rangeArrayOfIndex[index] = rangeArrayOfIndex[index + 1];
            }
        }
        // O(n)
        return Arrays.stream(intervals).mapToInt(ints ->
                rangeArrayOfIndex[ints[1] - minOfStartPoint]
        ).toArray();
    }
    /*
    public int[] findRightInterval(int[][] intervals) {
        // S(n) key is index, value is the START ELEMENT
        final List<Pair<Integer, Integer>> listOfPairIndexAndStart = new ArrayList<>();
        // O(n)
        for (int index = 0; index < intervals.length; index++) {
            listOfPairIndexAndStart.add(new Pair(index, intervals[index][0]));
        }
        // O( nlog(n) )
        listOfPairIndexAndStart.sort(Comparator.comparing(Pair::getValue));
        // O( nlog(n) )
        return Arrays.stream(intervals).mapToInt(ints ->
                search(listOfPairIndexAndStart, ints[ints.length - 1])
        ).toArray();
    }

    public int search(List<Pair<Integer, Integer>> nums, int target) {
        if (nums == null || nums.size() == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.size() - 1;
        while (left + 1 < right) {
            final int mid = left + (right - left) / 2;
            if (nums.get(mid).getValue() == target) {
                return nums.get(mid).getKey();
            } else if (nums.get(mid).getValue() < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (nums.get(left).getValue() >= target) {
            return nums.get(left).getKey();
        }
        if (nums.get(right).getValue() >= target) {
            return nums.get(right).getKey();
        }
        return -1;
    }
    */
    /*
    public int[] findRightInterval(int[][] intervals) {
        return Arrays.stream(intervals).mapToInt(ints -> {
            int result = -1;
            int minDiff = Integer.MAX_VALUE;
            for (int index = 0; index < intervals.length; index++) {
                final int diff = intervals[index][0] - ints[ints.length - 1];
                if (diff >= 0 && diff < minDiff) {
                    minDiff = diff;
                    result = index;
                }
            }
            return result;
        }).toArray();
    }
     */
}
