public class FloydTriangle {
    public static void printFloydTriangle(int rows) {
        // printing floyd triangle
        int naturalNumber = 1;

        for(int row = 1; row <= rows; row++) {
            for(int column = 1; column <= row; column++) {
                System.out.print(naturalNumber + " ");
                naturalNumber++;
            }
            System.out.println();
        }
    }
}