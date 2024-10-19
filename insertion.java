// package sorting;
// import java.util.*;
// public class insertion {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,2,7,8,9,4};
//         System.out.println(InsertionAtLast(arr,arr.length-1));
        
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static int InsertionAtLast(int[] arr,int i){
//         int item=arr[i];
//         int j=i-1;
//         while(j>=0 && arr[j]>item){
//             arr[j+1]=arr[j];
//             arr[j]=item;
//             j--;
//         }
//         return j+1;
//     }
// }


//                          MINE

// package sorting;
// import java.util.*;
// public class insertion{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         insertion(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static void insertion(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=i+1;j>0;j--){
//                 if(arr[j]<arr[j-1]){
//                     swap(arr,j,j-1);
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//     }

//     static void swap(int arr[], int first,int second){
//         int temp=arr[first];
//         arr[first]=arr[second];
//         arr[second]=temp;
//     }
// }