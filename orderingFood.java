import java.util.Scanner;
public class orderingFood {
    
	int chicken_Biryani = 180;
    int Mutton_Biryani = 350;
    int veg_Biryani = 130;
    int egg_Biryani = 100;
    int Chettinad_Biryani = 160;
    int Dindigul_Biryani = 190;
    int coldrink = 40;
    int ch;
    int quantity;
    static int total;
    String again;

    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           1.chicken_Biryani       180/-");
        System.out.println("           2.Mutton_Biryani        350/-");
        System.out.println("           3.veg_Biryani           130/-");
        System.out.println("           4.egg_Biryani           100/- ");
        System.out.println("           5.Chettinad_Biryani     160/-");
        System.out.println("           6.Dindigul_Biryani      190/-");
        System.out.println("           7.coldrink              40/- ");
        System.out.println("           8.Exit                       ");
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }
    public void generateBill()
    {
        System.out.println();
        System.out.println("***************** Thankyou for ordering ******************");
        System.out.println("****************Your Bill is : " +total+"*****************");
    }
    public void order() {
        while (true) {
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:// French Fries
                    System.out.println("You have Selected chicken_Biryani");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity *chicken_Biryani ;

                    break;

                case 2:// Burger
                    System.out.println("You have Selected  Mutton_Biryani");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * Mutton_Biryani;

                    break;

                case 3:// Pastry
                    System.out.println("You have Selected veg_Biryani");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * veg_Biryani;

                    break;
                case 4:// Cold Drinks
                    System.out.println("You have Selected egg_Biryani");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * egg_Biryani;

                    break;
                case 5:// Cold Coffee
                    System.out.println("You have Selected Chettinad_Biryani");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * Chettinad_Biryani;

                    break;

                case 6:// Pizza
                    System.out.println("You have Selected Dindigul_Biryani");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * Dindigul_Biryani;

                    break;

                case 7:// Iced Tea
                    System.out.println("You have Selected coldrink");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * coldrink;

                    break;

                case 8:// exit
                    System.exit(1);
                    break;

                default:
                    break;
            }
            System.out.println();
            System.out.print("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            {order();}
            else if(again.equalsIgnoreCase("N"))
            {generateBill();
            System.exit(1);}
            else{System.out.println("Invalid Choice");}
        }
    }
}

