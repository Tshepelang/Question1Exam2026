public class PrintProduct {
    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void PrintHeader(int year) {
        System.out.println("PRODUCT SALES REPORT - " + year);
        System.out.println();
        System.out.println("*".repeat(50));
        System.out.println();
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
