package Check;

import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class CheckArray {
    public void checkArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        String a;
        CheckString checkString = new CheckString();

        if (arr.length != 4)
            throw new MyArraySizeException("Размер массива не соответствует условию(размер должен быть 4 х 4)");
        else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    a = arr[i][j];
                    if (!checkString.checkString(a))
                        throw new MyArrayDataException("Значение не преобразуется в int, элемент arr[" + i + "][" + j + "]");
                    else
                        sum += Integer.parseInt(a);
                }
            }
        }
        System.out.println(sum);

    }
}
