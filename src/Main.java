public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Core core = new Core(stack);
        core.showCall();





        stack.push(1);
        stack.push("string");
        stack.push(1.2);
        core.runCall(0);
        stack.push("string");
        stack.push("string");
        stack.push("string");
        core.runCall(3);
        stack.pop();
        stack.pop();





    }
}