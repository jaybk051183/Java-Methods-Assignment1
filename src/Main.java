package src;

public class Main {

    public static void main(String[] args) {
        int number;
        int input1;
        int input2;
        String name;

        hello();
        positiveOrNegative(0);
        positiveOrZeroOrNegative(0);
        bartender("Henk");
        sum(2,4);
    }

    public static void hello() {
        System.out.println("Hello world");
    }


    public static void positiveOrNegative(int number) {
        if(number > 0){
            System.out.println("This number is positive");
        }
        else{
            System.out.println("This number is negative");
        }
    }

    public static void positiveOrZeroOrNegative (int number) {
        if(number > 0){
            System.out.println("This number is postive");
        } else if (number ==0) {
            System.out.println("This number is zero");
        }
        else{
            System.out.println("This number is negative");
        }
    }

    public static void bartender(String name) {
        switch (name){
            case "Henk":
                System.out.println("Blue curacao");
                break;
            case "Piet":
                System.out.println("Gin Tonic");
                break;
            case "Johan":
                System.out.println("Caipirinha");
                break;
        }
    }

    public static void sum(int input1, int input2) {
        System.out.println(input1 + " summed by " + input2 + " = " + (input1+input2));
    }
}
