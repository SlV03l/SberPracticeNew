package org.sber.matrix;

import org.junit.jupiter.api.Test;

class MatrixTest {
    private static final Matrix MATRIX_ONE;

    static {
        MATRIX_ONE = new Matrix(3, 3);
        MATRIX_ONE.printMatrix();
        System.out.println();
    }

    static final Matrix MATRIX_TWO;

    static {
        MATRIX_TWO = new Matrix(3, 3);
        MATRIX_TWO.printMatrix();
        System.out.println();
    }

    @Test
    void setValue() {
        MATRIX_ONE.setValue(2,2,2.3);
        MATRIX_ONE.printMatrix();
        System.out.println();
    }

    @Test
    void sumTwoMatrix() {
        Matrix result = MATRIX_ONE.sumTwoMatrix(MATRIX_TWO);
        result.printMatrix();
        System.out.println();
    }

    @Test
    void multiplyNumber() {
        Matrix result = MATRIX_ONE.multiplyNumber(2.0);
        result.printMatrix();
        System.out.println();
    }

    @Test
    void printMatrix() {
        MATRIX_ONE.printMatrix();
    }

    @Test
    void multiplyMatrix() {
        Matrix result = MATRIX_ONE.multiplyMatrix(MATRIX_TWO);
        result.printMatrix();
    }
}
