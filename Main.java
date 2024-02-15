import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //EX1
//        int[] array = {50, -20, 0, 30, 40, 60, 10};
//
//        boolean result = array.length >= 2 && array[0] == array[array.length - 1];
//
//        System.out.println("Are the first and last elements same? " + result);
//    }


        //EX2
//        int[] array = {1, 4, 17, 7, 25, 3, 100};
//
//        double sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        double average = array.length > 0 ? sum / array.length : 0; // في حاله ان المصفوفه فارغه يتجنب القسمه ع 0 0؟
//
//        System.out.println("The average: " + average);
//
//        System.out.print("Numbers greater than the average: ");
//        for (int num : array) {
//            if (num > average) {
//                System.out.print(num + " ");


        //EX3

//        int[] array = {20, 30, 40};
//
//        int first = array[0];  // القيمة الأولى في المصفوفة
//
//        int last = array[array.length - 1];  // القيمة الأخيرة في المصفوفة
//
//        int largerValue = Math.max(first, last); // يحصل ع القيمه الاكبر بينهم  Math.max
//
//        System.out.println("Larger value between first and last element: " + largerValue);
//    }

        //EX4

//        int[] originalArray = {20, 30, 40};
//
//        int temp = originalArray[0]; // العنصر الاول في المصفوفه
//        originalArray[0] = originalArray[originalArray.length - 1]; // يبدل العنصر الاول مع الاخير
//        originalArray[originalArray.length - 1] = temp; // يكمل عمليه التبديل العنصر الاخير الى العنصر الاول
//
//        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(originalArray));
//    }

        //EX5
//        int[] array = {2, 3, 40, 1, 5, 9, 4, 10, 7};
//
//        // ترتيب الأرقام الفردية قبل الأرقام الزوجية
//        int[] sortedArray = new int[array.length]; // تخزن الارقام في مصفوفه جديده
//        int oddIndex = 0; // الزوجيه
//        int evenIndex = array.length - 1; // للارقام الفرديه من الاري الى طرح 1
//
//        for (int num : array) {
//            if (num % 2 != 0) { // اذا قسمنا ع اثنين لايساوي صفر يتحقق الشرط يعني عدد فردي
//                sortedArray[oddIndex++] = num;// نضع الفردي هنا
//            } else { // اذا كان مو فردي يعني زوجي
//                sortedArray[evenIndex--] = num;// نحط الزوجي هنا
//            }
//        }
//        for (int num : sortedArray) { //  بعد الترتيب
//            System.out.print(num + " ");
//        }}}

        //EX6

//        int[] array1 = {2, 3, 6, 6, 4};
//        int[] array2 = {2, 3, 6, 6, 4};
//
//        boolean isEqual = Arrays.equals(array1, array2);
//
//        System.out.println(isEqual);
//    }}
    
