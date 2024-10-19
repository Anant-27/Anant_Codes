// SWAP ELEMENTS IN AN ARRAY

// 1 2 3 4 5
// 1 4 3 2 5 

// package arrays;
// import java.util.*;
// public class questions {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         swap(arr,1,3);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static void swap(int[]arr,int index1,int index2){
//         int temp=arr[index1];
//         arr[index1]=arr[index2];
//         arr[index2]=temp;
//     }
// }

// MAXIMUM ELEMENT IN AN ARRAY

// package arrays;
// import java.util.*;
// public class questions {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println(max(arr));
//     }
//     static int max(int[]arr){
//         int max_val=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max_val){
//                 max_val=arr[i];
//             }
//         }
//         return max_val;
//     }
// }


// REVERSE OF AN ARRAY


// package arrays;
// import java.util.*;
// public class questions {
//     public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int[] arr=new int[5];
    //     for(int i=0;i<arr.length;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     // swap(arr,1,3);
    //     reverse(arr);
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // static void reverse(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<end){
    //         swap(arr,start,end);
    //         start++;
    //         end--;
    //     }
    // }
    // static void swap(int[]arr,int index1,int index2){
    //     int temp=arr[index1];
    //     arr[index1]=arr[index2];
    //     arr[index2]=temp;
//     }
// }

//  INVERTING AN ARRAY
// 5
// 0 2 4 1 3
// Sample Output
// 0 3 1 4 2


// import java.util.*;

// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();  
//         int[] arr = new int[N]; 
//         for (int i = 0; i < N; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int[] inverted = new int[N];
//         for (int i = 0; i < N; i++) {
//             inverted[arr[i]] = i;  
//         }
//         for (int i = 0; i < N; i++) {
//             System.out.print(inverted[i] + " ");
//         }
//     }
// }


// LINEAR SEARCH

// 4
// Explanation
// Given array = {2, 4, 6, 9, 17}. Target number = 17. Index = 4.

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int[] arr = new int[N];
        
//         for (int i = 0; i < N; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int M = sc.nextInt();
//         int result = findIndex(arr, M);
//         System.out.println(result);
//     }

//     public static int findIndex(int[] arr, int M) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == M) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
