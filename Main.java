import Check.CheckArray;
import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;


public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        CheckArray checkArray = new CheckArray();

        String[][] arr = new String[4][4];
        arr[0][0] = "1";
        arr[0][1] = "1";
        arr[0][2] = "1";
        arr[0][3] = "1";
        arr[1][0] = "1";
        arr[1][1] = "1";
        arr[1][2] = "1";
        arr[1][3] = "1";
        arr[2][0] = "1";
        arr[2][1] = "1";
        arr[2][2] = "1";
        arr[2][3] = "1";
        arr[3][0] = "1";
        arr[3][1] = "1";
        arr[3][2] = "1";
        arr[3][3] = "1";

        String[][] arr1 = {{"1", "2"}, {"1", "2"}};
        try {
            checkArray.checkArray(arr);
        } catch (MyArrayDataException | MyArraySizeException e){
            e.printStackTrace();
        }
        System.out.println();
        try {
            checkArray.checkArray(arr1);
        } catch (MyArrayDataException | MyArraySizeException e){
            e.printStackTrace();
        }
    }


}
