// package sorting;
// import java.util.*;
// public class selection {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         selection(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }

//     static void selection(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             int last=arr.length-i-1;
//             int max=getMaxIndex(arr,0,last);
//             swap(arr,max,last);
//         }
//     }

//     static void swap(int arr[], int first,int second){
//         int temp=arr[first];
//         arr[first]=arr[second];
//         arr[second]=temp;
//     }

//     static int getMaxIndex(int arr[],int start,int end){
//         int max=start;
//         for(int i=start;i<=end;i++){
//             if(arr[max]<arr[i]){
//                 max=i;
//             }
//         }
//         return max;
//     }
    
// }
