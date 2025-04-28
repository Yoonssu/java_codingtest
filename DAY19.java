import java.util.*;

public class DAY19 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //학생수
        int n = sc.nextInt();
        sc.nextLine();

        //학생 이름
        String[] names = sc.nextLine().split(" ");

        //인기도 초기화
        HashMap<String, Integer> popularity = new HashMap<>();
        for(String name : names){
            popularity.put(name,0);
        }

        //각 학생이 좋아하는 학생 입력 받고, 인기도 +1
        for(int i=0; i<n; i++){
            String[] love = sc.nextLine().split(" ");
            for(String loves : love){
                popularity.put(loves, popularity.get(loves) +1);
            }
        }

        //정렬
        ArrayList<String> arrayName = new ArrayList<>(Arrays.asList(names));
        arrayName.sort((a,b) ->{
            if (popularity.get(b) != popularity.get(a)) { //내림차순
                return popularity.get(b) - popularity.get(a); //오름차순
            }else{
                return a.compareTo(b);
            }
        });


        for(String name : arrayName){
            System.out.println(name + " " + popularity.get(name));
        }

    }
}
