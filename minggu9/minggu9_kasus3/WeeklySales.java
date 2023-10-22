// package minggu9_kasus3;

// public class WeeklySales {
//     public static void main(String[] args) {
//         Salesperson[] salesStaff = new Salesperson[10];

//         salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
//         salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
//         salesStaff[2] = new Salesperson("James", "Jones", 3000);
//         salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
//         salesStaff[4] = new Salesperson("Don", "Trump", 1570);
//         salesStaff[5] = new Salesperson("Jane", "Black", 3000);
//         salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
//         salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
//         salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
//         salesStaff[9] = new Salesperson("Walt", "Smith", 3000);

//         Sorting.insertionSort(salesStaff);

//         System.out.println("\nRanking of Sales for the Week\n");
//         for (Salesperson s : salesStaff)
//             System.out.println(s);
//     }
// }
package minggu9_kasus3;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();

        Salesperson[] salesStaff = new Salesperson[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            scan.nextLine(); // Consume the newline character.
            System.out.println("\nEnter details for salesperson #" + (i + 1));
            System.out.print("First name: ");
            String firstName = scan.nextLine();
            System.out.print("Last name: ");
            String lastName = scan.nextLine();
            System.out.print("Total sales: ");
            int totalSales = scan.nextInt();
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
