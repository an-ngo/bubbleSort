import java.util.Scanner;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void swap(int[]list,int a,int b){
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }

    public static void bubbleSort(int[] list){
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if(list[i]>list[j]){
                    swap(list,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(list);
        for (int i :
                list) {
            System.out.println(i);
        }
        bubbleSort(arr);
        for (int i :
                arr) {
            System.out.println(i);
        }
    }
}
