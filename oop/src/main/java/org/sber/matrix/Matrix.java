package org.sber.matrix;

public class Matrix {

    private final double[][] twoDimArray;
    private final int rowsCol;
    private final int columnsCol;

    public Matrix(int rows, int columns) {
        this.rowsCol = rows;
        this.columnsCol = columns;
        twoDimArray = new double[rows][columns];

        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int colIndex = 0; colIndex < columns; colIndex++) {
                twoDimArray[rowIndex][colIndex] = Math.random() % 10;
            }
        }
    }

    public void setValue(int rowIndex, int colIndex, double value) {
        if (rowIndex >= 0 && rowIndex < rowsCol && colIndex >= 0 && colIndex < columnsCol) {
            twoDimArray[rowIndex][colIndex] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public Matrix sumTwoMatrix(Matrix matrix2) {
        if (this.columnsCol != matrix2.rowsCol) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Matrix matrixSum = new Matrix(rowsCol, columnsCol);
        for (int rowIndex = 0; rowIndex < rowsCol; rowIndex++) {
            for (int colIndex = 0; colIndex < columnsCol; colIndex++) {
                double sum = this.twoDimArray[rowIndex][colIndex] + matrix2.twoDimArray[rowIndex][colIndex];
                matrixSum.setValue(rowIndex, colIndex, sum);
            }
        }
        return matrixSum;
    }

    public Matrix multiplyNumber (double mult) {
        Matrix matrixMulti = new Matrix(rowsCol, columnsCol);
        for (int rowIndex = 0; rowIndex < rowsCol; rowIndex++) {
            for (int colIndex = 0; colIndex < columnsCol; colIndex++) {
                matrixMulti.setValue(rowIndex, colIndex, this.twoDimArray[rowIndex][colIndex] * mult);
            }
        }
        return matrixMulti;
    }

    public void printMatrix () {
        for (int rowIndex = 0; rowIndex < rowsCol; rowIndex++) {
            for (int colIndex = 0; colIndex < columnsCol; colIndex++) {
                System.out.print(twoDimArray[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiplyMatrix (Matrix matrix2) {
        if (this.columnsCol != matrix2.rowsCol) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Matrix result = new Matrix(this.rowsCol, matrix2.columnsCol);
        for (int rowIndex = 0; rowIndex < this.rowsCol; rowIndex++) {
            for (int colIndex = 0; colIndex < matrix2.columnsCol; colIndex++) {
                double product = 0;
                for (int elementIndex = 0; elementIndex < this.columnsCol; elementIndex++) {
                    product += this.twoDimArray[rowIndex][elementIndex] * matrix2.twoDimArray[elementIndex][colIndex];
                }
                result.setValue(rowIndex, colIndex, product);
            }
        }

        return result;
    }
}