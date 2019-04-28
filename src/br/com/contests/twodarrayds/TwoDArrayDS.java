package br.com.contests.twodarrayds;

public class TwoDArrayDS {
    public static void testCase() {
        int[][] arr = new int[6][6];

        String ent[] = new String[]{
                "-1 1 -1 0 0 0",
                "0 -1 0 0 0 0",
                "-1 -1 -1 0 0 0",
                "0 -9 2 -4 -4 0",
                "-7 0 0 -2 0 0",
                "0 0 -1 -2 -4 0"
        };

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = ent[i].split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(hourglassSum(arr));
    }

    // Complete the hourglassSum function below.
    private static int hourglassSum(int[][] arr) {
        int max = -9999999;
        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 5; j++) {
                int sum = 0;

                sum += (arr[i][j - 1] + arr[i][j] + arr[i][j + 1]);
                sum += arr[i + 1][j];
                sum += (arr[i + 2][j - 1] + arr[i + 2][j] + arr[i + 2][j + 1]);

                if (sum > max) max = sum;
            }
        }

        return max;
    }
}
