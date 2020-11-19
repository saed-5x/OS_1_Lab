import java.util.*;

class Core {
    private final int counter = 5;
    private Vector<SystemCall> call_list;
    private Stack stack;
    private SystemCall call;


    public Core(Stack stack1) {
        call_list = new Vector<>();
        call_list.add(0, new SystemCall(0, new Object[]{1, "string",1.2}));
        call_list.add(1, new SystemCall(1, new Object[]{2.5, "string",1}));
        call_list.add(2, new SystemCall(2, new Object[]{1, 1, 1}));
        call_list.add(3, new SystemCall(3, new Object[]{1.2,3.2,4.3}));
        call_list.add(4,new SystemCall(4, new Object[]{"string","string","string"}));
        stack = stack1;
    }


    public void showCall() {

        for (int i = 0; i < counter; i++) {

            String str = "";


            for (int j = 0; j < call_list.get(i).getData().length; j++) {
                str = call_list.get(i).getData()[j]+" , ";

               System.out.print(str);
            }
            System.out.println("\n");
        }
    }


    public void runCall(int id) {

        try {
            call=call_list.get(id);

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        if(!stack.isEmpty()){
            System.out.println("No varablis");
            return;
        }
        if (!call_list.contains(call)) {
            System.out.println("error");
            return;
        }


    }
}