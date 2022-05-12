package recursoTema4Refactorizar;

/**
 * 
 * @author DanielOrtizVega
 *
 */


public class CCuenta {

//declaramos variables
    String nombre;
    String cuenta;
    double saldo;
    double tipoInteres;


    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    
    
    //creamos un metodo operativacuenta
    public void operativa_cuenta(String nom)
    {
    	float operativa_cuenta;
   // 	double resultado = Main.main();
    }


    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    

    public String obtenerNombre()
    {
        return getNombre();
    }


    public double estado()
    {
        return saldo;
    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }


    public String obtenerCuenta()
    {
        return cuenta;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInteres() {
        return tipoInteres;
    }


    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
