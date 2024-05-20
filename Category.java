import java.util.ArrayList;

public class Category {
    private String nameOfCategory;
    private ArrayList<Product> listOfProducts = new ArrayList<>();
    public Category(){};
    public Category(String nameOfCategory){
        this.nameOfCategory = nameOfCategory;
    }
    public Category(String nameOfCategory, ArrayList<Product> listOfProducts) {
        this.nameOfCategory = nameOfCategory;
        this.listOfProducts = listOfProducts;
    }
    public void addToCategory(Product product){
        listOfProducts.add(product);
    }
    public void removeFromCategory(Product product){
        listOfProducts.remove(product);
    }
    public String getNameOfCategory() {
        return nameOfCategory;
    }
    public ArrayList<Product> getListOfProducts() {
        return listOfProducts;
    }
}
