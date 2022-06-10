import org.testng.annotations.Test;

import java.util.Arrays;

public class IntSorting {
    @Test
    public void intSortingLesson(){
        int[] numbers = {10, 2, 3, 6, 5, 4, 7, 8, 9, 1};

        Arrays.sort(numbers, 0, 10);
        System.out.println(numbers[numbers.length-10]+"- найменше значення");
        System.out.println(Arrays.toString(numbers)+"- сортування чисел");
        System.out.println(Arrays.binarySearch(numbers, 4)+"- індекс цифри 4");
        System.out.println(numbers.length +"- кількість значень");

    }
}
