import java.util.ArrayList;

public class Pack {
    protected static ArrayList<Producto> productos = new ArrayList<>();
    public static boolean isPackeable(){
        return productos.size()>20;
    }
    public static void agregarProducto(Producto producto){
        if (isPackeable())
                productos.add(producto);
    }
    public void agregarPack(){
        for (int i = 0; i < 20; i++) {
            productos.add(new Producto("cocacola","uwu"));
        }
    }

}
