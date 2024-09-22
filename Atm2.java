import java.util.Scanner;

class Atm2 {

    public static void main(String[] args) {
        // to set the pin
        Scanner sc = new Scanner(System.in);
        String stringPin;
        System.out.println("set your 4 digit pin");
        int pin = sc.nextInt();
        stringPin = Integer.toString(pin);

     
          System.out.println("\t\t\t\t\tWELCOME TO ATM\n");
          float balance = 0.00f;
          int a = 1;
          while (a == 1 ) {

              System.out.println("CHOOSE THE SERVICES FROM BELOW");
              System.out.println(" 1.BALANCE ENQUARY\n 2.DEPOSIT\n 3.BANK TRANSFER\n 4.WITHDRAW\n 5.EXIT");

              int amount = 0;
              int Withdraw = 0;

              int input = sc.nextInt();

              switch (input) {
                  case 1: {
                      System.out.println("Enter your pin");
                      int epin = sc.nextInt();
                      String stringEpin = Integer.toString(epin);

                      if (stringEpin.equals(stringPin)) {

                          System.out.println("Current Balance : " + balance + "\n");

                      } else {

                          System.out.println("INCORRECT PIN\n\n");

                      }

                  }
                      break;

                  case 2: {
                      System.out.println("\t\t\t\t\t\t\\DEPOSIT\n");
                      System.out.print("Enter Your Account Type");
                      System.out.println("\t\t\t 1.CURRNET ACCOUNT \t\t\t 2.SAVINGS ACCOUNT");
                      int accontType = sc.nextInt();
                      switch (accontType) {
                          case 1: {
                              System.out.println("\t\t\t CURRENT ACCOUNT");
                              System.out.println("Enter Amount To Add");
                              amount = sc.nextInt();
                              balance = balance + amount;
                              System.out.println("In process...");
                              System.out.println("Amount Added Sucessfully...");
                              System.out.println("Total Amount: " + balance + "\n\n");
                          }
                              break;
                          case 2: {
                              System.out.println("\t\t\t SAVINGS ACCOUNT");
                              System.out.println("Enter Amount To Add\n");
                              amount = sc.nextInt();
                              balance += amount;
                              System.out.println("In process...");
                              System.out.println("Amount Added Sucessfully...");
                              System.out.println("Total Amount: " + balance + "\n\n");

                          }
                              break;

                          default: {
                              System.out.println("IN CORRECT TYPE OF ACCOUNT\n\n");
                          }
                              break;
                      }

                  }
                      break;

                  case 3: {
                      System.out.println("In development stage....\n\n");

                  }
                      break;
                  case 4: {
                      System.out.println("Enter Amount To Withdraw");
                      Withdraw = sc.nextInt();

                      if (Withdraw <= balance) {
                          balance -= Withdraw;
                          System.out.println("Withdrawn Sucessfully completd..\n");
                          System.out.println("Remaining Balance: " + balance + "\n");
                      } else {
                          System.out.println("Insuffecnt Balance\n");
                      }

                  }
                      break;

                  case 5: {
                      System.out.println("\t\t\t\t\t\t\t\t\"THANK YOU\"");
                      a = 2;

                  }
                      break;

                  default: {
                      System.out.println("\t\t\t\tENTER CORRECT OPTION");
                      sc.close();
                  }
                      break;

              }

          }
      
    }

}
