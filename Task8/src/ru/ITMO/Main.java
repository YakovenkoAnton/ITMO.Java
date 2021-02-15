package ru.ITMO;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {2, 30, 4},
                {5, 6, 700}};
        int max = 0;
        int maxRow=0, sum = 0;


        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (max < arr[i][j]) max = arr[i][j];
                    if (arr[i][j] < 0) throw new ArithmeticException("Отрицательное значение");
                    sum = sum + arr[i][j];
                }
                if (maxRow < sum) maxRow = sum;
                sum = 0;
            }
            System.out.println("Максимальный элемент: " + max);
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


        if (arr.length == arr[0].length)
            System.out.println("Массив является квадратным. Строк " + arr.length + ", столбцов " + arr[0].length);
        System.out.println("Максимальная сумма строк " + maxRow);

    }

}
