public class Product implements IProduct {
    private final String[] names;
    private final int[][] sales;

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] productSales : sales)
            for (int monthSales : productSales)
                total += monthSales;
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int[] productSales : sales) count += productSales.length;
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0, bestTotal = -1;
        for (int row = 0; row < sales.length; row++) {
            int productTotal = 0;
            for (int monthSales : sales[row]) productTotal += monthSales;
            if (productTotal > bestTotal) {
                bestTotal = productTotal;
                bestIndex = row;
            }
        }
        return names[bestIndex] + "(" + bestTotal + ")";
    }
}
