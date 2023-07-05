package org.sber.matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    private static final Matrix matrix1;

    static {
        matrix1 = new Matrix(3, 3);
        matrix1.printMatrix();
        System.out.println();
    }

    static final Matrix matrix2;

    static {
        matrix2 = new Matrix(3, 3);
        matrix2.printMatrix();
        System.out.println();
    }

    @Test
    void setValue() {
        matrix1.setValue(2,2,2.3);
        matrix1.printMatrix();
        System.out.println();
    }

    @Test
    void sumTwoMatrix() {
        Matrix result = matrix1.sumTwoMatrix(matrix2);
        result.printMatrix();
        System.out.println();
    }

    @Test
    void multiplyNumber() {
        Matrix result = matrix1.multiplyNumber(2.0);
        result.printMatrix();
        System.out.println();
    }

    @Test
    void printMatrix() {
        matrix1.printMatrix();
    }

    @Test
    void multiplyMatrix() {
        Matrix result = matrix1.multiplyMatrix(matrix2);
        result.printMatrix();
    }
}
