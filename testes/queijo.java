public class queijo {
    private String tipo;
    private double peso; // em gramas

    public queijo(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}