import java.util.Scanner;

public class Main{
    private static void swap(int i, int j, int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    private static int partition(int low, int high, int[] arr){
        int x = arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(arr[j] < x){
                swap(++i, j, arr);
            }
        }

        swap(++i, high, arr);
        return(i);
    }

    private static void quicksort(int low, int high, int[] arr){
        if(low < high){
            int q = partition(low, high, arr);
            quicksort(q + 1, high, arr);
            quicksort(low, q - 1, arr);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] strs = scan.nextLine().split(" ");
        int[] arr = new int[strs.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strs[i]);
        }

        quicksort(0, arr.length - 1, arr);
        for(int n : arr){
            System.out.print(n + " ");
        }

        System.out.println("");
    }
}
