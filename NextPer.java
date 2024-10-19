// import java.util.*;
// public class NextPer {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
        
//         for (int t = 0; t < T; t++) {
//             int N = sc.nextInt();
//             int[] arr = new int[N];

//             for (int i = 0; i < N; i++) {
//                 arr[i] = sc.nextInt();
//             }

//             nextPermutation(arr);

//             for (int i = 0; i < N; i++) {
//                 System.out.print(arr[i] + (i < N - 1 ? " " : ""));
//             }
//             System.out.println();
//         }

//         sc.close();
//     }

//     private static void nextPermutation(int[] arr) {
//         int n = arr.length;
//         int i = n - 2;

//         while (i >= 0 && arr[i] >= arr[i + 1]) {
//             i--;
//         }

//         if (i >= 0) {
//             int j = n - 1;
//             while (arr[j] <= arr[i]) {
//                 j--;
//             }
//             swap(arr, i, j);
//         }

//         reverse(arr, i + 1, n - 1);
//     }

//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     private static void reverse(int[] arr, int start, int end) {
//         while (start < end) {
//             swap(arr, start, end);
//             start++;
//             end--;
//         }
//     }
// }

