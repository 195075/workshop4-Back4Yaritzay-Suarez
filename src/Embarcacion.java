public class Embarcacion {
    protected Capitan[] capitan;
    protected double precioBa;
    protected double valorAd;
    protected int anioFab;
    protected double eslora;

    public Embarcacion(Capitan capitan, double precioBa, double valorAd, int anioFab, double eslora) {
        this.capitan = new Capitan[]{capitan};
        this.precioBa = precioBa;
        this.valorAd = valorAd;
        this.anioFab = anioFab;
        this.eslora = eslora;
    }

    public double calcularAlquiler() {
        double monto = precioBa;
        if (anioFab > 2020) {
            monto += valorAd;
        }
        return monto;
    }
}
