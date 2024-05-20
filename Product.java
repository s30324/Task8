public class Product {
    private String name;
    private double price;
    private String prodCode;
    private int numOfPieces;
    public Product(String name, double price, String prodCode) {
        this.name = name;
        this.price = price;
        this.prodCode = prodCode;
        this.numOfPieces = 0;
    }
    public Product(String name, double price, String prodCode, int numOfPieces) {
        this.name = name;
        this.price = price;
        this.prodCode = prodCode;
        this.numOfPieces = numOfPieces;
    }
    public double changePrice(double price){
        this.price = price;
        return price;
    }
    public int changeNumOfPieces(int numOfPieces){
        this.numOfPieces = numOfPieces;
        if (numOfPieces < 0) {
            throw new IllegalArgumentException("Number of pieces cannot be smaller than 0");
        }
        return numOfPieces;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getProdCode() {
        return prodCode;
    }
    public int getNumOfPieces() {
        return numOfPieces;
    }
}
