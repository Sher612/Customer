import java.util.Scanner;

public class Customer {
    String[] customers = new String[5];
    Scanner input = new Scanner(System.in);
    public void inputCustomerData() {
        String str1;
        String str2;
        for(int i=0; i< customers.length; i++) {
            do {
                System.out.print("Enter customer first name: ");
                str1= input.nextLine();
                System.out.print("Enter customer last name: ");
                str2= input.nextLine();
                if(str1.isEmpty()||str2.isEmpty())
                System.out.println("First name and last name can not be empty");
            }
            while(str1.isEmpty()||str2.isEmpty());
            customers[i]= str1 + " " + str2;
        }
    }

    //method display customer data
    public void displayCustomerData() {
        for(String str: customers) {
            System.out.println(str);
        }
    }

}
