public class DAY8 {
    public boolean digitCount(String num){
        int[] count = new int[10];

        for(char c : num.toCharArray()){
            int digit = c -'0';
            count[digit]++;
        }

        for(int i=0; i<num.length(); i++){
            int expect = num.charAt(i) - '0';
            if(count[i] != expect){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        DAY8 solution = new DAY8();

        String num1 = "1210";
        System.out.println("Result for num1 ('1210'): " + solution.digitCount(num1));  // true

        String num2 = "030";
        System.out.println("Result for num2 ('030'): " + solution.digitCount(num2));  // false

        String num3 = "0000";
        System.out.println("Result for num3 ('0000'): " + solution.digitCount(num3));  // false

        String num4 = "3322210";
        System.out.println("Result for num4 ('3322210'): " + solution.digitCount(num4));  // true
    }
}
