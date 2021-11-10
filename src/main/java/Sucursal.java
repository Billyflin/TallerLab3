import java.util.ArrayList;

public class Sucursal {
    private String SucursalId;
    private String Region;
    static ArrayList<Camion> camiones= new ArrayList<>();
    public static void showCamiones(){
        for (Camion c:camiones
             ) {
            c.toString();
        }
    }

    public static void agregarCamion(Camion camion){
        camiones.add(camion);
    }
    public static void eliminarCamion(){

    }
    public static Camion obtenerCamion(){
        for (Camion c:camiones
             ) {
            camiones.indexOf(c)
        ;}
        int index= init.validar(camiones.size());
        return camiones.get(index);
    }
}
