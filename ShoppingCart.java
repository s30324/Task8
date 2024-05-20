import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> productsInCart = new ArrayList<>();
    private User userAccount;
    public ShoppingCart(){};
    public ShoppingCart(User userAccount){
        this.userAccount=userAccount;
    }
    public ShoppingCart(User userAccount, ArrayList<Product> productsInCart){
        this.userAccount=userAccount;
        this.productsInCart=productsInCart;
    }
    public void addToShoppingCart(Product product){
        if(product.getNumOfPieces() <= 0){
            throw new IllegalArgumentException("Product already sold out");
        }
        productsInCart.add(product);
        product.changeNumOfPieces(product.getNumOfPieces()-1);
    }
    public void removeFromShoppingCart(Product product){
        if(productsInCart == null){
            throw new IllegalArgumentException("Shopping Cart is empty");
        }
        productsInCart.remove(product);
        product.changeNumOfPieces(product.getNumOfPieces()+1);
    }
    public double pay(){
        double toBePaid = 0.0;
        for(Product p : productsInCart){
            toBePaid += p.getPrice();
        }
        System.out.println("U need to pay "+toBePaid);
        return toBePaid;
    }
    public ArrayList<Product> getProductsInCart() {
        return productsInCart;
    }
    public User getUserAccount() {
        return userAccount;
    }
}
