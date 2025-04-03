import java.util.Stack;

public class DAY4 {

   private Stack<Integer> stack1;
   private Stack<Integer> stack2;

   public DAY4(){
       stack1 = new Stack<Integer>();
       stack2 = new Stack<Integer>();
   }

   public void push(int x){
       stack1.push(x);
   }

   public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
   }

   public int peek(){
       if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
       }
        return stack2.peek();
   }

   public boolean empty(){
       return stack1.isEmpty() && stack2.isEmpty();
   }


    public static void main(String[] args) {
        DAY4 queue = new DAY4();
        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop());  // 1
        System.out.println(queue.peek()); // 2
        System.out.println(queue.pop());  // 2
        System.out.println(queue.empty()); // false
        System.out.println(queue.pop());  // 3
        System.out.println(queue.empty()); // true
    }


}
