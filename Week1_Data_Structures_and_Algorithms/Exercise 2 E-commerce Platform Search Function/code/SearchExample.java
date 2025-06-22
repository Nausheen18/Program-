import java.util.*;

class Product {
    int id;
    String name;
    String category;
    double price;

    Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name.toLowerCase();
        this.category = category.toLowerCase();
        this.price = price;
    }

    void display() {
        System.out.println("[" + id + "] " + name + " (" + category + ") - ₹" + price);
    }
}

public class SearchExample {
    public static void main(String[] args) {
        // Sample product list
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Red Shirt", "Clothing", 499));
        products.add(new Product(2, "Blue Jeans", "Clothing", 999));
        products.add(new Product(3, "Smartphone", "Electronics", 15000));
        products.add(new Product(4, "Bluetooth Speaker", "Electronics", 1200));
        products.add(new Product(5, "Cooking Pan", "Kitchen", 799));

        // Search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine().toLowerCase();

        System.out.println("\n🔍 Search Results:");
        boolean found = false;
        for (Product p : products) {
            if (p.name.contains(keyword) || p.category.contains(keyword)) {
                p.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products matched your search.");
        }

        sc.close();
    }
}
