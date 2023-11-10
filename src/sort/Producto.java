package sort;

public class Producto {
    private String comida;
    private int precio;

    public Producto(String comida, int precio) {
        this.comida = comida;
        this.precio = precio;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
