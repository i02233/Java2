package HomeWork2;

public class Main {
    public static void main(String[] args) {

        String[][] correctMatrix = {
                {"5", "4", "3", "2"},
                {"1", "8", "0", "11"},
                {"5", "6", "9", "5"},
                {"0", "8", "4", "3"}
        };

        String[][] wrongSizeMatrix = {
                {"5", "6", "4", "3"},
                {"4", "11", "7", "6"},
                {"15", "24", "56", "44"},
                {"1", "3"}
        };
        String[][] wrongCharMatrix = {
                {"6", "7", "5", "3"},
                {"6", "11", "8", "7"},
                {"X", "11", "4", "5"},
                {"11", "10", "8", "6"}
        };

        try {
            System.out.println("Вариант 1: Корректный массив");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(correctMatrix) + ".\n");
        } catch (CustomException e) {
            e.getMessage();
        }

        try {
            System.out.println("Вариант 2: Нарушена размерность массива");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 3: В массиве есть не числовые значения");
            System.out.println("Сумма всех элементов массива равна " + Converter.strConverter(wrongCharMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}
