// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=n;
//         while(row<=n){
//             int i=1;
//             while(i<=star){
//                 System.out.print("* ");
//                 i++;
//             }
//             System.out.println();
//             row++;
//             sc.close();

//         }

//     }
// }



// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=1;
//         while(row<=n){
//             int i=1;
//             while(i<=star){
//                 System.out.print("* ");
//                 i++;
//             }
//             System.out.println();
//             row++;
//             star++;
//         }
//     }
// }


// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=n;
//         while(row<=n){
//             int i=1;
//             while(i<=star){
//                 System.out.print("* ");
//                 i++;
//             }
//             System.out.println();
//             row++;
//             star--;
//         }
//     }
// }



// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=1;
//         int space=n-1;
//         while(row<=n){
//             int i=1;
//             while(i<=space){
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while(j<=star){
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             row++;
//             star++;
//             space--;
//         }
//     }
// }


// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=n;
//         int space=n-1;
//         while(row<=n){
//             int i=1;
//             while(i<=space){
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while(j<=star){
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             row++;
//             star--;
//             space++;
//         }
//     }
// }


// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=1;
//         int space=n-1;
//         while(row<=n){
//             int i=1;
//             while(i<=space){
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while(j<=star){
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             row++;
//             star+=2;
//             space--;
//         }
//     }
// }



// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=2*n-1;
//         int space=0;
//         while(row<=n){
//             int i=1;
//             while(i<=space){
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while(j<=star){
//                 System.out.print("* ");
//                 j++;
//             }
//             System.out.println();
//             row++;
//             star-=2;
//             space++;
//         }
//     }
// }




// import java.util.*;
// public class start{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int row=1;
//         int star=1;
//         int space=n-1;
//         while(row<=2*n-1){
//             int i=1;
//             while(i<=space){
//                 System.out.print("  ");
//                 i++;
//             }
//             int j=1;
//             while(j<=star){
//                 System.out.print("* ");
//                 j++;
//             }
//             if(row<n){
//                 star=star+2;
//                 space=space-1;
//             }
//             else{
//                 star=star-2;
//                 space=space+1;
//             }
//             System.out.println();
//             row++;
//         }

//     }
// }
