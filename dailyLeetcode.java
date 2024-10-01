class dailyleetcode {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int num : arr) {
            int rem = num % k;
            if (rem < 0) {
                rem += k;
            }
            freq[rem]++;
        }

        // Check if the frequency of remainder 0 is even
        if (freq[0] % 2 != 0) {
            return false;
        }

        // Check pairs of remainders
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }

        return true;
    }
}
