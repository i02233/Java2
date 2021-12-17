package HomeWork2;

public class MyArrayDataException extends CustomException {
    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные находятся в строке [%d], в столбце [%d]\n", row + 1, col + 1));
    }
}
