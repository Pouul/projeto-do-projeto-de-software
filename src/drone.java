package src

public class Drone{
    private int Id_drone;
    private String Status_Drone;
    private int Status_de_bateria;
    private int capacidade;

    public Drone(int Id_drone, String Status_Drone, int Status_de_bateria, int capacidade){
        this.Id_drone = Id_drone;
        this.Status_Drone = Status_Drone;
        this.Status_de_bateria = Status_de_bateria;
        this.capacidade = capacidade;
    }
}
