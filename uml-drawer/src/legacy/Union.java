package legacy;


public class Union {
    private int idActor;
    private int idCasoDeUso;

    public Union(int idActor, int idCasoDeUso) {
        this.idActor = idActor;
        this.idCasoDeUso = idCasoDeUso;
    }

    public int getIdActor() {
        return idActor;
    }

    public int getIdCasoDeUso() {
        return idCasoDeUso;
    }

    @Override
    public String toString() {
        return "Union{" + "idActor=" + idActor + ", idCasoDeUso=" + idCasoDeUso + '}';
    }

    
    
}
