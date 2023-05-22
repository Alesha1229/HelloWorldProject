package classwork.c16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OrderExample {
    public static void main(String[] args) {


        List<Order> orders = getOrders();
        var result = orders.stream()
                .filter(isOrderWithEggs())
                .toList();
        System.out.println(result);

        var products = orders.stream()
                .flatMap(order -> order          // flatmap соеденяет несколько потоков в 1
                        .getProducts()
                        .stream())
                .distinct()
                .map(Product::getProductName)
                .toList();
        System.out.println(products);

    }

    private static Predicate<Order> isOrderWithEggs() {
        return order -> order
                .getProducts()
                .stream()
                .anyMatch(containsEggs());
    }

    private static Predicate<Product> containsEggs() {
        return product -> product
                .getProductName()
                .equals("Eggs");
    }

    private static List<Order> getOrders() {
        List<Product> firstProducts = getFirstProducts();

        List<Product> secondProducts = getSecondProducts();

        List<Product> thirdProducts = getThirdProducts();
        return Arrays.asList(new Order(1, firstProducts),
                new Order(2, secondProducts),
                new Order(3, thirdProducts));
    }

    private static List<Product> getThirdProducts() {
        List<Product> thirdProducts = Arrays.asList(
                new Product("Beer",50),
                new Product("Cola",30),
                new Product("Sprite",25));
        return thirdProducts;
    }

    private static List<Product> getSecondProducts() {
        List<Product> secondProducts = Arrays.asList(
                new Product("Bread",11),
                new Product("Eggs",26),
                new Product("Milk",15));
        return secondProducts;
    }

    private static List<Product> getFirstProducts() {
        List<Product> firstProducts = Arrays.asList(
                new Product("Milk",15),
                new Product("Ice-cream",30),
                new Product("Chocolate",40));
        return firstProducts;
    }
}
