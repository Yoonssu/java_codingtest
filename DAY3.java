import java.util.Scanner;

public class DAY3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        while(T-- > 0){

            String input = sc.nextLine();

            //1.숫자만 추출
            String numStr = input.replaceAll("[^01]", "");
            int n = numStr.isEmpty() ? 0 : Integer.parseInt(numStr);

            //3. 앞 느낌표 개수
            int prefixcount =0;
            for(int i =0; i<input.length(); i++){
                if(input.charAt(i)=='!')prefixcount++;
                else break;
            }

            //4. 뒷 느낌표 개수
            int suffixcount =0;
            for(int i = input.length() -1; i>=0; i--){
                if(input.charAt(i)=='!')suffixcount++;
                else break;
            }

            int result = n;
            for(int i=0; i< suffixcount; i++){
                result = factorial(result);
            }

            for(int i=0; i< prefixcount; i++){
                result = logicalNot(result);
            }

            System.out.println(result);

        }

    }

    public static int factorial(int n){
        return 1;
    }

    public static int logicalNot(int n){
        return (n==0) ? 1 : 0;
    }
}
