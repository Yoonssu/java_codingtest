import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DAY13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++){
            String word = sc.nextLine();
            set.add(word);
        }

        //set을 list로 변환해서 정렬
        List<String> list = new ArrayList<>(set);

        list.sort((a,b)->{
            if (a.length() != b.length()) {

                return a.length()-b.length();
            }
            else{
                return a.compareTo(b);
            }
        });

        for(String word : list){
            System.out.println(word);
        }



    }
}
