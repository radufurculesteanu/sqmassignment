public class Masina {

    private String model;
    private double pret;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) throws Exception {
        if (pret >= 0) {
            this.pret = pret;
        } else {
            throw new Exception("Pret must not be a negative value!");
        }
    }

    public Masina() {
        this.model = "";
        this.pret = 0;
    }

    public Masina(String model, double pret) {
        super();
        this.model = model;
        this.pret = pret;
    }

}
