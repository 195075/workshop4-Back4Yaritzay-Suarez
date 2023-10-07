public class Yate extends Embarcacion implements Validacion {
    private int camarotes;
    public Yate(Capitan capitan, double precioBa, double valorAd, int anioFab, double eslora, int camarotes) {
        super(capitan, precioBa, valorAd, anioFab, eslora);
        this.camarotes = camarotes;
    }

    public boolean validar() {
        return camarotes > 7;
    }
}