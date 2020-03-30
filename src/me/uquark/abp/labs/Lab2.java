package me.uquark.abp.labs;

import java.util.Random;

public class Lab2 {
    private static class Matrix2x2 {
        private double[][] values;
        private static Random random = new Random();
        private static final int SIZE = 2;

        public Matrix2x2(Matrix2x2 matrix) {
            values = new double[SIZE][SIZE];
            for (int i=0; i < SIZE; i++)
                System.arraycopy(matrix.values[i], 0, values[i], 0, SIZE);
        }

        public Matrix2x2(boolean randomize) {
            values = new double[SIZE][SIZE];
            if (randomize)
                for (int i=0; i < SIZE; i++)
                    for (int j=0; j < SIZE; j++)
                        values[i][j] = random.nextInt(5);
        }

        public double determinant() {
            return values[0][0] * values[1][1] - values[0][1] * values[1][0];
        }

        public Matrix2x2 multiply(double value) {
            Matrix2x2 result = new Matrix2x2(this);
            for (int i=0; i < SIZE; i++)
                for (int j=0; j < SIZE; j++)
                    result.values[i][j] *= value;
            return result;
        }

        public Matrix2x2 multiply(Matrix2x2 matrix) {
            Matrix2x2 result = new Matrix2x2(false);
            for (int i=0; i < SIZE; i++)
                for (int j=0; j < SIZE; j++)
                    for (int r=0; r < SIZE; r++)
                        result.values[i][j] += values[i][r] * matrix.values[r][j];
            return result;
        }

        public Matrix2x2 add(Matrix2x2 matrix) {
            Matrix2x2 result = new Matrix2x2(this);
            for (int i=0; i < SIZE; i++)
                for (int j=0; j < SIZE; j++)
                    result.values[i][j] += matrix.values[i][j];
            return result;
        }

        public Matrix2x2 inverse() {
            double det = determinant();
            if (det == 0)
                return null;
            Matrix2x2 result = new Matrix2x2(false);
            result.values[0][0] = values[1][1];
            result.values[0][1] = - values[0][1];
            result.values[1][0] = - values[1][0];
            result.values[1][1] = values[0][0];
            return result.multiply(1 / det);
        }

        public void print() {
            for (int i=0; i < SIZE; i++) {
                for (int j=0; j < SIZE; j++) {
                    System.out.print(values[i][j]);
                    System.out.print("\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Matrix2x2 A = new Matrix2x2(true);
        Matrix2x2 B = new Matrix2x2(true);

        System.out.println("A = ");
        A.print();

        System.out.println("B = ");
        B.print();

        System.out.printf("det A = %f\n", A.determinant());
        System.out.printf("det B = %f\n", B.determinant());

        System.out.println("A + B = ");
        A.add(B).print();

        System.out.println("A * B = ");
        A.multiply(B).print();

        System.out.println("3 * A = ");
        A.multiply(3).print();

        System.out.println("A^(-1) = ");
        A.inverse().print();
    }
}
