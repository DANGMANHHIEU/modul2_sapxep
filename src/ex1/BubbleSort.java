package ex1;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sapXep(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for (int j =arr.length-1;j>i;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        sapXep(list);
        System.out.println(Arrays.toString(list));
    }
}
