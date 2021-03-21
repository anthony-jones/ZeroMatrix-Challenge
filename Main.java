import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] testInput = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 0, 11}, {12, 13, 14, 15}};
        printArray(testInput);
        System.out.println();
        printArray(zeroMatrix(testInput));
    }
  
// OUTPUT:
// [0, 1, 2, 3]
// [4, 5, 6, 7]
// [8, 9, 0, 11]
// [12, 13, 14, 15]

// [0, 0, 0, 0]
// [0, 5, 0, 7]
// [0, 0, 0, 0]
// [0, 13, 0, 15]

    public static int[][] zeroMatrix(int[][] array){
        int totalRows = array.length;
        int totalColumns = array[0].length;

        ArrayList<Integer> zeroRowList = new ArrayList<>();
        ArrayList<Integer> zeroColList = new ArrayList<>();

        for(int row = 0; row < totalRows; row++){
            for(int column = 0; column < totalColumns; column++){
                if(array[row][column] == 0){
                    zeroRowList.add(row);
                    zeroColList.add(column);
                }
            }
        }
        for(int row = 0; row < totalRows; row++){
            for(int column = 0; column < totalColumns; column++){
                if(zeroRowList.contains(row) || zeroColList.contains(column)){
                    array[row][column] = 0;
                } else {
                    array[row][column] = array[row][column];
                }
            }
        }
        return array;
    }

    public static void printArray(int[][] input){
        for (int[] ints : input) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
