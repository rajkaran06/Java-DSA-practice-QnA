public class printInSnakePattern {

    public static void main(String[] args) {

        int[][] arr = {
            {6, 7, 8, 9},
            {1, 2, 34, 5},
            {4, 7, 3, 7, 8}
        };

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }

            } else {

                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }

            }

            System.out.println();
        }
    }
}