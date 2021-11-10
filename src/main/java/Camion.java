import java.util.Scanner;

public class Camion {

    private final String Id;
    private final String Patent;
    private final String Description;
    private boolean State;
    private Flete flete;

    public Camion(String id, String patent, String description) {
        Id = id;
        Patent = patent;
        Description = description;
        State = false;
        flete= null;
    }

    public Flete getFlete() {
        return flete;
    }

    public void setFlete(Flete flete) {
        this.flete = flete;
    }

    public void setState(boolean state) {
        State = state;
    }
    public static Camion crearCamion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id del camion:");
        String id =scanner.next();
        System.out.println("Patente:");
        String patente =scanner.next();
        System.out.println("Descripcion:");
        String description =scanner.next();
        return new Camion(id,patente,description);

    }

    public String getId() {
        return Id;
    }

    public String getPatent() {
        return Patent;
    }

    public String getDescription() {
        return Description;
    }

    public boolean isState() {
        return State;
    }
    public String getState(){
        if(isState()){
            return "on service";
        }
        return "out of service";
    }

    @Override
    public String toString() {
        return "Camion{" +
                "Id='" + Id + '\'' +
                ", Patent='" + Patent + '\'' +
                ", Description='" + Description + '\'' +
                ", State=" + State +
                ", flete=" + flete +
                '}';
    }
}
