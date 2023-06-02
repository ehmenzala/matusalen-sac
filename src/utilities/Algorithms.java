package utilities;

import java.util.Arrays;
import java.util.stream.Stream;

public class Algorithms {
    
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }

    public static String[] insertionSortStrings(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String currentVal = arr[i];
            int j = i;

            while (j > 0 && (arr[j - 1].compareTo(currentVal)) > 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = currentVal;
        }
        return arr;
    }

    public static int[] quicksort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        } else {
            int pivotIndex = arr.length / 2;
            int pivot = arr[pivotIndex];

            int[] less = Arrays.stream(arr)
                    .filter(element -> element <= pivot && element != pivot)
                    .toArray();
            int[] greater = Arrays.stream(arr)
                    .filter(element -> element > pivot)
                    .toArray();

            return Stream.of(
                    quicksort(less),
                    new int[]{pivot},
                    quicksort(greater))
                    .flatMapToInt(Arrays::stream)
                    .toArray();
        }
    }
    
    public static String[] shellSortStrings(String[] arr) {
        int salto, i;
        String aux;
        boolean cambios;

        for (salto = arr.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while(cambios) {
                cambios = false;
                for (i = salto; i < arr.length; i++) {
                    if ((arr[i - salto].compareTo(arr[i])) > 0) {
                        aux = arr[i];
                        arr[i] = arr[i - salto];
                        arr[i - salto] = aux;
                        cambios = true;
                    }

                }
            }
        }
        return arr;
    }
}
