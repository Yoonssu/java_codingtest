import java.util.Scanner;

public class DAY2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String str = sc.nextLine();

            int c1=0, c2=0, c3=0, c4=0;

            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                if(ch>= 'a' && ch<= 'z'){
                    c1++;
                }else if(ch>= 'A' && ch<= 'Z'){
                    c2++;
                }else if(ch>= '0' && ch<= '9'){
                    c3++;
                }else if(ch == ' '){
                    c4++;
                }
            }

            System.out.println(c1+" "+ c2+" "+ c3+" "+c4);

        }


    }
}

