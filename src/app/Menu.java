package app;

/**
 * ShowMenu
 */
public class Menu extends Items {

    public Menu() {

    }

    public void menu() {

        String userChoice = "_";

        while (!userChoice.equals("0")) {

            System.out.println("Choose your action: ");
            System.out.println("1) Add income ");
            System.out.println("2) Add purchase ");
            System.out.println("3) Show list of purchases ");
            System.out.println("4) Balance ");
            System.out.println("0) Exit ");

            userChoice = in.nextLine();

            switch (userChoice) {

            case "0":

                break;

            case "1":
                System.out.print("\nEnter income: \n");
                userChoice = in.nextLine();

                setBalance(Double.parseDouble(userChoice));

                System.out.println("\nIncome was added!\n");

                break;
            case "2":
                System.out.print("\nEnter purchase name: \n");
                userChoice = in.nextLine();
                String key = userChoice;

                System.out.print("\nEnter its price:\n ");
                userChoice = in.nextLine();
                double value = Double.parseDouble(userChoice);

                list.put(key + " $", value);

                setList(list);
                System.out.println("\nPurchase was added!\n");

                break;
            case "3":
                if (getList().isEmpty()) {
                    System.out.println("\nPurchase list is empty\n");

                } else {
                    System.out.println("\n" + getList().toString().replaceAll("[{=}]", "").replace("", "") + "\n");
                }
                System.out.println("\nTotal sum: $" + sumList() + "\n");
                break;
            case "4":
                showBalance();
                break;
            default:
                System.out.println("\nPlease put a valid number (0 - 4) to pick an item from the list\n ");
                break;
            }
        }
        System.out.println("\nBye!\n");
    }

    public double sumList() {

        double sum = 0;
        for (Double d : getList().values()) {
            sum += d;

        }
        return sum;

    }

}