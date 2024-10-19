
// Question:-189       (ROTATE ARRAY)

// import java.util.*;
// public class problems{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,2,3,4,5,6,7};
//         int k=103;
//         RotateArray(arr,k);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
//     public static void RotateArray(int[] arr,int k){
//         int n=arr.length;
//         k=k%n;
//         for(int j=1;j<=k;j++){
//             int item=arr[n-1];
//         for(int i=n-2;i>=0;i--){
//             arr[i+1]=arr[i];
//         }
//         arr[0]=item;
//         }
//     }
// }

// For TLE (By:-Reversal Algorithim):-
// 1. Reverse Complete
// 2. Reverse 0 to k-1
// 3. reverse k to n-1

// import java.util.*;
// public class problems{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[] arr={1,2,3,4,5,6,7};
//         int k=103;
//         RotateArray(arr,k);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
//     public static void RotateArray(int[] arr,int k){
//         int n=arr.length;
//         k=k%n;
//         Reverse(arr,0,n-1);
//         Reverse(arr,0,k-1);
//         Reverse(arr,k,n-1);
//     }
//     public static void Reverse(int[] arr,int i,int j){
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//     }
// }


// Question:- 42 (Rainwater Trapping)

// import java.util.*;
// public class problems{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println(Trapping(arr));
//     }
//     public static int Trapping(int[] arr){
//         int n=arr.length;
//         int[] left=new int[n];
//         int[] right=new int[n];
//         left[0]=arr[0];
//         for(int i=1;i<left.length;i++){
//             left[i]=Math.max(left[i-1],arr[i]);
//         }

//         right[n-1]=arr[n-1];
//         for(int i=n-2;i>=0;i--){
//             right[i]=Math.max(right[i+1],arr[i]);
//         }

//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum=sum+Math.min(left[i],right[i])-arr[i];
//         }
//         return sum;

//     }

// }


// Question:-238  (Product of an array except itself)

// import java.util.*;
// public class problems{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         int[] ans=array_except_itself(arr);
//         for(int i=0;i<ans.length;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
//     public static int[] array_except_itself(int[] arr){
//         int n=arr.length;
//         int[] left=new int[n];
//         int[] right=new int[n];
//         left[0]=1;
//         for(int i=1;i<left.length;i++){
//             left[i]=left[i-1]*arr[i-1];
//         }
//         right[n-1]=1;
//         for(int i=n-2;i>=0;i--){
//             right[i]=right[i+1]*arr[i+1];
//         }
//         for(int i=0;i<arr.length;i++){
//             left[i]=left[i]*right[i];
//         }
//         return left;
//     }
// }


// Question:- 628 ( Maximum Product of 3 Numbers in an Array )

// import java.util.*;
// public class problems{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print(Max_Product(arr));
//     }
//     public static int Max_Product(int[] arr){
//         Arrays.sort(arr);                // Directly Sorts an array
//         int n= arr.length;
//         int product_1=arr[n-1]*arr[n-2]*arr[n-3];        // As last 3 will be maximum elements and their products will be maximum

//         int product_2=arr[0]*arr[1]*arr[n-1];            // As starting 2 numbers can be -ve and their product with last element can give maximum product

//         return Math.max(product_1,product_2);
//     }
// }



// Question:-1913 (Max Product Difference)

// import java.util.*;
// public class problems{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] nums=new int[n];
//         for(int i=0;i<nums.length;i++){
//             nums[i]=sc.nextInt();
//         }
//         System.out.print(Max_P_Diff(nums));
//     }
//     public static int Max_P_Diff(int[] nums){
//         int n=nums.length;
//         Arrays.sort(nums);
//         int max1=nums[n-1];
//         int max2=nums[n-2];
//         int min1=nums[0];
//         int min2=nums[1];
//         int product=(max1*max2)-(min1*min2);
//         return product;
//     }
// }