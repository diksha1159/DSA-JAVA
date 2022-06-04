class NumberPyramid {
    public static void main(String[] args) {
        int r = 5, num = 1;

        for (int i = 0; i < r; i++) {
            for (int s = i; s < r; s++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.print("\n");

        }
    }
}