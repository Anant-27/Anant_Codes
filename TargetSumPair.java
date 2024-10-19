// import java.util.*;
// public class TargetSumPair {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int target = sc.nextInt();
//         findPairs(arr, target);
//         sc.close();
//     }

//     static void findPairs(int[] arr, int target) {
//         Set<String> pairs = new HashSet<>();
//         Set<Integer> seen = new HashSet<>();

//         for (int num : arr) {
//             int complement = target - num;
//             if (seen.contains(complement)) {
//                 int smaller = Math.min(num, complement);
//                 int larger = Math.max(num, complement);
//                 pairs.add(smaller + " and " + larger);
//             }
//             seen.add(num);
//         }

//         List<String> sortedPairs = new ArrayList<>(pairs);
//         Collections.sort(sortedPairs);

//         for (String pair : sortedPairs) {
//             System.out.println(pair);
//         }

//     }   
// }
