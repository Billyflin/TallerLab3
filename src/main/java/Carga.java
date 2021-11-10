import java.util.ArrayList;
import java.util.Scanner;

public class Carga {

    private final ArrayList<Pack> packs= new ArrayList<>();
    private int Packs;
    Scanner sc=new Scanner(System.in);


    public int getPacks() {
        return Packs;
    }
    public int getPacksCompletos(){
        int count=0;
        for (Pack p:packs
             ) {
            if(p.productos.size()%20==1){
                count++;
            }
        }
        return count;
    }
    public int calcularPorPaquetes(){
        return (int) (getPacksCompletos()*100.000);
    }

    public boolean isCargable(){
        return Packs > 5&&Pack.isPackeable();
    }


    public Pack getPack() {
        for (Pack p:packs
             ) {
            if(isCargable()){
            packs.indexOf(p);}
        }
        int index=sc.nextInt();
        return packs.get(index);
    }

    public void agregarProducto(Pack pack,Producto producto){
        if(isCargable()){
            pack.agregarProducto(producto);
        }
    }


}
