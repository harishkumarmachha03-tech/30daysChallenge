import java.util.Stack;
public class LC_232_implement_queue_usingstack {
static class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek(); // ensure output has elements
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}


    public static void main(String[] args) {
      MyQueue q = new MyQueue();

        System.out.println("Pushing elements 1, 2, 3 into queue...");
        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println("Peek: " + q.peek()); 
        System.out.println("Pop: " + q.pop());   
        System.out.println("Peek after pop: " + q.peek()); 

        System.out.println("Pop: " + q.pop());  
        System.out.println("Empty? " + q.empty()); 

        System.out.println("Pop: " + q.pop());   
        System.out.println("Empty? " + q.empty()); 
    }
}
