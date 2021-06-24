
public class hpersonaje {

    protected int vida;
    protected int armadura;
    protected int ataque;
    protected String nombre;
    protected boolean esHeroe;

    private static int instanciashpersonajes;

    public hpersonaje(int vida, int armadura, int ataque, String nombre, boolean esHeroe) {
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
        this.nombre = nombre;
        this.esHeroe = esHeroe;
        instanciashpersonajes++;
    }

    public int obtenerArmadura(hpersonaje atacante) {
        return this.getArmadura();
    }

    public int obtenerAtaque(hpersonaje defensor) {
        return this.getAtaque();
    }

    public void recibirAtaque(hpersonaje atacante) {
        System.out.println(" " + atacante.getNombre() + " ataca a " + this.getNombre());

        int danyoRecibido = this.obtenerArmadura(atacante) - atacante.obtenerAtaque(this);
        if (danyoRecibido <= 0) {
            this.vida += danyoRecibido;
        } else {
            danyoRecibido = 0;
        }
        System.out.println(" " + atacante.getNombre() + " ataco a  " + this.getNombre() + " daños: " + danyoRecibido
                + " vida que le queda: " + this.getVida());
    }

    public void saludar() {
        System.out.println("Hola soy " + this.nombre);
    }

    public int getVida() {
        return this.vida;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getArmadura() {
        return this.armadura;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean get() {
        return this.esHeroe;
    }

    public static int getInstancias() {
        return hpersonaje.instanciashpersonajes;
    }

}