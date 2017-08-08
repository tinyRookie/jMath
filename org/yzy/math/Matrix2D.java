package org.yzy.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangzhiyue on 17/7/15.
 */
public class Matrix2D<T> implements Matrix<T> {
    private int row;
    private int column;
    private Number[][] data = null;
    private static final int DIMENSION = 2;
    public Matrix2D(){
        this(10, 10);// default row and column are set to be 10 and 10
    }
    public Matrix2D(int row, int column){
        initialize(row, column);
    }
    public Matrix2D(T[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j=0; j<arr[0].length; j++){

            }
        }
    }
    private void initialize(int row, int column){
        data = new Number[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++) data[i][j] = 0;
        }
    }
    @Override
    public int getDimension() {
        return DIMENSION;
    }



    @Override
    public T getDeterminant() {
        return null;
    }

    public String toString(){
        String result = "";
        for(int i = 0; i < row; i++){
            for(int j=0; j < column; j++){
                result += data[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String args[]){
        Matrix<Integer> matrix = new Matrix2D<>();
        System.out.println(matrix);
    }
}
