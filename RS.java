// import java.util.*;
// public class RS {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         int[] runningSum = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         runningSum[0] = nums[0];
//         for (int i = 1; i < n; i++) {
//             runningSum[i] = runningSum[i - 1] + nums[i];
//         }

//         for (int i = 0; i < n; i++) {
//             System.out.print(runningSum[i] + " ");
//         }

//         sc.close();

        
//     }
    
// }
