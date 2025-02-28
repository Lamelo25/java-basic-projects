



import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.HashMap;

public class MainATM {
    private static Scanner scanner = new Scanner(System.in);
    private static int pinNumber = 123; /* data from db */
    private static int balance = 1_000;
    private static int action;
    private static DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
    private static int preciousTransction;
    private static HashMap<Integer,String>transactionMap=new HashMap<Integer,String>();
    private static int id=1;

    public static void main(String[] args) {
        for(int x=1; x<=3; x++) {
                System.out.print("enter your pin number: ");
            int pin = scanner.nextInt();

            if(pin == pinNumber) {
                menu();
                break;
            } else {
                if(x == 3)
                    System.out.println("Incorrectly your pin numer is 3 times and remove your card.");
                else
                    System.out.println("Invalid your pin number! Please try again.");
            }
        }
    }

    public static void menu() {
        do {
            System.out.println("-- ATM --");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Transaction");
            System.out.println("5 - Print");
            System.out.println("6 - Exit");

            System.out.print("choose action: ");
            action = scanner.nextInt();

            line();
            // PROCESS
            switch(action){
            case 1: balance();break;
            case 2: deposit();break;
            case 3: withdraw();break;
            case 4:transaction();break;
            case 5:print();break;
            case 6: exit();break;
            }
            line();
        } while( action != 6 );
  }
        public static void line(){
            for (int x=0;x<60 ;x++ ) {
                System.out.print("=");
            }
            System.out.print("\n");
    }
    public static void exit(){
        System.out.println("Thank You");
    }
    public static void balance(){
        System.out.println("The current balance:$"+ decimalFormat.format(balance));
    }
    public static void deposit(){
        System.out.print("Enter amount to deposit:");
        int deposit= scanner.nextInt();

        balance += deposit;
        preciousTransction = deposit;

        System.out.println("DATE:"+getDate());
        System.out.println("TIME:"+getTime()+"\n");
        System.out.println("Your money has been successfull deposited.\n");
        String temp= id+"\t\tdeposit\t\t"+deposit+ "\t\t"+getDate()+ "t\t"+getTime();
        transactionMap.put(id,temp);
        id++;
        // System.out.println(transactionMap);

        balance();
    }
    public static void withdraw(){
        System.out.print("Enter amount to withdraw:");
        int withdraw = scanner.nextInt();

        if (withdraw>balance) {
            System.out.println("\nYour balance is insufficient!");
        }else{
            balance-=withdraw;
            preciousTransction= -withdraw;

             System.out.println("DATE:"+getDate());
             System.out.println("TIME:"+getTime()+"\n");

            System.out.println("Please collect your money$"+withdraw+"and enjoy\n");

            String temp= id+"\t\twithdraw\t\t(-)"+withdraw+ "\t\t"+getDate()+ "t\t"+getTime();
        transactionMap.put(id,temp);
        id++;
            balance();
        }
    }
    public static void transaction(){
        if (preciousTransction>0) 
            
        
        System.out.println("Deposited:"+preciousTransction);
        else if(preciousTransction>0)
            System.out.println("withdraw:"+ preciousTransction);
        else
            System.out.println("No transaction!");
    }
    public static void print(){
        try{
            FileWriter fileWriter= new FileWriter("transaction.txt");

            fileWriter.write("--ATM TRANSACTION--");
            fileWriter.write("\n\n");

            fileWriter.write("DATE:"+getDate()+"\n");
            fileWriter.write("TIME:"+getTime()+"\n\n");

            fileWriter.write("Your Balance:$"+decimalFormat.format(balance));
            fileWriter.write("\n\n");

            fileWriter.write("ID\t\tType\t\tMoney\t\tDate\t\tTime\n");

            for(String value:transactionMap.values()){
                fileWriter.write(value+"\n");
            }

            fileWriter.close();
            System.out.println("successfull print file.");
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static String getDate(){
        LocalDate localDate= LocalDate.now();
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return localDate.format(dateTimeFormatter);
    }
    public static String getTime(){
        LocalTime localTime=LocalTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("HH:mm a");

        return localTime.format(dateTimeFormatter);
    }
}
