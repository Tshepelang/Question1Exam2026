package unitTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class unittest {
    Product Product;

    public class ProductTest {
        private Product product;

        @Before
        public void setUp() {
            String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
            int[][] sales = {{25, 18, 20}, {15, 10, 12}, {18, 15, 20}};
            product = new Product(names, sales);
        }
        @Test
        public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
            assertEquals(153, product.GetTotalProductsSold());
        }
        @Test
        public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
            assertEquals(17.0, product.GetAverageProductSold(), 0.001);
        }
    }
}
