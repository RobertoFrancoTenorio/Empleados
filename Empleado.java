abstract public class Empleado
{
    private float salario;
    private String nombre;
    
    public Empleado(float salario, String nombre)
    {
        this.salario=salario;
        this.nombre = nombre;
    }
    
    abstract public void muestraInfo();
    
    abstract public void calculaSalario();
}