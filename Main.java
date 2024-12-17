class Array2D {
    public static void main(String[] args) {
        int[][] matriks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] baris : matriks) {
            for (int angka : baris) {
                System.out.print(angka + " ");
            }
            System.out.println();
        }
    }
}
