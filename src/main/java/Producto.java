public class Producto {
    private String ProductCode;
    private String ProductTipe;

    public Producto(String productCode, String productTipe) {
        ProductCode = productCode;
        ProductTipe = productTipe;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public String getProductTipe() {
        return ProductTipe;
    }
}
