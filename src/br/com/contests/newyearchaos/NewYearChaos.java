package br.com.contests.newyearchaos;

public class NewYearChaos {


    public static void testCase() {
        int t = 2;

        int[] n = new int[t];
        n[0] = n[1] = 5;


        String[] s = new String[t];
        s[0] = "2 1 5 3 4";
        s[1] = "2 5 1 3 4";

        for (int tItr = 0; tItr < t; tItr++) {
            int[] q = new int[n[tItr]];

            String[] qItems = s[tItr].split(" ");

            for (int i = 0; i < n[tItr]; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }
    }

    static int merge(int[] arr, int[] temp,
                     int left, int mid, int right, int[] trunk) {
        int inv_count = 0;
        int i = left;
        int j = mid;
        int k = left;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                trunk[arr[i] - 1]++;
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }

        while (i <= mid - 1) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return inv_count;
    }

    static int _mergeSort(int[] arr, int[] temp,
                          int left, int right, int[] trunk) {

        int mid, inv_count = 0;
        if (right > left) {
            mid = (right + left) / 2;
            inv_count = _mergeSort(arr, temp, left, mid, trunk);
            inv_count += _mergeSort(arr, temp, mid + 1, right, trunk);
            inv_count += merge(arr, temp, left, mid + 1, right, trunk);
        }

        return inv_count;
    }

    static int countSwaps(int[] arr, int n, int[] trunk) {
        int[] temp = new int[n];

        return _mergeSort(arr, temp, 0, n - 1, trunk);
    }

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int[] trunk = new int[q.length];
        System.out.println(countSwaps(q, 5, trunk));

        System.out.println("HELLO");
    }
}
