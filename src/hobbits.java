
public class hobbits extends heroes {

    private static int contadorInstancias;

    public static int getInstancias() {
        return hobbits.contadorInstancias;
    }

    public hobbits(String nombre) {
        super(200, 40, nombre);
        hobbits.contadorInstancias++;
    }

    @Override
    public void saludar() {
        System.out.println("Soy Hobbit y mi nombre es  " + this.nombre);
    }

}
