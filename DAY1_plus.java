import java.util.Scanner;

// 팰린드롬1
public class DAY1_plus {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String reverseWord = new StringBuilder(str).reverse().toString();

        if(str.equals(reverseWord)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}

// 팰린드롬2
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) throws IOException {


//         Scanner sc = new Scanner(System.in); 

//         String word = sc.nextLine();

//         int left = 0; 
//         int right = word.length() - 1;

//         while (left < right) {

//             if (word.charAt(left) != word.charAt(right)) {
//                 System.out.println(0);
//                 return;
//             }

//             left++;
//             right--; 

//         }

//         System.out.println(1);

//     }
// }