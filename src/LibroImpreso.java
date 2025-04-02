public class LibroImpreso extends Libro{
    private double peso;

    public LibroImpreso(){

    }

    public LibroImpreso(String titulo, String autor, double precio, double peso) {
        super(titulo, autor, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeso= " + peso + " kg";
    }
}
