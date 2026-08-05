package clearminds.cuentas;



public class Cuenta {

    private String id;
    private String tipo;
    private double saldo;
    
    // Constructor que recibe solo el ID
    public Cuenta(String id) {
        this.id = id;
        this.tipo = "A";
        this.saldo = 0;
    }

    // Constructor completo
    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }
    
}
    

   
