public class Velero extends Embarcacion implements Validacion {
    private int mastiles;
    public Velero(Capitan capitan, double precioBa, double valorAd, int anioFab, double eslora, int mastiles) {
        super(capitan, precioBa, valorAd, anioFab, eslora);
        this.mastiles = mastiles;
    }

    public boolean validar() {
        return mastiles > 4;
    }
}