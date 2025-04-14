import java.util.*;

public class DAY11 {

    // findRepeatedDnaSequences 메서드
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        // 10글자씩 슬라이딩 윈도우
        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            if (seen.contains(substring)) {
                repeated.add(substring);  // 이미 나온 10글자는 repeated에 추가
            } else {
                seen.add(substring);  // 처음 나온 10글자는 seen에 추가
            }
        }

        // 반복된 문자열들을 List로 반환
        return new ArrayList<>(repeated);
    }

    // main 메서드 추가
    public static void main(String[] args) {
        // 인스턴스를 만들어 메서드 호출
        DAY11 obj = new DAY11();

        // 예시 1
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result1 = obj.findRepeatedDnaSequences(s1);
        System.out.println("Repeated sequences in s1: " + result1);

        // 예시 2
        String s2 = "AAAAAAAAAAAAA";
        List<String> result2 = obj.findRepeatedDnaSequences(s2);
        System.out.println("Repeated sequences in s2: " + result2);
    }
}
