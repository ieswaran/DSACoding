package Week1.Day2;

import java.util.Arrays;

public class removellOccur {
	public static int[] removeElements(int[] arr, int key)
    {
        int index = 0;
        for (int i=0; i<arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];
 
        return Arrays.copyOf(arr, index);
    }
 
    public static void main(String[] args)
    {
        int[] array = { 1,2,3,5,1 };
        int key = 1;
        array = removeElements(array, key);
        System.out.println(Arrays.toString(array));
    }
}
