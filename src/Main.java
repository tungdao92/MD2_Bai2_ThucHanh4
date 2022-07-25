import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("nhập 1 để vẽ tam giác");
            System.out.println("Nhập 2 để vẽ hính vuông");
            System.out.println("Nhập 3 để vẽ hình chữ nhật");
            System.out.println("Nhập 0 để thoát");
            System.out.println("Nhập lựa chọn");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("*");
                    System.out.println("**");
                    System.out.println("***");
                    System.out.println("****");
                    System.out.println("*****");
                    System.out.println("*******");
                    break;
                case 2:
                    System.out.println("Vẽ hình vuông");
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    System.out.println("* * * *");
                    break;
                case 3:
                    System.out.println("Vẽ hình chữ nhật");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }

    }
}
