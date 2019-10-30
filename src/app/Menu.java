package app;

/**
 * ShowMenu
 */
public class Menu extends Items {
    String userChoice;

    public Menu() {
        userChoice = "_";
    }

    public void menu() {

        while (!userChoice.equals("0")) {
            showMenu();

            userChoice = in.nextLine();

            switch (userChoice) {

            case "0":

                break;

            case "1":
                addIncome();
                break;

            case "2":
                addPurchase();
                break;

            case "3":
                showListOfItems();
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

    public void addIncome() {

        System.out.print("\nEnter income: \n");
        userChoice = in.nextLine();

        setBalance(Double.parseDouble(userChoice));

        System.out.println("\nIncome was added!\n");

    }

    public void addPurchase() {

        System.out.print("\nEnter purchase name: \n");
        userChoice = in.nextLine();
        String key = userChoice;

        System.out.print("\nEnter its price:\n ");
        userChoice = in.nextLine();
        double value = Double.parseDouble(userChoice);

        list.put(key + " $", value);
        setList(list);
        balance -= value;
        System.out.println("\nPurchase was added!\n");

    }

    public void showListOfItems() {
        if (getList().isEmpty()) {
            System.out.println("\nPurchase list is empty\n");

        } else {
            System.out.println("\n" + getList().toString().replaceAll("[{=}]", "").replace("", "") + "\n");
        }
        System.out.println("\nTotal sum: $" + sumList() + "\n");

    }

    public void showMenu() {
        System.out.println("Choose your action: ");
        System.out.println("1) Add income ");
        System.out.println("2) Add purchase ");
        System.out.println("3) Show list of purchases ");
        System.out.println("4) Balance ");
        System.out.println("0) Exit ");

    }
}