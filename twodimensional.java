//          MINE 

// package arrays;
// import java.util.*;
// public class twodimensional {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[][] arr=new int[3][3];
//         // int[][] arr={
//         //     {1,2,3},               // 0th index
//         //     {4,5,6},              // 1st index
//         //     {7,8,9}               // 2nd index
//         // };

//         //input
//         for(int row=0;row<arr.length;row++){
//             for(int col=0;col<arr[row].length;col++){
//                 arr[row][col]=sc.nextInt();

//             }
//         }
//             //output
//             for(int row=0;row<arr.length;row++){
//                 for(int col=0;col<arr[row].length;col++){
//                     System.out.print(arr[row][col]+" ");
//                 }
//                 System.out.println();
//         }
//     }
// }

// BHAIYA's METHOD:-

// package arrays;
// import java.util.*;
// public class twodimensional{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int[][] arr=new int[n][m];
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 arr[i][j]=sc.nextInt();

//             }
//         }
//         Display(arr);
//     }
//     public static void Display(int[][] arr){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }




// package arrays;
// import java.util.*;
// public class twodimensional {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int arr[][]={
//             {1,2,3,5},               // 0th index
//             {4,5,6,7},              // 1st index
//             {7,8,9,10}, 
//             {10,11,12,13}             // 2nd index

//         };

//         //input
//         for(int col=0;col<arr[0].length;col++){
//             if(col%2==0){
//                 for(int row=0;row<arr.length;row++){
//                     System.out.print(arr[row][col]+" ");

//                 }
//             }
//             else{
//                 for(int row=arr.length-1;row>=0;row--){
//                     System.out.print(arr[row][col]+" ");
//                 }
//             }
//     }
// }
// }




// Transpose of a 2D Matrix:-

// package arrays;
// import java.util.*;
// public class twodimensional {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         final int arr[][]={
//             {1,2,3,5},               // 0th index
//             {4,5,6,7},              // 1st index
//             {7,8,9,10},             // 2nd index
//             {10,11,12,13}};
            
//             Transpose(arr);
//             for(int i=0;i<arr.length;i++){
//                 for(int j=0;j<arr[0].length;j++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//                 System.out.println();
//             }
//     }
//     public static void Transpose(int[][] arr){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr[0].length;j++){
//                 int temp=arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//         }


//     }
// }




// package arrays;
// import java.util.*;
// public class twodimensional {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         final int arr[][]={
//             {1,2,3,5},               // 0th index
//             {4,5,6,7},              // 1st index
//             {7,8,9,10},             // 2nd index
//             {10,11,12,13}};
            
//             int item=12;
//             System.out.println(Search(arr,item));
//         }

//         public static boolean Search(int[][] arr,int item){
//             int row=0;
//             int col=arr[0].length;
//             while(row<arr.length && col>=0){
//                 if(arr[row][col]==item){
//                     return true;
//                 }
//                 else if(arr[row][col]>item){
//                     col--;
//                 }else{
//                     row++;
//                 }
//             }
//             return false;
//         }
        

//     }


//       Spiral Printing:-

// Works for all type of matrix

// package arrays;
// import java.util.*;
// public class twodimensional {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int arr[][]=  {
//         {1,2,3,5,8},               
//         {4,5,6,7,9},              
//         {7,8,9,10,18},             
//         {10,11,12,13,17},
//         {26,27,28,29,20}};
//         print(arr);
//     }
//     public static void print(int[][] arr){
//         int minc=0,minr=0,maxc=arr[0].length-1,maxr=arr.length-1;
//         int te=arr.length*arr[0].length;
//         int c=0;
//         while(c<te){
//             for(int i=minc;i<=maxc && c<te;i++){
//                 System.out.print(arr[minr][i]+" ");
//                 c++;
//             }
//             minr++;
//             for(int i=minr;i<=maxr && c<te;i++){
//                 System.out.print(arr[i][maxc]+" ");
//                 c++;
//             }
//             maxc--;
//             for(int i=maxc;i>=minc && c<te;i--){
//                 System.out.print(arr[maxr][i]+" ");
//                 c++;
//             }
//             maxr--;
//             for(int i=maxr;i>=minr && c<te;i--){
//                 System.out.print(arr[i][minc]+" ");
//                 c++;
//             }
//             minc++;
//         }
//     }
// }





