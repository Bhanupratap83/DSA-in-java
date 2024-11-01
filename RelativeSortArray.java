public class RelativeSortArray{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int max = 0;
        for (int num : arr1) {
            if (num > max) {
            max = num;
            }
        }
        int[] count = new int[max + 1];
        for (int num : arr1) {
            count[num]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            while (count[num] > 0) {
                result[index++] = num;
                count[num]--;
            }
        }

        for (int num = 0; num <= max; num++) {
            while (count[num] > 0) {
                result[index++] = num;
                count[num]--;
            }
        }

        return result;
    }
}