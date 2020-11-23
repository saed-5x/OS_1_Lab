import java.util.*;

class Core {
    private final int counter = 5;
    private Vector<SystemCall> call_list;
    private Stack stack;
    private SystemCall call;


    public Core(Stack stack1) {
        call_list = new Vector<>();
        call_list.add(0, new SystemCall(0, new Object[]{1, 1, 1}));
        call_list.add(1, new SystemCall(1, new Object[]{"string", 1.5, "string"}));
        call_list.add(2, new SystemCall(2, new Object[]{"string", 1 , 1.6}));
        call_list.add(3, new SystemCall(3, new Object[]{"string", "string","string"}));
        call_list.add(4,new SystemCall(4, new Object[]{1.2, 1.5, 3.5}));
        stack = stack1;
    }


    public void showCall() {

        for (int i = 0; i < counter; i++) {

            String str;
            for (int j = 0; j < call_list.get(i).getData().length; j++) {
                str = call_list.get(i).getData()[j].getClass().getSimpleName() + " < " +call_list.get(i).getData()[j]+" > ";

               System.out.print("[ "+str+" ]");
            }
            System.out.println("\n");
        }
    }


    public void runCall(int id) {

        try {

            call=call_list.get(id);

        } catch (Exception e) {
            System.out.println("Error :there isn't no system call with this id !!!!!");
        }
        if(stack.getSize()==0){
            System.out.println("no data in stack");
            return ;
        }
        if (!call_list.contains(call)) {
            System.out.println("no system call with this id");
            return;
        }

        int stackSize = stack.getSize();
        Object[] Data = new Object[stackSize];
        for (int i = 0; i < stackSize; i++) {
            Data[i] = stack.pop();
        }

         if (Data.length != call.getData().length) {
            System.out.println("Error : no system call with that many arguments");
            return;
        }
        for (int i = 0; i < Data.length; i++) {
            if (Data[i].getClass()!= call.getData()[i].getClass()) {
                System.out.println("Error : There is no system call with this set of arguments.");
                return;
            }
        }
        System.out.println("done with id " + id);
    }
    }




