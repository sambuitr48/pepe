package filter;

public class Empleado {
    private Integer id;
    private String nombre;
    private int salario;
    private String cargo;

    public Empleado(Integer id, String nombre, int salario, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
