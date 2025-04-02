public class LibroDigital extends Libro {
    private int tamanioArchivo;

    public LibroDigital() {
    }

    public LibroDigital(String titulo, String autor, double precio, int tamanioArchivo) {
        super(titulo, autor, precio);
        this.tamanioArchivo = tamanioArchivo;
    }

    public int getTamanioArchivo() {
        return tamanioArchivo;
    }

    public void setTamanioArchivo(int tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTamaño Archivo= " + tamanioArchivo;
    }
}