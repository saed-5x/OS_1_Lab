public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Core core = new Core(stack);
        core.showCall();

        stack.push(15);
        stack.push(10);
        stack.push(16);
        core.runCall(0);

        stack.push("no thing");
        stack.push(15.45);
        stack.push("data");
        core.runCall(1);

        stack.push("line");
        stack.push(15);
        core.runCall(2);

        stack.push("all");
        stack.push("is");
        stack.push("well");
        core.runCall(3);

        stack.push(15);
        stack.push("numbers");
        core.runCall(4);
        core.runCall(5);

    }
}