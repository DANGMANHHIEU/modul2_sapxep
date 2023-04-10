package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class sapXepChon {
    public static int[] sapXep(int[] arr){
        int min;
        for (int i=0;i<arr.length-1;i++){
            min =i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            if(min!=i){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập đọ dài mảng:");
        int size = sc.nextInt();
        int[] array=new int[size];
        System.out.println("nhập phần tử:");
        for (int i=0;i<size;i++){
            System.out.println("phần tử thứ "+(i+1)+":");
            array[i]=sc.nextInt();
        }
        System.out.println("array: "+ Arrays.toString(array));
        System.out.println("Sắp xếp array theo thuật toán sắp xếp chọn:");
        sapXep(array);
        System.out.println(Arrays.toString(array));

    }
}
