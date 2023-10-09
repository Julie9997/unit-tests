package seminars.first.hw;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */

    /*
    1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
    */
    @Test
    public void testGetProducts() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Mouse", 199));
        products.add(new Product("Keyboard", 599));
        products.add(new Product("Headphones", 350));

        shop.setProducts(products);

        List<Product> actualProducts = shop.getProducts();
        assertEquals(products.size(), actualProducts.size());
        assertTrue(actualProducts.containsAll(products));
    }

    /*
    2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
    */
    @Test
    public void testGetMostExpensiveProduct() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Mouse", 199));
        products.add(new Product("Keyboard", 599));
        products.add(new Product("Headphones", 350));

        shop.setProducts(products);

        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        assertEquals("Keyboard", mostExpensiveProduct.getTitle());
        assertEquals(599, mostExpensiveProduct.getCost());
    }

    /*
    3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
    */
    @Test
    public void testSortProductsByPrice() {
        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(new Product("Mouse", 199));
        products.add(new Product("Keyboard", 599));
        products.add(new Product("Headphones", 350));

        shop.setProducts(products);

        List<Product> sortedProducts = shop.getSortedListProducts();
        assertEquals(199,
                sortedProducts.get(0).getCost());
        assertEquals(350,
                sortedProducts.get(1).getCost());
        assertEquals(599,
                sortedProducts.get(2).getCost());
    }
}




