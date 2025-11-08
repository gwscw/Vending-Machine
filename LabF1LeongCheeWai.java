import java.util.Scanner;
public class LabF1LeongCheeWai{
    static Scanner scanner=new Scanner(System.in);
    static double balance;
    static double AmountInserted;
    static double total;
    static String receiptItem="\tReceipt\n------------------------\n";
    static void printMenu(){
        if(balance >=0.8){
        if(balance>=1.8){
            System.out.println("1)Coca Cola\tRM1.8");
        }
        if(balance>=1){
            System.out.println("2)Mineral Water\tRM1.0");
        }
        if(balance>=2){
            System.out.println("3)Soybean\tRM2.0");
        }
        if(balance>=3.5){
            System.out.println("4)Nescafe Coffe\tRM3.5");
        }
        if(balance>=3.8){
            System.out.println("5)Potato Chips\tRM3.8");
        }
        if(balance>=4.2){
            System.out.println("6)Snickers\tRM4.2");
        }
        if(balance>=0.8){
            System.out.println("7)Twistie1s\tRm0.8");
        }
        System.out.println("8)Exit");
    }else
        System.out.println("Not Enough Money.See you again!");
    }
    static void purchase(){
        int selection;
        while(balance>=0.8){
        if(balance>=0.8){
        System.out.println("Enter your selection:");
        selection = scanner.nextInt();
        if(selection>=1&&selection<=8){
        switch(selection){
            case 1:if(balance>=1.8){receiptItem+="Coca-Cola\t RM1.8\n";balance-=1.8;}break;
            case 2:if(balance>=1.0){receiptItem+="Mineral Water\t RM1.0\n";balance-=1.0;}break;
            case 3:if(balance>=2.0){receiptItem+="Soybean\t\t RM2.0\n";balance-=2.0;}break;
            case 4:if(balance>=3.5){receiptItem+="Nescafe\t RM3.5 Coffee\n";balance-=3.5;}break;
            case 5:if(balance>=3.8){receiptItem+="Potato Chips\t RM3.8\n";balance-=3.8;}break;
            case 6:if(balance>=4.2){receiptItem+="Snickers\t RM4.2\n";balance-=4.2;}break;
            case 7:if(balance>=0.8){receiptItem+="Twisties\t RM0.8\n";balance-=0.8;}break;
            case 8:printReceipt();return;
        }
        System.out.println("You want continue to purchase?(Y/N)");
        String input=scanner.next();
        char c=input.charAt(0);
        if(c=='Y'||c=='y'){
        printMenu();
        }
        else if(c=='N'||c=='n'){
        System.out.println("Thanks for Purchase!");
        printReceipt();
        return;
        }
        else{
        System.out.println("Wrong Enter try again!");
        return;
        } 
        
    }
    else{
        System.out.println("Wrong selection please try again!");
        return;
    }
    }
    }
    printReceipt();
    }

    static void printReceipt(){
        System.out.println("------------------------");
        System.out.println(receiptItem);
        System.out.println("------------------------");
        System.out.printf("Total:\t\t  RM%.2f",(AmountInserted-balance));
        System.out.printf("\nBalance:\t  RM%.2f",balance);
        System.out.printf("\nAmount inserted:  RM%.2f",AmountInserted);
        System.out.println("\n------------------------");
    }

    public static void main(String[] agrs){
    System.out.print("Enter your balance:");
    balance = scanner.nextDouble();
    if(balance>=0){
    AmountInserted = balance;
    printMenu();
    purchase();
    }else
    System.out.println("See you again!");
    }
}


