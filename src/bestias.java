public class bestias extends hpersonaje {
    
    private static int ataqueMaximo = 90;

    public bestias(int vida, int armadura, String nombre){
        super(vida, armadura, bestias.ataqueMaximo ,nombre, false);
    }

    @Override
    public int getAtaque(){
        return dados.tirarDado(0, bestias.ataqueMaximo , 1, true);
    }
    
}