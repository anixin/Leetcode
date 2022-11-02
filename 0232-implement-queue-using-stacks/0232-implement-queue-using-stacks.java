// TODO in O(1) time

class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stack1.add(x);
    }

    public int pop() {
        // if(stack1.isEmpty()) return
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        int val = stack2.pop();

        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }

        return val;
    }

    public int peek() {
        while (!stack1.isEmpty()) {
            stack2.add(stack1.pop());
        }
        int val = stack2.peek();

        while (!stack2.isEmpty()) {
            stack1.add(stack2.pop());
        }

        return val;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}