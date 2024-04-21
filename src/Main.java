import java.util.Scanner;


public class Main {

    static void showMenu(){
        System.out.println("Welcome to the Exchange Converter, please choose one of the following options");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1. USD");
        System.out.println("2. DOP");
        System.out.println("3. EUR");
        System.out.println("4. Exit Program");
    }

    public static void main(String[] args) {

        boolean keepRunning = true;
        int operation = 0;
        Scanner scanner = new Scanner(System.in);


        do {
            showMenu();
            operation = scanner.nextInt();

            if(operation == 4){
                keepRunning = false;
                System.out.println("Thank you for using our system");
            }



        } while (keepRunning);



    }
}