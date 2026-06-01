package app;

public class Main {

    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        uiOperator.getOutput(handler.getAll());
        try {
            uiOperator.getOutput(handler.getById(172));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

