// package sorting;
// import java.util.*;
// public class bubble{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int[] arr={4,5,3,2,1};
//         Sort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void Sort(int[] arr){
//         for(int turn=1;turn<arr.length;turn++){
//             for(int i=0;i<arr.length-turn;i++){
//                 if(arr[i]>arr[i+1]){
//                     int temp=arr[i];
//                     arr[i]=arr[i+1];
//                     arr[i+1]=temp;
//                 }
//             }
//         }
// }
// }



//                MINE 

// package sorting;
// import java.util.*;
// public class bubble{
//     public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int i=0;i<arr.length;i++){
        //     for(int j=1;j<arr.length-i;j++){
        //             if(arr[j]<arr[j-1]){
        //                 int temp=arr[j];
        //                 arr[j]=arr[j-1];
        //                 arr[j-1]=temp;
        //                 }
        //             }
        //         }
        //         for(int i=0;i<arr.length;i++){
        //             System.out.print(arr[i]+" ");
        //         }
//             }        
//         }
        



// SORTING THE ELEMENTS OF AN ARRAY AFTER SQUARING ITS ELEMENTS FIRST:-

// 5
// 2
// 3
// 1
// 5
// 4
// 1 4 9 16 25 

// package sorting;
// import java.util.*;
// public class bubble {
//     public static void main (String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             arr[i]=arr[i]*arr[i];
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=1;j<arr.length-i;j++){
//                     if(arr[j]<arr[j-1]){
//                         int temp=arr[j];
//                         arr[j]=arr[j-1];
//                         arr[j-1]=temp;
//                         }
//                     }
//                 }
//                 for(int i=0;i<arr.length;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//     }
// }