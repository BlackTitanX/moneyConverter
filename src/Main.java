import java.util.Scanner;


public class Main {

    static void showMenu(){
        System.out.println("Welcome to the Exchange Converter, please choose one of the following options");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("1. Dolar ==>> Peso argentino");
        System.out.println("2. Peso argentiono ==>> Dolar");
        System.out.println("3. Dolar==>> Real brasilegno ");
        System.out.println("4. Real Brasilegno ==>> Dolar ");
        System.out.println("5. Dolar ==>> Peso colombiano");
        System.out.println("6. Peso Colombiano ==>> Dolar");
        System.out.println("7. Exit Program");
    }

    public static void main(String[] args) {

        boolean keepRunning = true;
        int operation = 0;
        Scanner scanner = new Scanner(System.in);


        do {
            showMenu();
            operation = scanner.nextInt();

            if(operation == 1){
                ExchangeOperations calculator = new ExchangeOperations();
                double amount;
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                calculator.performConvertion("USD",amount,"ARS");

            }

            if(operation == 2){
                ExchangeOperations calculator = new ExchangeOperations();
                double amount;
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                calculator.performConvertion("ARS",amount,"USD");

            }

            if(operation == 3){
                ExchangeOperations calculator = new ExchangeOperations();
                double amount;
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                calculator.performConvertion("USD",amount,"BRL");
            }

            if(operation == 4){
                ExchangeOperations calculator = new ExchangeOperations();
                double amount;
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                calculator.performConvertion("BRL",amount,"USD");
            }

            if(operation == 5){
                ExchangeOperations calculator = new ExchangeOperations();
                double amount;
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                calculator.performConvertion("USD",amount,"COP");
            }

            if(operation == 6){
                ExchangeOperations calculator = new ExchangeOperations();
                double amount;
                System.out.println("Enter Amount");
                amount = scanner.nextDouble();
                calculator.performConvertion("COP",amount,"USD");
            }


            if(operation == 7){
                keepRunning = false;
                System.out.println("Thank you for using our system");
            }



        } while (keepRunning);



    }
}