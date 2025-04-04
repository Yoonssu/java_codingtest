import java.util.LinkedList;
import java.util.Queue;

public class DAY5 {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public DAY5(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x){
        queue1.offer(x);
    }

    public int pop(){
        while(queue1.size()>1){ //하나 남을 때까지
            queue2.offer(queue1.poll());
        }
        int topElement = queue1.poll(); //나머지 하나 저장

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    public int top(){
        while(queue1.size()>1){ //하나 남을 때까지
            queue2.offer(queue1.poll());
        }
        int topElement = queue1.peek(); //pop하지 않고 확인만

        queue2.offer(queue1.poll());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    public boolean empty(){
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        DAY5 myStack = new DAY5();

        myStack.push(1);
        myStack.push(2);

        System.out.println(myStack.top());   // 출력: 2
        System.out.println(myStack.pop());   // 출력: 2
        System.out.println(myStack.empty()); // 출력: false
    }
}
