import java.util.*;

public class DAY12 {
    public static void main(String[] args){
        //플레이 신청 횟수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //게임 받아오기
        String game = sc.next();

        Map<String, Integer> gameMap = new HashMap<>();
        gameMap.put("Y",2);
        gameMap.put("F",3);
        gameMap.put("O",4);

        //각 게임에 해당하는 필요 인원수
        int requiredPeople = gameMap.get(game);

        //사람들 받아오기
        Set<String> name = new HashSet<>();
        for(int i=0; i<n; i++){
            name.add(sc.next());
        }

        //전체 사람들 수 받아오기
        int total = name.size();
        int teamCount = total/requiredPeople-1;

        System.out.println(teamCount);

    }
}
