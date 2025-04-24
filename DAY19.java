import java.util.Arrays;
import java.util.Scanner;

public class DAY19 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //배열 원소 수
        int m = sc.nextInt(); // 질문 수
        sc.nextLine();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);


        //질문 수
        for(int i=0; i<m; i++){
            int query = sc.nextInt();

            int indx = lowBound(arr,query);

            if(indx<n && arr[indx] == query){
                System.out.println(indx);
            }else{
                System.out.println(-1);
            }

        }

    }

    private static int lowBound(int[] arr, int target){
        int left =0;
        int right = arr.length;

        while(left<right){
            int mid = (left + right)/2;

            if(arr[mid] < target){
                left = mid +1;
            }else{
                right = mid;
            }
        }

        return left;
    }
}
