import java.util.*;

public class DAY14 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //수강
        int M = sc.nextInt(); //요구
        int K = sc.nextInt(); //공개
        sc.nextLine();


        HashMap<String, Integer> subjectScore = new HashMap<>();

        for(int i=0; i<N; i++){
            String[] str = sc.nextLine().split(" ");
            String subject = str[0];
            int score = Integer.parseInt(str[1]);
            subjectScore.put(subject, score);
        }


        Set<String> openSubject = new HashSet<>();
        for(int i=0; i<K; i++){
            String openSub = sc.nextLine();
            openSubject.add(openSub);
        }

        int fixedScore = 0;
        List<Integer> remainScore = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : subjectScore.entrySet()){
            String subject = entry.getKey();
            int score = entry.getValue();

            if(openSubject.contains(subject)){
                fixedScore+=score;
            }else{
                remainScore.add(score);
            }
        }

        Collections.sort(remainScore);

        //요구 - 공개
        int extra = M-K;

        int min = 0;
        int max = 0;

        //최소
        for(int i=0; i<extra; i++){
            min +=remainScore.get(i);
        }

        //최대
        for(int i=remainScore.size()-1; i>=remainScore.size()-extra; i--){
            max +=remainScore.get(i);
        }

        System.out.println((fixedScore + min) + " " + (fixedScore+ max));

    }
}
