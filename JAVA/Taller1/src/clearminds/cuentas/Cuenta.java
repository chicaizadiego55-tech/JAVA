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
    
    // Solo Getter para id
    public String getId() {
        return id;
    }

    // Getter y Setter para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter y Setter para saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método imprimir
    public void imprimir() {

        System.out.println("************************");
        System.out.println("CUENTA");
        System.out.println("************************");
        System.out.println("Número de Cuenta: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: USD " + saldo);
        System.out.println("************************");
    }

    // Método personalizado
    public void imprimirConMiEstilo() {

        System.out.println("===============================");
        System.out.println("      INFORMACIÓN CUENTA");
        System.out.println("===============================");
        System.out.println("ID      : " + id);
        System.out.println("TIPO    : " + tipo);
        System.out.println("SALDO   : USD " + saldo);
        System.out.println("===============================");
    }

    
}
    

   
