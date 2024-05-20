import java.util.ArrayList;

public class Main {
        public static void main(String[]args){
            User guest1 = new User("lsobota@gmail.com");
            User guest2 = new User("miki@gmail.com");
            User user1 = new User("Adam", "Dzewiecki", "drzewo@gmail.com", "drzewo11");
            guest2.guestToUser("Miki", "Galecki", "24513");
            Product p1 = new Product("Milk", 10, "100090392", 2);
            Product p2 = new Product("Water", 2, "2347586");
            Product p3 = new Product("Bar", 3, "347654738", 10);
            p2.changePrice(3);
            p3.changeNumOfPieces(15);
            Category c1 = new Category();
            Category c2 = new Category("Diary");
            Category c3 = new Category("Most Valuable", new ArrayList<Product>());
            c1.addToCategory(p1);
            c2.addToCategory(p2);
            c3.addToCategory(p3);
            ShoppingCart s1 = new ShoppingCart();
            ShoppingCart s2 = new ShoppingCart(guest2);
            ShoppingCart s3 = new ShoppingCart(user1, new ArrayList<Product>());
            s1.addToShoppingCart(p1);
            s1.addToShoppingCart(p3);
            s2.addToShoppingCart(p1);
            s2.addToShoppingCart(p3);
            s2.removeFromShoppingCart(p1);
            s1.pay();
            s2.pay();
        }
    }
