//package level_2;

//import java.util.Arrays;

//public class Shuffle_The_Array {
//    public static int[] shuffle(int[] nums, int n) {
//        int[] newArr=new int[2*n];
//        int j=n,k=0;
//        for(int i=0;i<nums.length;i++){
//            if(i%2==0){
//                newArr[i]=nums[k];
//                k++;
//            }
//            else{
//                newArr[i]=nums[j];
//                j++;
//            }
//        }
//
//        return newArr;
//    }
//
//    public static void main(String[] args) {
//        int[] arary = {8, 4, 6, 2, 9, 1};
//        System.out.println(Arrays.toString(shuffle(arary)));
//    }
//}
