//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
    int months = 3;
    int[][] sales = new int[names.length][months];

    Scanner input = new Scanner(System.in);
            for (int row = 0; row < names.length; row++) {
                for (int col = 0; col < months; col++) {
                    System.out.print("Enter number of sales for month " + (col + 1) + " for " + names[row] + " mattress: ");
                    sales[row][col] = input.nextInt();
                }
                System.out.println();
            }

            PrintProduct printer = new PrintProduct(new Product(names, sales));
            System.out.println();
            printer.PrintHeader(2026);
            printer.PrintTotalProductSales();
            printer.PrintAverageProductSales();
            printer.PrintMostPopularProduct();
            input.close();


}
