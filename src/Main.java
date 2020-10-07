import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                 // time for a new row}
//0 0
//0 0
//0 0
        }


        int[] strings = {10, 9, 100};
        Arrays.sort(strings);
        for (int string : strings)
            System.out.println(string + " ");


        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
// Строка 24 ищет индекс 4, который равен 1.
        // строка 27 хочет сказать нам, что 9 нужно вставить в индекс 4.
        // Мы снова отрицаем и вычитаем 1, получая –4 –1, также известную как –5
    }
}
